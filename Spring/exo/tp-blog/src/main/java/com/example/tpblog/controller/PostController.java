package com.example.tpblog.controller;

import com.example.tpblog.model.PostDTO;
import com.example.tpblog.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostController {
private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/home")
    public String home(){
        return "home";
    }
    @GetMapping("/posts")
    public String mainContent(){
        return "main-content";
    }
    @GetMapping("/form")
    public String formAddPost(Model model){
        model.addAttribute("post", new PostDTO());
        return "form-post";
    }
}
