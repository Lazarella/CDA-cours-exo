package com.example.demo_spring_reactive.Repository;

import com.example.demo_spring_reactive.model.Message;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface MessageRepository extends R2dbcRepository<Message,Integer> {
}
