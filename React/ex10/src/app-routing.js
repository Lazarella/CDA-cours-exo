import { createBrowserRouter } from 'react-router-dom'
import ErrorPage from './routes/ErrorPage'
import Contact from './routes/Contact'
import ContactForm from './routes/ContactForm'
import Home from './routes/Home'

const router = createBrowserRouter([
{
    path : "/",
    element : <Home/>, 
    errorElement : <ErrorPage/>
}, 
{
    path : "/contact", 
    element : <Contact/>
},
{
    path : "/contact/form", 
    element : <ContactForm/>
},
])

export default router