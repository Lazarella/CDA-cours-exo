package org.example.port;

import org.example.entity.Person;

import java.util.List;

public interface PersonRepository {
    void create(Person person);
    void delete(Person person);
    Person findById(long id);
    List<Person> searchBook(String search);
}
