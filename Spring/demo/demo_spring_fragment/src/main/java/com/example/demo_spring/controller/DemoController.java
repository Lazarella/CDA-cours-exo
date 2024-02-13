package com.example.demo_spring.controller;

import com.example.demo_spring.model.Cat;
import com.example.demo_spring.service.CatService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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
    Cat cat = cats.get(0);
    Cat cat2 = cats.get(1);
    Cat cat3 = cats.get(2);
    model.addAttribute("idCat", cat.getId());
    model.addAttribute("idCat2", cat2.getId());
    model.addAttribute("idCat3", cat3.getId());
        return "PageB";
}

@GetMapping("/detail/{catId}")
    public String detailCat(@PathVariable("catId") UUID id, Model model){
        Cat myCat = catService.getCatById(id);
        model.addAttribute("mycat", myCat);

        return "PageC";
    }

}
