package com.example.tpblog.controller;

import com.example.tpblog.entity.Post;
import com.example.tpblog.model.PostDTO;
import com.example.tpblog.service.PostService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostRestController {
    private final PostService postService;

    public PostRestController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/list")
    public List<PostDTO> getAllPosts(){
        return postService.getAllPosts();
    }

    @PostMapping("/add")
    public PostDTO addPost(@RequestBody PostDTO dto){
        return postService.createPost(dto);
    }
    @DeleteMapping("/delete/{id}")
    public void deletePost(@PathVariable Long id){
        postService.deletePost(id);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Post> updatePost(@PathVariable Long id, @RequestBody PostDTO updateDTO) {
        postService.updatePost(id, updateDTO);
        return ResponseEntity.ok().build();
    }
}
