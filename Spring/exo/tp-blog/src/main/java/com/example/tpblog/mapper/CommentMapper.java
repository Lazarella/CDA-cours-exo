package com.example.tpblog.mapper;

import com.example.tpblog.entity.Comment;
import com.example.tpblog.model.CommentDTO;
import org.springframework.stereotype.Component;

@Component
public class CommentMapper {
    public CommentDTO toDto(Comment comment) {
        String name = comment.getName();
        String content = comment.getContent();
        String mail = comment.getMail();

        return new CommentDTO(name, content, mail);
    }

    public Comment toComment(CommentDTO commentDTO) {
        return new Comment(commentDTO.getName(), commentDTO.getContent(), commentDTO.getMail());
    }
}
