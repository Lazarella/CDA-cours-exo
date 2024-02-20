package com.example.tpblog.service;

import com.example.tpblog.Repository.CommentRepository;
import com.example.tpblog.entity.Comment;
import com.example.tpblog.mapper.Mapper;
import com.example.tpblog.model.CommentDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentServiceImpl implements CommentService{
    private final CommentRepository commentRepository;
    private final Mapper mapper;

    public CommentServiceImpl(CommentRepository commentRepository, Mapper mapper) {
        this.commentRepository = commentRepository;
        this.mapper = mapper;
    }

    public List<CommentDTO> listComments(){
        return commentRepository.findAll().stream()
                //.map(mapper::toDTO)
                .map(comment -> mapper.toDto(comment))
                .toList();
    }


    public CommentDTO createComment(CommentDTO dto){
        return mapper.toDto(commentRepository.save(mapper.toComment(dto)));
    }

    @Override
    public Optional<Comment> getCommentById(Long id) {
        return commentRepository.findById(id);
    }

    @Override
    public List<CommentDTO> getAllComments() {
        return null;
    }

    @Override
    public void updateComment(Long id, CommentDTO updateDTO) {
        Comment commentToUpdate = commentRepository.findById(id).orElseThrow(() -> new RuntimeException("Comment not found with id " + id));
        commentToUpdate.setContent(updateDTO.getContent());
        commentRepository.save(commentToUpdate);
    }
    @Override
    public void deleteComment(Long id) {
        commentRepository.deleteById(id);

    }
}
