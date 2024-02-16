package com.example.exoapi2.Repository;

import com.example.exoapi2.entity.Task;
import jakarta.persistence.EntityManager;

import java.util.List;

public class TaskRepositoryImpl implements TaskRepository {

    private EntityManager entityManager;

    @Override
    public Task save(Task person) {
        entityManager.persist(person);
        return person;
    }

    @Override
    public Task findById(Long id) {
        return entityManager.find(Task.class, id);
    }

    @Override
    public List<Task> findAll() {
        return entityManager.createQuery("from Task", Task.class).getResultList();
    }

    @Override
    public Task update(Task person) {
        return entityManager.merge(person);
    }

    @Override
    public void delete(Long id) {
        Task person = findById(id);
        if (person != null) {
            entityManager.remove(person);
        }
    }
}
