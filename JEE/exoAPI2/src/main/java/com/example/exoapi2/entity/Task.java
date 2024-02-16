package com.example.exoapi2.entity;

import jakarta.persistence.*;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_task", nullable = false)
    private Long id_task;

    String content;
    Status status;

    public Long getId_task() {
        return id_task;
    }

    public void setId_task(Long id_task) {
        this.id_task = id_task;
    }

    public Task(long id, String content, Status status) {
    }

    public Task() {

    }

    public long getId() {
        return id_task;
    }

    public String getContent() {
        return content;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
