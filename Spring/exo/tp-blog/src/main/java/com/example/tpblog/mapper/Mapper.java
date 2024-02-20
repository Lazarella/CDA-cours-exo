package com.example.tpblog.mapper;

import com.example.tpblog.entity.Comment;
import com.example.tpblog.entity.Post;
import com.example.tpblog.entity.User;
import com.example.tpblog.model.CommentDTO;
import com.example.tpblog.model.PostDTO;
import com.example.tpblog.model.UserDTO;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class Mapper {
    public CommentDTO toDto(Comment comment) {
        String name = comment.getName();
        String content = comment.getContent();
        String mail = comment.getMail();
        PostDTO postDTO = toDto(comment.getPost());

        return new CommentDTO(name, content, mail);
    }

    public Comment toComment(CommentDTO commentDTO) {
        return new Comment(commentDTO.getName(), commentDTO.getContent(), commentDTO.getMail());
    }

    public PostDTO toDto(Post post){
    String title = post.getTitle();
    String creationDate= convertToDate(post.getDateTime());
    String description = post.getDescription();
    String content = post.getContent();
    String lastUpdate = getDate(post.getUpdateDatelist());
    UserDTO author = toDto(post.getAuthor());
    List<String> tagsList = post.getTagList();
        List<CommentDTO> commentDTOs = post.getCommentList().stream()
                .map(this::toDto)
                .toList();

        return new PostDTO(title, creationDate, description, content, lastUpdate, author, tagsList, commentDTOs);
    }

    public Post toPost(PostDTO postDTO){
         Post post =   Post.builder()
                .title(postDTO.getTitle())
                .description(postDTO.getDescription())
                .content(postDTO.getContent())
                .dateTime(stringToDate(postDTO.getCreationDate()))
                .author(toUser(postDTO.getAuthor()))
                .tagList(postDTO.getTagList())
                .build();
        if (postDTO.getLastUpdate() != null) {
            post.addUpdateDate(stringToDate(postDTO.getLastUpdate()));
        }

        return post;
    }
    public UserDTO toDto( User user){
return UserDTO.builder()
        .alias(user.getAlias())
        .postList(user.getPostList())
        .commentList(user.getCommentList())
        .mail(user.getMail())
        .passwordUser(user.getPasswordUser())
        .build();
    }
    public static User toUser(UserDTO userDTO){
        return User.builder()
                .alias(userDTO.getAlias())
                .postList(userDTO.getPostList())
                .commentList(userDTO.getCommentList())
                .mail(userDTO.getMail())
                .passwordUser(userDTO.getPasswordUser())
                .build();
    }
    public static String convertToDate(LocalDate localDate) {
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return localDate.format(formatters);
    }
    public static String getDate(List<LocalDate> updateDateList) {
        if (updateDateList == null || updateDateList.isEmpty()) {
            return null;
        }
        LocalDate lastUpdate = updateDateList.get(updateDateList.size() - 1);
        return convertToDate(lastUpdate);
    }
    public static LocalDate stringToDate(String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        return LocalDate.parse(date, formatter);
    }


}
