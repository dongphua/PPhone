import '../../App.css';
import axios from "axios";
import React, { useState, useEffect  } from "react";
import {useNavigate} from "react-router-dom";
import { useMemo } from 'react';
import MaterialReactTable from 'material-react-table';
import Sidebar from '../../components/Sidebar'
import { useHistory } from 'react-router-dom';

export default function AdminScreen() {
  const [remoteData, setRemoteData] = useState([]);
  const [isLoading, setIsLoading] = useState(false);

  const [id, setId] = useState('');
  const [name, setName] = useState('');
  const [message, setMessage] = useState('');
  let resStatus;
  let navigate = useNavigate();
  const routeChange = () =>{ 
    let path = `/admin`; 
    navigate(path);
  }
  let handleSubmit = async (e) => {
    e.preventDefault();
    if (name.length===0){
        setMessage("Please fill all required fields");
    }
    else{
    try {
      let res = await fetch(`http://localhost:8080/api/category`, {
        method: 'POST',
        headers: {        'Content-Type': 'application/json',
        'Authorization': 'Bearer my-token',
        'My-Custom-Header': 'foobar'},
        body: JSON.stringify({
          categoryName: name
        })
      }).then(response => {
            resStatus = response.status;
      })
      if (resStatus === 200) {
        setName("");
        setMessage("Category created successfully");
        
      } else {
        setMessage("Some error occured");
      }
    } catch (err) {
      console.log(err);
    }
  }
};

  return (
    <div className="container">
       <form className="form" onSubmit={handleSubmit}>
        <div>
          <h1>Add category</h1>
        </div>
            <div>
            <div className="message">{message ? <p>{message}</p> : null}</div>
              <label htmlFor="name">Category name:(*)</label>
              <input
                id="name"
                type="text"
                placeholder="Category name"
                value={name}
                onChange={(e) => setName(e.target.value)}
              ></input>
            </div>
            <div>
              <label></label>
              <button type="submit" className="btn btn-primary">
                Add
              </button>
            </div>
      </form>
          </div>        
  );
};
