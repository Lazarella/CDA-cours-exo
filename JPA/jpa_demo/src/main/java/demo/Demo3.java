package demo;

import entity.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Demo3 {

    public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo_jpa");

    public static void create() {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Person person = new Person("Alain","Froussard");
        person.setAge(45);
        em.persist(person);
        System.out.println("person " +  person.getId());
        em.getTransaction().commit();
        em.close();
        emf.close();

    }

    public static void merge() {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Query query = em.createQuery("select p from Person p where p.id = 1");

        Person person = (Person) query.getSingleResult();

        if(person== null){
            System.out.println("Person not found");
        }else {
            System.out.println("Person :"+ person.getPrenom());
            Person person1 = new Person();
            person1.setId(person.getId());
            person1.setPrenom(person.getPrenom());
            person1.setNom("Milan");

            em.merge(person1);

            person = (Person) query.getSingleResult();

            System.out.println("Person : "+ person.getPrenom());
        }

        em.getTransaction().commit();
        em.close();
        emf.close();

}
}
