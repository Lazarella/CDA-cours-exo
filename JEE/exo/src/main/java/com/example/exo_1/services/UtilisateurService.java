package com.example.exo_1.services;

import com.example.exo_1.entities.Utilisateur;
import com.example.exo_1.interfaces.Repository;
import org.hibernate.query.Query;

import java.util.List;

public class UtilisateurService extends BaseService implements Repository<Utilisateur> {

    public UtilisateurService() {super();
    }

    @Override
    public boolean create(Utilisateur o) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(o);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(Utilisateur o) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(o);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public boolean delete(Utilisateur o) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(o);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public Utilisateur findById(int id) {
        Utilisateur produit = null;
        session = sessionFactory.openSession();
        produit = (Utilisateur) session.get(Utilisateur.class, id);
        session.close();
        return produit;
    }

    @Override
    public List<Utilisateur> findAll() {
        List<Utilisateur> produitList = null;
        session = sessionFactory.openSession();
        Query<Utilisateur> produitQuery = session.createQuery("from Utilisateur");
        produitList = produitQuery.list();
        session.close();
        return produitList;
    }

//    public List<Utilisateur> filterByName(List<String> nam) throws Exception {
//        if (name.) {
//            session = sessionFactory.openSession();
//            session.beginTransaction();
//            Query<Utilisateur> produitQuery = session.createQuery("from Utilisateur where marque in :marques");
//            produitQuery.setParameter("marques", marques);
//            List<Utilisateur> produitList = produitQuery.list();
//            session.getTransaction().commit();
//            session.close();
//            return produitList;
//        }
//        throw new Exception("aucune marque");
//    }

    public boolean deleteName(String name) {

        session = sessionFactory.openSession();

        Query query = session.createQuery("delete Utilisateur where nom = :name");
        query.setParameter("name", name);
        session.getTransaction().begin();
        int success = query.executeUpdate();
        session.getTransaction().commit();
        session.close();
        return success > 0;
    }


    public void begin() {
        session = sessionFactory.openSession();
    }

    public void end() {

        //  session.close();
        sessionFactory.close();
    }
}
