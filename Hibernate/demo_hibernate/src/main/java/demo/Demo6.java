package demo;

import demo.embedded.Agence;
import demo.embedded.AgenceId;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Demo6 {

    public static void main(String[] args) {


        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        AgenceId agenceId = new AgenceId();
        agenceId.setLibelle("Fleur");

        Agence agenceLille = new Agence(agenceId, "130 avenue de la République");


        session.save(agenceLille);

        session.getTransaction().commit();

        session.close();
        sessionFactory.close();
    }
}
