package demo;

import demo.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.internal.IteratorImpl;
import org.hibernate.query.Query;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.List;

public class Demo1 {

    public static void main(String[] args) {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
Session session = sessionFactory.openSession();

//HQL
        Query<Person> personQuery = session.createQuery("from Person");

        List<Person> personList = personQuery.list();

        for(Person p : personList){
            System.out.println(p.toString());
        }
        Iterator<Person> personIterator = personQuery.iterate();
        while (personIterator.hasNext()){
            Person p = personIterator.next();
            System.out.println("Personne avec iterator "+ p.toString());
        }
        // Une requête avec filtre pour récupérer une liste

        Query<Person> personQuery1 = session.createQuery("from Person where name = 'Beasly'");
        List<Person>list = personQuery1.list();
        for(Person p : list){
            System.out.println("personne avec nom 'Beasly' : "+p);
        }

        Query<Person> personQuery2 = session.createQuery("from Person where id =2");
        Person person2 = personQuery2.getSingleResult();

        System.out.println("Une seule personne : "+ person2.toString());
    }
}
