package com.example.demospringdata.controller;

import com.example.demospringdata.entity.Person;
import com.example.demospringdata.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class PersonRestController {

    private PersonService personService;

    @GetMapping("/list")
    public List<Person> getAllPerson(){
    return personService.finAll();
    }

   @GetMapping("/add")
        public void addPerson(){
            personService.save(Person.builder()
                    .firstName("Théophile")
                    .lastName("Gauthier")
                    .email("t.gauthier@gmail.com")
                    .build()
            );
       }
       @GetMapping("/delete")
    public void deletePerson(){
       }

}
