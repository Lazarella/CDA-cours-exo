package com.example.tpblog.service;

import com.example.tpblog.Repository.CommentRepository;
import com.example.tpblog.entity.Comment;
import com.example.tpblog.entity.Comment;
import com.example.tpblog.mapper.CommentMapper;
import com.example.tpblog.model.CommentDTO;
import com.example.tpblog.model.CommentDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentServiceImpl implements CommentService{
    private final CommentRepository commentRepository;
    private final CommentMapper commentMapper;

    public CommentServiceImpl(CommentRepository commentRepository, CommentMapper commentMapper) {
        this.commentRepository = commentRepository;
        this.commentMapper = commentMapper;
    }

    public List<CommentDTO> listComments(){
        return commentRepository.findAll().stream()
                .map(commentMapper::toDTO)
                //.map(comment -> commentMapper.commentToCommentDto(comment))
                .toList();
    }


    public CommentDTO createComment(CommentDTO dto){
        return commentMapper.toDTO(commentRepository.save(commentMapper.toComment(dto)));
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
