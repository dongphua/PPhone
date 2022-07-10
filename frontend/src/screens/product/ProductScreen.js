import '../../App.css';
import axios from "axios";
import React, { useState, useEffect } from "react";
import {useNavigate} from "react-router-dom";
import { useMemo } from 'react';
import MaterialReactTable from 'material-react-table';
import Sidebar from '../../components/Sidebar'

export default function AdminScreen() {
  const [remoteData, setRemoteData] = useState([]);
  const [isLoading, setIsLoading] = useState(false);
  let navigate = useNavigate();
  useEffect(() => {
    const fetchData = async () => {
      setIsLoading(true);
      const response = await fetch(
        'http://localhost:8080/api/product',
      );
      const json = await response.json();
      setRemoteData(json);
      setIsLoading(false);
    };
    fetchData();
  }, []);

  const parsedData = useMemo(
    () =>
      remoteData.map((productData) => ({
        productId: productData.productId,
        productName: productData.productName,
      })) ?? [],
    [remoteData],
  );

  const columns = useMemo(
    () => [
      {
        header: 'ID',
        id: 'productId',
      },
      {
        header: 'Name',
        id: 'productName',
      },
  
    ],
    [],
  );

  return (
    <div className="container">

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
