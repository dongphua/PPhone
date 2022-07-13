import '../../App.css';
import axios from "axios";
import React, { useState, useEffect  } from "react";
import {useNavigate, Link }from "react-router-dom";
import { useMemo } from 'react';
import MaterialReactTable from 'material-react-table';
import Sidebar from '../../components/Sidebar'
import { Button } from '@mui/material';

export default function AdminScreen() {
  const [remoteData, setRemoteData] = useState([]);
  const [isLoading, setIsLoading] = useState(false);
  let navigate = useNavigate();
  const routeChange = () =>{ 
    let path = `/admin/categoryadd`; 
    navigate(path);
  }
  useEffect(() => {
    const fetchData = async () => {
      setIsLoading(true);
      const response = await fetch(
        'http://localhost:8080/api/category',
      );
      const json = await response.json();
      setRemoteData(json);
      setIsLoading(false);
    };
    fetchData();
  }, []);

  const parsedData = useMemo(
    () =>
      remoteData.map((userData) => ({
        categoryId: userData.categoryId,
        categoryName: userData.categoryName,
      })) ?? [],
    [remoteData],
  );

  const columns = useMemo(
    () => [
      {
        header: 'Product ID',
        id: 'categoryId',
        enableEditing: false,
      },
      {
        header: 'Product Name',
        id: 'categoryName',
      },
    ],
    [],
  );

  return (
    <div className="container">
    <h1>Product</h1>
    <button type="button" className="btn btn-primary" onClick={routeChange}>Add Product</button>
    <MaterialReactTable
      columns={columns}
      data={parsedData}
      enableDensityToggle= {false}
      enableRowNumbers
      enableRowActions
      renderRowActions={({ row }) => (
      <div style={{ display: 'flex', flexWrap: 'nowrap', gap: '0.5rem' }}>
        <Button
          variant="contained"
          color="primary"
          onClick={() => {
            navigate(`/admin/categoryedit/${row.original.categoryId}`)}

          }
        >
          Edit
        </Button>
        </div>
        )}
      state={{
        isLoading,
      }} />
          </div>        
  );
};
