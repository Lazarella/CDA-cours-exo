import axios from "axios";


    const apiTodo = axios.create({
        baseURL:'http://localhost:8090/api/todo'
    }); 
    
    const servicesTodo = {

        CreateTodo (data){
           return apiTodo.post('/auth/register', data)
        },
        
        loginTodo(data){
            return apiTodo.post('login', data);
          },
        
         DeleteTodo(id){
            return apiTodo.delete('/delete', id,{headers: authHeader()}); 
        },
        
         UpdateTodo(data){
        
            return apiTodo.update('/update',data, {headers: authHeader()}); 
        },
        
         GetTodoById(id) {
            return apiTodo.get('getUser/{id}',id,{headers: authHeader()})
        },
        
        GetAllTodos(){
            return apiTodo.get({headers: authHeader()})
        }
        }


export { apiTodo, servicesTodo };