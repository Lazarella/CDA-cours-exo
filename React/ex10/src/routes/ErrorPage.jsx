import { useRouteError} from 'react-router-dom'

const ErrorPage =()=> {
const error = useRouteError(); 
return (
    <>
    <h1>Oups! {error.status}</h1>
    <p>{error.data}</p>
    <img src="http://spittoon.co.uk/wp-content/uploads/2019/01/error-meme.jpg" alt="error" id="fryMeme" />
    </>
)
}

export default ErrorPage 