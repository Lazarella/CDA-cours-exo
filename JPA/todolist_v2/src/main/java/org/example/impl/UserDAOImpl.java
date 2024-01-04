package org.example.impl;

import org.example.dao.UserDAO;
import org.example.model.Task;
import org.example.model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.security.spec.RSAOtherPrimeInfo;

public class UserDAOImpl implements UserDAO {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_exo");

    public UserDAOImpl(EntityManagerFactory entityManagerFactory) {
    }

    @Override
    public boolean addUser(User user) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try{
            transaction.begin();
            em.persist(user);
            transaction.commit();
            return true;
        }catch(Exception e){
            if(transaction.isActive()){
                transaction.rollback();
            }
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Task getTaskByUser(Long userId) {
        EntityManager em = emf.createEntityManager();
        Task task = em.find(Task.class, userId);
        em.close();
       return task;
    }

    @Override
    public boolean deleteUser(Long userId) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transac = em.getTransaction();
        try{
            transac.begin();
            User user = em.find(User.class, userId);
            if(user != null){
                em.remove(user);
                transac.commit();
                return true;
            }else{
                return false;
            }
        }catch (Exception e){
            if(transac.isActive()){
                transac.rollback();
            }
            e.printStackTrace();
            return false;
        }finally{
            em.close();
        }
    }
}
