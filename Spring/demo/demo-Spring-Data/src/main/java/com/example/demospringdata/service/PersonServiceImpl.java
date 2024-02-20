package com.example.demospringdata.service;

import com.example.demospringdata.dao.PersonRepository;
import com.example.demospringdata.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonServiceImpl implements PersonService {
    private PersonRepository personRepository;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    @Override
    public List<Person> finAll() {
        personRepository.findAll();
        return null;
    }

    @Override
    public Person findById(Long id) {
        return personRepository.getReferenceById(id);
    }

    @Override
    public void save(Person person) {
personRepository.save(person);
    }

    @Override
    public void delete(Long id) {
        personRepository.deleteById(id);
    }

    @Override
    public void update(Long id) {
        Person personToUpdate = findById(id);
personRepository.save(personToUpdate);
    }
}
