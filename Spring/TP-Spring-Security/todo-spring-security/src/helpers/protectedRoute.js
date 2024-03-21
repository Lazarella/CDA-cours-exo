const { Navigate } = require("react-router-dom");


const ProtectedRoute =({children})=>{

const userToken = localStorage.getItem("user");

const isLogged = !!userToken;

return isLogged? children : <Navigate to="/login" />

}
export {ProtectedRoute};