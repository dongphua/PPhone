import logo from './logo.svg';
import './App.css';
import axios from "axios";
import React, { useState, useEffect } from "react";
import { useMemo } from 'react';
import MaterialReactTable from 'material-react-table';
import Sidebar from './components/Sidebar'
import { Outlet, Link } from "react-router-dom";
import Carousel from './components/Carousel'
import Navbar from './components/Navbar'
import Footers from './components/Footers';
function App() {
  

  return (
    <div className="container">
      <Navbar></Navbar>
      <Carousel></Carousel>
      <Footers></Footers>
    </div>
  );
};

export default App;