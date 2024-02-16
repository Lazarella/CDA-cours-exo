package com.example.exo_student.service;

import com.example.exo_student.model.Student;

import java.util.List;
import java.util.UUID;

public interface Repository <T>{
    Student createStudent(T t);
    Student getStudentGetById(UUID id);
    void deleteStudent(UUID id);
    Student updateStudent(T t);

    List<Student> getStudentByLastName(String str);
    List<Student> getAllStudent();





}
