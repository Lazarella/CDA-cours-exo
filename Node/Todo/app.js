import express from "express";
import todos from "./data/todos.json" assert { type: "json" };
import { writeFileSync, readFileSync} from "fs/promises"

const app = express(); 
const port = 3030; 

app.use(express.json());

    app.post("/todos", async(req, res) => {
    console.log(req.body); 
    const newTask = req.body; 
    
    const data = await readFileSync(dataFilePath, "utf8");
    const existingTasks = JSON.parse(data);

    existingTasks.push(newTask); 

    await writeFileSync(dataFilePath, JSON.stringify(existingTasks, null, 2));

    res.json({ message: "Task added successfully", task: newTask });
});


app.put("todos/:id/", (req,res)=> {
    const taskId = req.params.id;

    res.json({ message: `Task with ID ${taskId} updated` });
})

app.get("/todos/", (req, res) =>{
    res.json(todos)
})

app.get("/todos/:id", (req, res) =>{
    const taskId = req.params.id;
    res.json({ todos });
})

app.delete("/todos/:id", (req,res) => {
    const taskId = req.params.id;
    res.send(taskId+" is deleted")
})


app.listen(port, () => {
    console.log("http://127.0.0.1:3030");
});