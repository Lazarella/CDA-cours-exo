package todo.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import entity.Todo;

import java.sql.SQLException;
import java.util.List;

public class TodoDAO extends BaseDAO <Todo>{
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_todo");
    @Override
    public boolean save(Todo todo) throws SQLException {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        //Todo todo = new Todo(title, description);
        em.persist(todo);
        System.out.println("Nouvelle tâche : "+ todo.getTitle());
        em.getTransaction().commit();
        em.close();
        emf.close();
        return false;
    }

    @Override
    public boolean update(int id, String t, String d) throws SQLException {
        EntityManager em = emf.createEntityManager();
        Todo updateTodo = em.find(Todo.class, id);
        em.getTransaction().begin();
        updateTodo.setTitle(t);
        updateTodo.setDescription(d);

        return false;
    }

    @Override
    public boolean delete(int id) throws SQLException {
        EntityManager em = emf.createEntityManager();
        Todo deleteTodo = em.find (Todo.class, id);
        return false;
    }

    @Override
    public Todo getById(int id) throws SQLException {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Todo todo = em.find(Todo.class,id);
        System.out.println(todo);
        em.close();
        emf.close();
        return null;
    }

    @Override
    public void isDone(int id, boolean done) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.getTransaction().commit();

        Todo todoStatus = em.find(Todo.class, id);


        if (todoStatus != null) {
            boolean updateSuccess = todoStatus.setDone(done);
            if (updateSuccess) {
                System.out.println("Task marked as done");
            } else {
                System.out.println("Keep going!");
            }
        } else {
            System.out.println("Task not found!");
        }

        em.close();
        emf.close();
    }

    @Override
    public List<Todo> get() throws SQLException {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        List<Todo> todoList = null;
        todoList = em.createQuery("select t from Todo t", Todo.class).getResultList();

        for (Todo t : todoList
             ) {
            System.out.println(t);

        }
        em.getTransaction().commit();
        em.close();
        emf.close();
        return null;
    }
}
