package com.example.tpblog.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)

    private Long id;
    private String firstName;
    private String lastName;
    private String alias;
    private String mail;
    private String passwordUser;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Post> postList;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Comment> commentList;

}
