import { TaskList } from "./TaskList.js";

export class Task {
    constructor(id, text) {
        this.text = text;
        this.id = id ;
    }

    render() {
        // Créez un élément li pour afficher la tâche
        const taskItem = document.createElement('li');
        taskItem.className = 'list-group-item d-flex justify-content-between align-items-center';
        taskItem.textContent = this.text;
             // Créez le bouton de suppression
        const deleteButton = document.createElement('button');
        deleteButton.className = 'btn btn-danger btn-sm';
        deleteButton.textContent = 'Supprimer';
        deleteButton.setAttribute('data-action', 'delete');
        deleteButton.setAttribute('data-info', this.id);
        taskItem.appendChild(deleteButton);
        return taskItem;
    }
}
