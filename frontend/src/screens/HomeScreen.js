import logo from '../logo.svg';
import '../App.css';
import axios from "axios";
import React, { useState, useEffect } from "react";
import { useMemo } from 'react';
import MaterialReactTable from 'material-react-table';
import Sidebar from '../components/Sidebar'
import Carousel from '../components/Carousel'
import Navbar from '../components/Navbar'
import Footers from '../components/Footers';
import AdminScreen from './AdminScreen';
import { BrowserRouter, Link, Route, Routes, Redirect,Switch } from 'react-router-dom';
export default function HomeScreen() {
  

  return (
    <div className="container">
      <Navbar></Navbar>
      <Carousel></Carousel>
      <Footers></Footers>
    </div>
  );
};