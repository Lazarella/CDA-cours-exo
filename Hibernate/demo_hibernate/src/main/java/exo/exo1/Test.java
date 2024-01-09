package exo.exo1;

import exo.exo1.model.Produit;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.sql.SQLOutput;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transac = null;

//        try{
       transac = session.beginTransaction();
//
//        Produit produit = new Produit();
//        produit.setMarque("Miu Miu");
//        produit.setPrix(189.89);
//        produit.setDateAchat(new Date());
//        produit.setReference("c1234-34");
//        produit.setStock(34);
//
//        session.save(produit);
//        System.out.println("Produit "+produit.getMarque()+ " ajouté avec succès");
//
//        Produit produit1 = new Produit();
//        produit1.setMarque("Claudie Pierlot");
//        produit1.setPrix(278.89);
//        produit1.setDateAchat(new Date());
//        produit1.setReference("r456-38");
//        produit1.setStock(12);
//
//        session.save(produit1);
//        System.out.println("Produit "+produit1.getMarque()+ " ajouté avec succès");
//
//        Produit produit2 = new Produit();
//        produit2.setMarque("American Vintage");
//        produit2.setPrix(89.59);
//        produit2.setDateAchat(new Date());
//        produit2.setReference("t789-34");
//        produit2.setStock(13);
//
//        session.save(produit2);
//        System.out.println("Produit "+produit2.getMarque()+ " ajouté avec succès");
//
//        Produit produit3 = new Produit();
//        produit3.setMarque("Pablo");
//        produit3.setPrix(389.59);
//        produit3.setDateAchat(new Date());
//        produit3.setReference("m789-34");
//        produit3.setStock(13);
//
//        session.save(produit3);
//        System.out.println("Produit "+produit.getMarque()+ " ajouté avec succès");
//
//        Produit produit4 = new Produit();
//        produit4.setMarque("Sandro");
//        produit4.setPrix(689.59);
//        produit4.setDateAchat(new Date());
//        produit4.setReference("m123-34");
//        produit4.setStock(13);
//
//        session.save(produit4);
//        System.out.println("Produit "+produit4.getMarque()+ " ajouté avec succès");
//
//        session.getTransaction().commit();
//        session.close();
//        sessionFactory.close();
//
//    } catch (Exception e) {
//        if (transac != null) {
//            transac.rollback();
//            e.printStackTrace();
//
//        }
//
//    } finally {
//        session.close();
//        sessionFactory.close();
//    }

        Produit p = session.load(Produit.class,2l );
        System.out.println(p.toString());

        Produit p1 = session.load(Produit.class, 3l);
        session.delete(p1);

        Produit p2 = session.load(Produit.class, 1l);
        p2.setStock(22);
        session.update(p2);

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
