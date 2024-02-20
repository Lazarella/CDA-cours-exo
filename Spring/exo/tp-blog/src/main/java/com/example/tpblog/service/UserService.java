package com.example.tpblog.service;

import com.example.tpblog.entity.User;
import com.example.tpblog.model.UserDTO;

import java.util.List;
import java.util.Optional;

public interface UserService {
    UserDTO createUser(UserDTO dto);
    Optional<User> getUserById(Long id);

    List<UserDTO> getAllUsers();

    void updateUser(Long id, UserDTO updateDTO);

    void deleteUser(Long id);

    boolean findUserbyPassword(String str);
    boolean findUserbyAlias(String str);

}
