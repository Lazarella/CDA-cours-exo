package com.example.exo_student.controller;

import com.example.exo_student.model.Student;
import com.example.exo_student.service.Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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
        return "studentAdministrator/form";
    }
@PostMapping("/add")
    public String submitStudent(@ModelAttribute("student") Student student){

        return "redirect:/list";
}
@GetMapping("/list")
public String showAllStudents(){
    return "studentAdministrator/list";
    }
    @GetMapping("/detail")
    public String showStudentsDetail(){
        return "studentAdministrator/detail";
    }
}
