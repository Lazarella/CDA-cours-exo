package com.example.tpblog.service;

import com.example.tpblog.model.Post;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PostService {
    Post createPost(Post post);
    Optional<Post> getPostById(UUID id);

    List<Post> getAllPosts();

    //List<Optional<Post>> searchTag(String search);

    Optional<Post> updatePost(UUID id, String updateContent);

    void deletePost(Long id);
}
