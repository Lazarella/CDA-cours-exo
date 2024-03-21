import { services } from "./apiUser";


const register = (name, email, password, roles) => {
    return services.CreateUser({ name, email, password,avatar, roles });
  };
  
  const login = (email, password) => {
    return services.loginUser({ email, password }).then((response) => {
      console.log(response.data.data)
      if (response.data.data.token) {
        localStorage.setItem('user', JSON.stringify(response.data));
        
      }
      return response.data;
    });
  };
  
  const logout = () => {
    localStorage.removeItem('user');
  };
  
  export default { register, login, logout };