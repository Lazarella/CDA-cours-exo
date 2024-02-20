package com.example.tpblog.service;

import com.example.tpblog.entity.Comment;
import com.example.tpblog.model.CommentDTO;

import java.util.List;
import java.util.Optional;

public interface CommentService {
    CommentDTO createComment(CommentDTO dto);
    Optional<Comment> getCommentById(Long id);

    List<CommentDTO> getAllComments();

    void updateComment(Long id, CommentDTO updateDTO);

    void deleteComment(Long id);
}
