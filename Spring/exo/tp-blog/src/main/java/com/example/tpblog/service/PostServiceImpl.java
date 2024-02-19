package com.example.tpblog.service;

import com.example.tpblog.model.Post;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PostServiceImpl implements PostService {

    private List<Post> postList;

    @Override
    public Post createPost(Post post) {
        if(post!=null) {
            postList.add(post);
            return post;
        }
        return null;
    }

    @Override
    public Optional<Post> getPostById(UUID id) {
        return postList.stream().filter(p-> p.getId().equals(id)).findFirst();
    }

    @Override
    public List<Post> getAllPosts() {
        return postList;
    }

//    @Override
//    public List<Optional<Post>> searchTag(String search) {
//        return postList.stream().filter(p -> p.getTagList().contains(search));
//    }

    @Override
    public Optional<Post> updatePost(UUID id, String updateContent) {
        Optional<Post> postExist = getPostById(id);
        if(postExist.isPresent()){
            Post existongPost = postExist.get();
            existongPost.setContent(updateContent);
            existongPost.setUpdate();
        }
        return postExist;
    }

    @Override
    public void deletePost(Long id) {

    }
}
