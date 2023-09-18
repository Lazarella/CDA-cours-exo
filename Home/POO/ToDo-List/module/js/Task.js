import { TaskList } from "./TaskList.js";

export class Task{
constructor(id, text){
    this.id = id; 
    this.text = text; 
}
render(){
    const listItem = document.createElement('li');
    listItem.className = 'list-group-item d-flex justify-content-between align-items-center'; 
    listItem.textContent = this.text;
    read.appendChild(listItem);
}

}