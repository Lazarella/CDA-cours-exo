package demo;

import demo.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;
import org.hibernate.type.StringType;

import java.util.List;

public class Demo2 {

    public static void main(String[] args) {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        String search= "B";

        Query<Person>personQuery = session.createQuery("from Person where name like :nom");
        personQuery.setParameter("nom", search+"%", StringType.INSTANCE);
        List<Person> personStratWithB = personQuery.list();

        for(Person p : personStratWithB){
            System.out.println(" Personne avec un nom commençant par B " + p.toString() );
        }
        Query<Person>personQuery2 = session.createQuery("from Person where name like ?");
        personQuery2.setParameter(0, search+"%",StringType.INSTANCE);
        List<Person> personStratWithB2 = personQuery.list();

        for(Person p : personStratWithB2){
            System.out.println(" Personne avec un nom commençant par B " + p.toString() );
        }
    }
}
