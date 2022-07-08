import SidebarItem from "./SidebarItem"
import items from "./DataSidebar.json"
import React from 'react'
import ReactDOM from 'react-dom'
import NavLink from 'react-bootstrap/NavLink';
export default function Sidebar(){
    return (
        <div className="sidebar">
            <div><h1>ADMIN</h1></div>
          { items.map((item, index) => <SidebarItem key={index} item={item} />) }
        </div>
    )
}