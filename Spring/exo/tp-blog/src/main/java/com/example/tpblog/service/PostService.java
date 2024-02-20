package com.example.tpblog.service;

import com.example.tpblog.entity.Post;
import com.example.tpblog.model.PostDTO;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PostService {
    PostDTO createPost(PostDTO dto);
    Optional<Post> getPostById(Long id);

    List<PostDTO> getAllPosts();

   void updatePost(Long id, PostDTO updateDTO);

    void deletePost(Long id);
}
