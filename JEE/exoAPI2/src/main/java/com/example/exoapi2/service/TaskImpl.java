package com.example.exoapi2.service;

import com.example.exoapi2.Repository.TaskRepository;
import com.example.exoapi2.Repository.TaskRepositoryImpl;
import com.example.exoapi2.entity.Status;
import com.example.exoapi2.entity.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TaskImpl implements TaskService {

    private TaskRepository taskRepository = new TaskRepositoryImpl();

    private final List<Task> tasks = new ArrayList<>();
    @Override
    public Task save(long id, String content, Status status) {
        Optional<Task> existingTask = tasks.stream().filter(t -> t.getId() == id).findFirst();
        if(existingTask.isPresent()) {
            throw new RuntimeException("Task with id " + id + " already exists.");
        }

        Task newTask = new Task(id, content, status);
        taskRepository.save(newTask);
        return newTask;
    }

    @Override
    public Task getById(long id) {
        return tasks.stream()
                .filter(task -> task.getId() == id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Task with id " + id + " not found"));
    }

    @Override
    public boolean delete(long id) {

        return tasks.removeIf(task -> task.getId() == id);
    }

    @Override
    public Task update(long id, Status status) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setStatus(status);
                return task;
            }
        }
        throw new RuntimeException("Task with id " + id + " not found");
    }

    @Override
    public List<Task> getAllTasks() {
        return new ArrayList<>(tasks);
    }
}
