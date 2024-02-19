package com.example.tpblog.model;

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

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Post {
    private UUID id;

    @NotBlank
    @Size(min=3,max=50)
    private String title;

    @Size(max=150)
    private String description;

    @NotBlank
    private String content;
    private LocalDateTime dateTime = LocalDateTime.now();

    private List<LocalDateTime> updateDatelist = new ArrayList<>();

    private String author;
    //peut devenir un Ojet avec la persistence

    private List<String> tagList;

    private List<Comment> commentList;

    private boolean update = false;
    public boolean setUpdate() {
        this.update = update;
       updateDatelist.add(LocalDateTime.now());
       return true;
    }
}
