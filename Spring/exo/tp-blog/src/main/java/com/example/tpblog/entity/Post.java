package com.example.tpblog.entity;

import com.example.tpblog.entity.Comment;
import com.example.tpblog.model.UserDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
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
    private LocalDate dateTime = LocalDate.now();

    @ElementCollection
    private List<LocalDate> updateDatelist ;

    @ManyToOne
    @JoinColumn(name = "author_user_id")
    private User author;

    @ElementCollection
    private List<String> tagList;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Comment> commentList;

    private boolean update = false;
    public boolean setUpdateList(LocalDate lastUpdate) {
       updateDatelist.add(lastUpdate);
       return true;
    }

    public void addUpdateDate(LocalDate date) {
        if (this.updateDatelist == null) {
            this.updateDatelist = new ArrayList<>();
        }
        this.updateDatelist.add(date);
    }

    public void setUpdateDatelist(List<LocalDate> updateDatelist) {
        this.updateDatelist = updateDatelist;
    }
}
