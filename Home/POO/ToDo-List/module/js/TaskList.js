import { Task } from "./Task";


export class TaskList{
    constructor(){
        this.tasks = [] ; 
        this.cpt = 0; 
    }
    addTask(){
        this.tasks= new Task(this.cpt++, text);
        this.tasks.push(tasks);
    }
    removeTask(){
        this.tasks.filter((t) => t.id =!id);
    }
    renderTasks(){
        const read = document.querySelector('#myTask');
        read.innerHTML ='';

        this.tasks.forEach(t=>{
            const taskItem = t.render();
            read.appendChild(taskItem);
        });
    }
}
