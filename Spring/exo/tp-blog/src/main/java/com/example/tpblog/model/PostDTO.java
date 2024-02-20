package com.example.tpblog.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PostDTO {
    private String title;
    private String creationDate;
    private String description;
    private String content;
    private String lastUpdate;
    private UserDTO author;
    private List<String> tagList;
    private List<CommentDTO> commentDTOS;

}
