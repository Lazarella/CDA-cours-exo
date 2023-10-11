import { NavLink, Outlet } from "react-router-dom";



function Menu() {
return (
    <div >
        <header >
        <h1>Mon Menu</h1>
        <NavLink to="/">Home</NavLink>
        <p>suite </p>
        <NavLink to="/contact">Contact</NavLink>
        </header>
        <Outlet />
        <p>Le plus rigolo des sites</p>
    </div>
    );
}

export default Menu