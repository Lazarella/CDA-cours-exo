

const apiUser = axios.create({
    baseURL:'http://localhost:8090/api/auth'
}); 

const services = {

CreateUser (data){
   return apiUser.post('/auth/register', data)
},

loginUser(data){
    return apiUser.post('login', data);
  },

 DeleteUser(id){
    return apiUser.delete('/delete', id,{headers: authHeader()}); 
},

 UpdateUser(data){

    return apiUser.update('/update',data, {headers: authHeader()}); 
},

 GetUserById(id) {
    return apiUser.get('getUser/{id}',id,{headers: authHeader()})
},

GetAllUsers(){
    return apiUser.get({headers: authHeader()})
}
}

export {api, services }; 