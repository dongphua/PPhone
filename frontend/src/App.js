import logo from './logo.svg';
import './App.css';
import axios from "axios";
import React, { useState, useEffect } from "react";
import { useMemo } from 'react';
import MaterialReactTable from 'material-react-table';
import Sidebar from './components/Sidebar'
import Carousel from './components/Carousel'
import Navbar from './components/Navbar'
import Footers from './components/Footers';
import AdminScreen from './screens/AdminScreen';
import HomeScreen from './screens/HomeScreen';
import CategoryScreen from "./screens/category/CategoryScreen"
import { BrowserRouter, Link, Route, Routes, Redirect,Switch } from 'react-router-dom';
function App() {
  

  return (
    <div>
    <Routes>
          <Route path="/" element={<HomeScreen/>} />
          <Route path="/admin/*" element={<AdminScreen/> } />
    </Routes>
    </div>
  );
};

export default App;