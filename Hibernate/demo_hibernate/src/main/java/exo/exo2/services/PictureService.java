package exo.exo2.services;

import exo.exo1.model.Comment;
import exo.exo1.model.Picture;
import exo.exo2.DAO.PictureDAO;
import org.hibernate.Transaction;

public class PictureService extends BaseService implements PictureDAO {
    @Override
    public boolean addPicture(Object o) {
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
    public boolean updatePicture(Picture p, String s) {
        session = sessionFactory.openSession();
        Transaction transac = null;

        try {
            transac = session.beginTransaction();
            Picture picture = session.load(Picture.class, p.getId());
            if(picture !=null){
                picture.setUrl(s);
                session.update(picture);
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
    public boolean deletePicture(long l) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        Transaction transac = null;

        try{
            transac = session.beginTransaction();
            Comment c = session.get(Comment.class, l);
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
