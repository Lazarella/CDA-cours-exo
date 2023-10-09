import { NavLink, Outlet } from "react-router-dom";



function Menu() {
return (
    <div >
        <header >
        <NavLink to="/">Home</NavLink>
        <NavLink to="/Contact Us">Contact Us</NavLink>
        <NavLink to="/Contact Us">About Us</NavLink>
        </header>
        <Outlet />
    </div>
    );
}

export default Menu