package com.example.exoapi;

import com.example.exoapi.entity.Task;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/api")
public class HelloApplication extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<>();
        Task task;
        resources.add(TaskRessource.class);
        return resources;
    }
}