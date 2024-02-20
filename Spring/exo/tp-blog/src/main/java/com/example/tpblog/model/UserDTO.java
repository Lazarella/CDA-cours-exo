package com.example.tpblog.model;

import com.example.tpblog.entity.Comment;
import com.example.tpblog.entity.Post;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {
    private String alias;
    private List<Post> postList;
    private List<Comment> commentList;
    private String mail;
    private String passwordUser;
}
