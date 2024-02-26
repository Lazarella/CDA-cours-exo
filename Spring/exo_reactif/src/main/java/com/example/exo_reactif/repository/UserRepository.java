package com.example.exo_reactif.repository;

import com.example.exo_reactif.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserNameAndUserPassword(String userName, String UserPassWord);
}
