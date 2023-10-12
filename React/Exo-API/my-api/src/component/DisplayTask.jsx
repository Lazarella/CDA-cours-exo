import React, { useState, useEffect } from "react";
import axios from 'axios';

const DisplayTask = () => {
  const [tasks, setTasks] = useState([]);
  const [editingTask, setEditingTask] = useState(null);

  useEffect(() => {
    
    axios.get("http://localhost:5000/task")
    .then((response) => {
        setTasks(response.data);
    })
    .catch(error => {
        console.error("Error: ", error);
    });
}, []);

    const deleteTask = (taskId) => {

    axios.delete(`http://localhost:5000/task/${taskId}`)
    .then(() => {
        console.log("Task with ID " + taskId + " deleted");
        
        setTasks(tasks.filter(task => task.id !== taskId));
    })
        .catch(error => {
        console.error("Error: ", error);
        });
};

    const updateTask = (taskId) => {
    setEditingTask(taskId);
    };

const saveTask = (taskId) => {
    setEditingTask(null);
};

    return (
    <div className="task-list">
        {tasks.length > 0 ? (
        tasks.map(task => (
            <div key={task.id}>
            {editingTask === task.id ? (

            <div>
                <input type="text" value={task.title} />
                <button onClick={() => saveTask(task.id)}>Save</button>
            </div>
            ) : (
            
            <div>
                <h6>{task.title}</h6>
                <p>Hey, some description would be nice!</p>
                <button onClick={() => updateTask(task.id)}>Edit</button>
                <button onClick={() => deleteTask(task.id)}>Delete</button>
            </div>
            )}
        </div>
        ))
    ) : (
        <p>Il n'y a rien à faire</p>
    )}
    </div>
);
};

export default DisplayTask;
