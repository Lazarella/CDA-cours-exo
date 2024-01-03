package org.example.dao;

import org.example.model.Task;

import java.util.List;

public interface TaskDAO<T> {

    public boolean addTask(T e);

    public List<Task> getAllTasks();

    public boolean deleteTask(Long taskId);

    public boolean markTaskAsCompleted(Long taskId);
}
