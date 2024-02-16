package demo;

import demo.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Demo4 {

    public static void main(String[] args) {


        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Query<Integer> query = session.createQuery("select max(age) from Person");
        int maxAge = query.uniqueResult();
        System.out.println("Age max : " + maxAge);

        //avg
        double moyenneAge = (double) session.createQuery("select avg(age) from Person").uniqueResult();
        System.out.println("Moyenne age : " + moyenneAge);

        //Utilisation IN

        List noms = new ArrayList<String>();
        noms.add("Ine");
        noms.add("Jeanine");
        Query<Person> query1 = session.createQuery(" from Person where name in :noms");
        query1.setParameter("noms", noms);

        List<Person> personList = query1.list();
        for (Person p : personList) {
            System.out.println("Personne : " + p.getName());
        }

        // Utilisation execute Update

        String update_query = "update Person set name = :nomP where id =2";
        Query query3 = session.createQuery(update_query);
        query3.setParameter("nomP", "Valériane");

        int success = query3.executeUpdate();
        session.getTransaction().commit();
        System.out.println(success);

        session.close();
        sessionFactory.close();

    }

}
