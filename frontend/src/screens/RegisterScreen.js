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

  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [repeatPassword, setRepeatPassword] = useState('');
  const [message, setMessage] = useState('');
  let resStatus;
  let navigate = useNavigate();
  const routeChange = () =>{ 
    let path = `/admin`; 
    navigate(path);
  }
  let handleSubmit = async (e) => {
    e.preventDefault();
    if (email.length===0 || password.length===0){
        setMessage("Please fill all required fields");
    }
    else if (password !== repeatPassword){
        setMessage("Two password not match");
    } 
    else{
    try {
      let res = await fetch(`http://localhost:8080/api/category`, {
        method: 'POST',
        headers: {        'Content-Type': 'application/json',
        'Authorization': 'Bearer my-token',
        'My-Custom-Header': 'foobar'},
        body: JSON.stringify({
          email: email,
          password: password
        })
      }).then(response => {
            resStatus = response.status;
      })
      if (resStatus === 200) {
        setEmail("");
        setPassword("");
        setRepeatPassword("");
        setMessage("Register successfully");
        
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
          <h1>Register</h1>
        </div>
            <div>
            <div className="message">{message ? <p>{message}</p> : null}</div>
              <label htmlFor="name">Email:(*)</label>
              <input
                id="email"
                type="text"
                placeholder="Email"
                value={email}
                onChange={(e) => setEmail(e.target.value)}
              ></input>
                <label htmlFor="name">Password:(*)</label>
              <input
                id="password"
                type="password"
                placeholder="Password"
                value={password}
                onChange={(e) => setPassword(e.target.value)}
              ></input>
                <label htmlFor="name">Password:(*)</label>
              <input
                id="repeatPassword"
                type="password"
                placeholder="repeatPassword"
                value={password}
                onChange={(e) => setRepeatPassword(e.target.value)}
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
