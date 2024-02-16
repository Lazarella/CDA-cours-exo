package exo.exo2.services;

import exo.exo1.model.Comment;
import exo.exo2.DAO.CommentDAO;
import org.hibernate.Transaction;

public class CommentService extends BaseService implements CommentDAO {

    @Override
    public boolean createComment(Object o) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        Transaction transac = null;
        try {
            session.save(0);
        }catch(Exception e){
            if (transac != null) {
                transac.rollback();
                e.printStackTrace();

                return false;
        }
                session.getTransaction().commit();
                session.close();
            }
        return true;
    }

    @Override
    public boolean updateComment(Comment comment,String content, int rate) {
        session = sessionFactory.openSession();
        Transaction transac = null;

        try {
            transac = session.beginTransaction();
            Comment c = session.load(Comment.class, comment.getId());
            if(c!=null){
            c.setContent(content);
            c.setRate(rate);
            session.update(c);
            return true;
            } else {
                System.out.println("Le commentaire n'a pas été trouvé");
                return false; }
        } catch (Exception e) {
            if (transac != null) {
                transac.rollback();
                e.printStackTrace();
                return false;
            }
            session.getTransaction().commit();
            session.close();
        }
        return true;
    }
    @Override
    public boolean displayComment(Long id) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        Transaction transac = null;

        try{
            transac = session.beginTransaction();
            Comment c = session.get(Comment.class, id);
            if(c != null){
                System.out.println(c.getContent()+"  "+ c.getRate());
                session.close();
                return true;
            } else {
                System.out.println("Oups! Le commentaire na pas été trouvé");}
        }catch (Exception e){
            if (transac != null){
                transac.rollback();
                e.printStackTrace();
            }
        }
        return false;
    }


    @Override
    public boolean deleteComment(Long commentId) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        Transaction transac = null;

        try{
            transac = session.beginTransaction();
            Comment c = session.get(Comment.class, commentId);
            if(c != null){
            session.delete(c);
                session.close();
                return true;
            } else {
                System.out.println("Oups! Le commentaire na pas été trouvé");}
            }catch (Exception e){
                if (transac != null){
                    transac.rollback();
                    e.printStackTrace();
                }
            }
        return false;
        }

}
