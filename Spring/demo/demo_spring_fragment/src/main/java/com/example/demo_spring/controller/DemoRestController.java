package com.example.demo_spring.controller;

import com.example.demo_spring.model.Cat;
import com.example.demo_spring.service.CatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/demo")
public class DemoRestController {
    private final CatService catService;

    @GetMapping
    public List<Cat> getAllCat(){
        return catService.getCats();
    }
}
