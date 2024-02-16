import { useEffect } from "react";
import { useRef } from "react";
import axios from 'axios';

const Form=()=>{

const titleInputRef = useRef(); 
const submitButtonRef = useRef(); 

const taskTitle = titleInputRef.current.value; 

useEffect(()=> {
    axios.post(" http://localhost:5000/task", { title : taskTitle })
    .then (response =>{
        console.log(response.data);
        titleInputRef.current.value = ""; 
    })
    .catch(error =>{
        console.error("Erreur: ",error);
    })
}, [])
const submitHandler=(event)=>{
    event.preventDefault()

    // add task to my Api



}

const inputChangedHandler =()=>{
    submitButtonRef.current.disabled = !titleInputRef.current.value
}

    return(
        //mes inputs
        <>
        <form action="#" onSubmit={submitHandler} className="form">
            <div>
                <label htmlFor="titleTask">Nom de la tâche</label>
                <input type="text" id="titleTask" ref={titleInputRef} onChange={inputChangedHandler} required />
            </div>
            <div>
                <button disabled ref={submitButtonRef}>Add Task</button>
            </div>
        </form>
        </>
    )
}

export default Form