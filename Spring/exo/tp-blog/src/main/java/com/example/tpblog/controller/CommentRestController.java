package com.example.tpblog.controller;

import com.example.tpblog.entity.Comment;
import com.example.tpblog.model.CommentDTO;
import com.example.tpblog.service.CommentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentRestController {
    private final CommentService commentService;

    public CommentRestController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping("/list")
    public List<CommentDTO> getAllComments(){
        return commentService.getAllComments();
    }

    @PostMapping("/add")
    public CommentDTO addComment(@RequestBody CommentDTO dto){
        return commentService.createComment(dto);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteComment(@PathVariable Long id){
        commentService.deleteComment(id);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Comment> updateComment(@PathVariable Long id, @RequestBody CommentDTO updateDTO) {
        commentService.updateComment(id, updateDTO);
        return ResponseEntity.ok().build();
    }
}
