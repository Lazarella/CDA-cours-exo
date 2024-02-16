package com.example.demo_spring.controller;

import com.example.demo_spring.model.Cat;
import com.example.demo_spring.service.CatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/")
    public String createCat() {
        return "PageB";
    }
    @DeleteMapping("/{id}")
    public void deleteCat(@PathVariable int id){

    }
    public String updateCat(@PathVariable int id){
    return "PageB";
    }
}
