package com.example.demospringdata.service;

import java.util.List;
import com.example.demospringdata.entity.Person;

public interface PersonService {

    List<Person> finAll();

    Person findById(Long id);

    void save(Person person);

    void delete(Long id);

    void update(Long id);


}
