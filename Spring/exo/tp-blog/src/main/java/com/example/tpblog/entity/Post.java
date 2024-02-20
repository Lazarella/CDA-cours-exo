package com.example.tpblog.entity;

import com.example.tpblog.entity.Comment;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name="post")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotBlank
    @Size(min=3,max=50)
    private String title;

    @Size(max=150)
    private String description;

    @NotBlank
    private String content;
    private LocalDateTime dateTime = LocalDateTime.now();

    @ElementCollection
    private List<LocalDateTime> updateDatelist ;

    private String author;
    //peut devenir un Objet avec la persistence

    @ElementCollection
    private List<String> tagList;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Comment> commentList;

    private boolean update = false;
    public boolean setUpdate() {
        this.update = update;
       updateDatelist.add(LocalDateTime.now());
       return true;
    }

    public List<LocalDateTime> getUpdateDatelist() {
        return updateDatelist;
    }

    public void setUpdateDatelist(List<LocalDateTime> updateDatelist) {
        this.updateDatelist = updateDatelist;
    }
}
