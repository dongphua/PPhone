import SidebarItem from "./SidebarItem"
import items from "./DataSidebar.json"
import React from 'react'
import ReactDOM from 'react-dom'
import "react-responsive-carousel/lib/styles/carousel.min.css"; // requires a loader
import { Carousel } from 'react-responsive-carousel';
import logo from '../imageproducts/iphone_13_pro.jpg';
import logo1 from '../imageproducts/xiaomi_redmi_note_11.jpg';
import logo2 from '../imageproducts/samsung_galaxy_note_20_ultra.jpg';
export default function Sidebar(){
    return (
        <Carousel>
        <div>
            <img src={logo}/>
            <p className="legend">Iphone 13 Pro</p>
        </div>
        <div>
            <img src={logo1} />
            <p className="legend">Xiaomi Redmi Note 11</p>
        </div>
        <div>
            <img src={logo2} />
            <p className="legend">Samsung Galaxy Note 20 Ultra</p>
        </div>
    </Carousel>
    )
}