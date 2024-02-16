package com.example.demo_spring.controller;

import com.example.demo_spring.model.Cat;
import com.example.demo_spring.service.CatService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequiredArgsConstructor
public class DemoController {

    private final CatService catService;

    @GetMapping
    public String homePage(){
        return "PageA";
    }
@GetMapping("/pageb")
    public String pageb(Model model){
List<Cat> cats = catService.getCats();
    model.addAttribute("cats", cats);
        return "PageB";
}

@GetMapping("/detail/{catId}")
    public String detailCat(@PathVariable("catId") UUID id, Model model){
        Cat myCat = catService.getCatById(id);
        model.addAttribute("mycat", myCat);

        return "PageC";
    }
@GetMapping("/add")
    public String addCat(Model model){
        model.addAttribute("cat", new Cat());
        return "form/form";
}
@PostMapping("/add")
    public String submitCat(@ModelAttribute("cat")Cat cat){
    System.out.println(cat.getName()+" "+ cat.getBreed());
    catService.addCat(cat);
        return "redirect:/";
}
@GetMapping("/look")
    public String showRabbit(@RequestParam(name= "nameCat", required = false) String name, Model model){
    Cat cat =    catService.getCatByName(name);
    model.addAttribute("cat", cat);
    return "PageC";
}
}
