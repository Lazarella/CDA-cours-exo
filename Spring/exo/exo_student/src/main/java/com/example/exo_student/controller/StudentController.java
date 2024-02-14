package com.example.exo_student.controller;

import com.example.exo_student.model.Student;
import com.example.exo_student.service.Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequiredArgsConstructor
public class StudentController {

    private final Repository repository;


    @GetMapping
    public String homePage(){
        return"home";
    }

    @GetMapping("/add")
    public String addStudent(Model model){
        model.addAttribute("student", new Student());
        return "studentadmin/form";
    }
@PostMapping("/add")
    public String submitStudent(@ModelAttribute("student") Student student){
    repository.createStudent(student);
        return "redirect:/list";
}
@GetMapping("/list")
public String showAllStudents(Model model){
    List<Student> students = repository.getAllStudent();
    model.addAttribute("students", students);
    return  "studentadmin/list";
    }

    @GetMapping("/detail/{studentId}")
    public String studentDetail(@PathVariable("studentId")UUID id, Model model){
        Student myStudent = repository.getStudentGetById(id);
        model.addAttribute("myStudent", myStudent);
        return "studentadmin/detail";
    }
    @GetMapping("/detail")
    public String searchByLastName(@RequestParam String str, Model model) {
        List<Student> students = repository.getStudentByLastName(str);
        model.addAttribute("students", students);
        return "studentadmin/detail";
    }
}
