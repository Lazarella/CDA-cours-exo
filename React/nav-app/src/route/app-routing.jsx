import { createBrowserRouter } from "react-router-dom"
// import App from "./App"
import ErrorPage from "./routes/errorPage"
import Home from "./home"
import ContactUs from "./contactUs"
import AboutUs from "./about"

const router = createBrowserRouter([
    {path :"/",
    element : <Home />,
    errorElement : <ErrorPage/>,
    children: [
        {
            path :"/contactus",
            element : <ContactUs/>
        },
        {
            path :"/aboutus",
            element : <AboutUs/>
        }
    ]},
    // {path :"/form",
    // element : <Form />,
    // errorElement : <ErrorPage/> }
])


export default router