package org.example.dao;

import org.example.model.Task;
import org.example.model.User;

public interface UserDAO {
    public boolean addUser(User user);
    public Task getTaskByUser(Long userId);
    public boolean deleteUser(Long userId);
}
