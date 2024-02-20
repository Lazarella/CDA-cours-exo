package com.example.demospringdata.controller;

import com.example.demospringdata.entity.Person;
import com.example.demospringdata.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

       @GetMapping("/{id}")
       public Person getPersonById(@PathVariable Long id){
        return personService.findById(id);
       }
       @DeleteMapping("/delete/'id}")
    public void deletePerson(@PathVariable Long id){
        personService.delete(id);
       }
       @PostMapping("/submitperson")
    public void submitPerson(@RequestBody Person person) {
           personService.save(person);
       }
       @PutMapping("/update/{id}")
    public void updatePerson(@PathVariable Long id){

       }
}
