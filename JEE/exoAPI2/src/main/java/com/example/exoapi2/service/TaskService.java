package com.example.exoapi2.service;

import com.example.exoapi2.entity.Status;
import com.example.exoapi2.entity.Task;

import java.util.List;

public interface TaskService {
    Task save(long id, String content, Status status);

    Task getById(long id);
    boolean delete(long id);
    Task update(long id, Status status);
    List<Task> getAllTasks();
}
