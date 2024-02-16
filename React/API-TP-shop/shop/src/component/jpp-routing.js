import { createBrowserRouter } from "react-router-dom";
import HomePage from "./home";
import Project from "./routes/Project";
import ErrorPage from "./routes/ErrorPage";


const router = createBrowserRouter([
    {
        path :"/",
        element : <HomePage />,
        errorElement : <ErrorPage />
    },
    // {
    //     path :"/projects/:monparams",
    //     element : <Project />,
    //     errorElement : <ErrorPage />
    // }
])

export default router