import { readFile, writeFile } from 'fs/promises'; 
import LineByLine from "n-readlines"
import { newTask } from './app'; "./app"

let file = './data/todos.json'

let reader = new LineByLine(file); 
// Function to add a new task
function addTask(newTask) {
  // Read the existing JSON file
  fs.readFile(file, (err, data) => {
    if (err) {
      console.error('Error reading file:', err);
      return;
    }

    try {
      // Parse the JSON data
    const currentTasks = JSON.parse(data);

      // Add the new task to the tasks array
    currentTasks.tasks.push(newTask);

      // Convert the updated object back to JSON
      const updatedData = JSON.stringify(currentTasks, null, 2);

      // Write the updated data back to the file
      fs.writeFile(todosFilePath, updatedData, (err) => {
        if (err) {
          console.error('Error writing file:', err);
        } else {
          console.log('Task added successfully.');
        }
      });
    } catch (parseError) {
      console.error('Error parsing JSON:', parseError);
    }
  });
}

// Example: Add a new task to the todos.json file
const newTask = {
  title: 'New Task',
  description: 'This is a new task to be added.',
  done: false,
};

addTask(newTask);

