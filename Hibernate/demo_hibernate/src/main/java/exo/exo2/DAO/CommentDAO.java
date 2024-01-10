package exo.exo2.DAO;

import exo.exo1.model.Comment;

public interface CommentDAO<T> {
    public boolean createComment(T t );
    public boolean updateComment(Comment comment, String content, int rate);
    public boolean displayComment(Long id);
    public boolean deleteComment(Long l);

}
