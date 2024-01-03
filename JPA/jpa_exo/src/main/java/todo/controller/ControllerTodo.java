package todo.controller;

import entity.Todo;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceException;
import todo.dao.TodoDAO;

import java.sql.SQLException;

public class ControllerTodo {
    private TodoDAO todoDao;


    public boolean createTodo(String title, String description) {
        Todo todo = new Todo(title, description);
        try {
            return todoDao.save(todo);
        } catch (PersistenceException | SQLException e) {
            System.out.println("Erreur " + e);
        }
        return false;
    }

    public void displayTodo() {
        try {
            todoDao.get();
        } catch (PersistenceException | SQLException e) {
            System.out.println("Erreur " + e);
        }
    }

    public boolean updateStatus(Todo todo, boolean d) {
        try {
            return  todoDao.isDone(d);
        } catch (PersistenceException | SQLException e) {
            System.out.println("Erreur " + e);
        }
    }
}

