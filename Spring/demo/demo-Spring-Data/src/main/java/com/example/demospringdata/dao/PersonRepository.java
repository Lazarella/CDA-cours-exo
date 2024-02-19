package com.example.demospringdata.dao;

import com.example.demospringdata.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
