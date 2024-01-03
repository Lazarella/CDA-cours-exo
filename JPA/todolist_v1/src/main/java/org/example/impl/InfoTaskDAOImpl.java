package org.example.impl;

import org.example.dao.TaskDAO;
import org.example.model.InfoTask;
import org.example.model.Task;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import java.util.List;

public class InfoTaskDAOImpl implements TaskDAO <InfoTask>{

    private EntityManagerFactory entityManagerFactory;
    public InfoTaskDAOImpl(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }
    @Override
    public boolean addTask(InfoTask infoTask) {
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            EntityTransaction transaction = entityManager.getTransaction();
            try {
                transaction.begin();
                entityManager.persist(infoTask);
                transaction.commit();
                return true;
            }catch (Exception e){
                if(transaction.isActive()){
                    transaction.rollback();
                }
                e.printStackTrace();
                return false;
            }finally {
                entityManager.close();
            }
        }

    @Override
    public List<Task> getAllTasks() {
        return null;
    }

    @Override
    public boolean deleteTask(Long taskId) {
        return false;
    }

    @Override
    public boolean markTaskAsCompleted(Long taskId) {
        return false;
    }
}
