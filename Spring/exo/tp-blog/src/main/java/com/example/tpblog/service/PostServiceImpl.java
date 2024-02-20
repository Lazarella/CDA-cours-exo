package com.example.tpblog.service;

import com.example.tpblog.Repository.PostRepository;
import com.example.tpblog.entity.Post;
import com.example.tpblog.mapper.PostMapper;
import com.example.tpblog.model.PostDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PostServiceImpl implements PostService {
    private final PostRepository postRepository;
    private final PostMapper postMapper;

    public PostServiceImpl(PostRepository postRepository, PostMapper postMapper) {
        this.postRepository = postRepository;
        this.postMapper = postMapper;
    }

    public List<PostDTO> listPosts(){
        return postRepository.findAll().stream()
                .map(postMapper::postToDTO)
                //.map(post -> postMapper.postToPostDto(post))
                .toList();
    }


    public PostDTO createPost(PostDTO dto){
        return postMapper.postToDTO(postRepository.save(postMapper.DTOtoPost(dto)));
    }

    @Override
    public Optional<Post> getPostById(Long id) {
        return postRepository.findById(id);
    }

    @Override
    public List<PostDTO> getAllPosts() {
        return null;
    }

    @Override
    public void updatePost(Long id, PostDTO updateDTO) {
        Post postToUpdate = postRepository.findById(id).orElseThrow(() -> new RuntimeException("Post not found with id " + id));
        postToUpdate.setContent(updateDTO.getContent());
        postRepository.save(postToUpdate);
    }
    @Override
    public void deletePost(Long id) {
        postRepository.deleteById(id);

    }
}
