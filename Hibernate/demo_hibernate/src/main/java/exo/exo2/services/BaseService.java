package exo.exo2.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class BaseService {
    protected StandardServiceRegistry register;

    protected SessionFactory sessionFactory;

    protected Session session;

    public BaseService() {
        register = new StandardServiceRegistryBuilder().configure().build();
        sessionFactory = new MetadataSources(register).buildMetadata().buildSessionFactory();
    }
}
