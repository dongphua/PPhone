import '../App.css';
import axios from "axios";
import React, { useState, useEffect, Fragment} from "react";
import { useMemo } from 'react';
import MaterialReactTable from 'material-react-table';
import Sidebar from '../components/Sidebar'
import CategoryScreen from "../screens/category/CategoryScreen"
import CategoryAddScreen from "../screens/category/CategoryAddScreen"
import { Link } from '@mui/material';
import { Routes, Router, Route} from 'react-router-dom';

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
 
    <div className="main">
    <Sidebar />
    <div className="container">
      <Routes>
       <Route  path="category" element={<CategoryScreen/>} />
       <Route  path="categoryadd" element={<CategoryAddScreen/>} />
      </Routes>
    </div>
    </div>


  );
};
