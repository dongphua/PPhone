import '../../App.css';
import axios from "axios";
import React, { useState, useEffect } from "react";
import { useMemo } from 'react';
import MaterialReactTable from 'material-react-table';
import Sidebar from '../../components/Sidebar'

export default function AdminScreen() {
  const [remoteData, setRemoteData] = useState([]);
  const [isLoading, setIsLoading] = useState(false);

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
        header: 'ID',
        id: 'categoryId',
      },
      {
        header: 'Name',
        id: 'categoryName',
      },
  
    ],
    [],
  );

  return (
    <div className="container">
<h1>Category</h1>
    <MaterialReactTable
      columns={columns}
      data={parsedData}
      enableDensityToggle= {false}
      enableRowNumbers
      state={{
        isLoading,
      }} />
          </div>        
  );
};
