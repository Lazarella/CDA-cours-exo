package demo;

import demo.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Demo {

    public static void main(String[] args) {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Person person = new Person();
        person.setAge(27);
        person.setName("Jim");
        person.setLastName("Morrison");


        Person person1 = new Person();
        person1.setName("Pamela");
        person1.setLastName("Beasly");
        person1.setAge(32);
        Person person2 = new Person();
        person2.setName("Michael");
        person2.setLastName("Brown");
        person2.setAge(42);

        session.save(person1);
        session.save(person2);
        session.save(person);

        System.out.println(person.toString());

        // récupérer une personn

        Person p = session.load(Person.class, 1L);
        System.out.println(p.toString());

        // Modifier une personne

        p.setLastName("Beasly");
        session.update(p);

        System.out.println(p.toString());

        // Supprimer une personne
//
//        session.delete(p);

        session.getTransaction().commit();

        session.close();
        sessionFactory.close();

    }

}
