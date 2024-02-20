package com.example.tpblog.service;

import com.example.tpblog.Repository.UserRepository;
import com.example.tpblog.entity.User;
import com.example.tpblog.model.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;


    @Override
    public UserDTO createUser(UserDTO dto) {
        return null;
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return null;
    }

    @Override
    public void updateUser(Long id, UserDTO updateDTO) {

    }

    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public boolean findUserbyPassword(String str) {
        return false;
    }

    @Override
    public boolean findUserbyAlias(String str) {
        return false;
    }
}
