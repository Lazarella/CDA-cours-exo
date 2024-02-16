import React, { useEffect, useRef, useState } from "react";
import axios from 'axios';
import classes from './Form.module.css'

const Form = () => {
    const titleInputRef = useRef();
    const submitButtonRef = useRef();
    const [taskTitle, setTaskTitle] = useState('');
    useEffect(() => {

        axios.post("http://localhost:5000/task", { title: taskTitle })
        .then(response => {
            console.log(response.data);
            setTaskTitle(''); 
        })
        .catch(error => {
            console.error("Erreur: ", error);
        });
    }, [taskTitle]);

    const submitHandler = event => {
    event.preventDefault();
    setTaskTitle(titleInputRef.current.value);
    
};

const inputChangedHandler = () => {
    submitButtonRef.current.disabled = !titleInputRef.current.value
    };

    return (
    
    <form action="#" onSubmit={submitHandler} className={classes.form}>
        <div>
        <label htmlFor="titleTask">Name your Task</label>
        <input type="text" id="titleTask" ref={titleInputRef} onChange={inputChangedHandler}  required />
        </div>
        <div>
        <button disabled={!taskTitle} ref={submitButtonRef} className="btn success">
                More Work!
        </button>
        </div>
    </form>
    );
}

export default Form;
