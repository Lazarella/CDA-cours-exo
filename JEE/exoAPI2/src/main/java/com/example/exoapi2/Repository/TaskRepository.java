package com.example.exoapi2.Repository;

import com.example.exoapi2.entity.Task;

import java.util.List;

public interface TaskRepository {
   Task save(Task task);
   Task findById(Long id);
    List<Task> findAll();
   Task update(Task task);
    void delete(Long id);
}
