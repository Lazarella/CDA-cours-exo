package com.example.exo_student.controller;

import com.example.exo_student.model.Student;
import com.example.exo_student.service.Repository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/academy")
@AllArgsConstructor
public class StudentRestController {

    private final Repository repository;


//    @GetMapping
//    @RequestMapping("/api/v1/academy")
//    public Boolean createStudent(Student student){
//        return false;
//    }

    @PostMapping("/add")
    public Student createStudent(@RequestBody Student student){
        repository.createStudent(student);
        System.out.println("create");
        return student;
    }
    @GetMapping("/students")
    public List<Student> getAllStudentsJson(){
        return repository.getAllStudent();
    }
    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable("id") UUID id){
        return repository.getStudentGetById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable UUID id){
        System.out.println("delete");
        repository.deleteStudent(id);
    }
}
