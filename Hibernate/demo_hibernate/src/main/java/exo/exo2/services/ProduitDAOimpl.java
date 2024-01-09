package exo.exo2.services;

import exo.exo1.model.Produit;
import exo.exo2.DAO.ProduitDAO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import java.util.Date;
import java.util.List;

public class ProduitDAOimpl extends BaseService implements ProduitDAO  {

    public ProduitDAOimpl() {
        super();
    }

    @Override
    public boolean addProduit(Produit produit) {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        Session session = sessionFactory.openSession();
        org.hibernate.Transaction transac = null;

        try {
            session.save(produit);
        } catch (Exception e) {
            if (transac != null) {
                transac.rollback();
                e.printStackTrace();

                return false;
            }

        } finally {
            session.close();
            sessionFactory.close();
        }
        return true;
    }

    @Override
    public boolean updateProduit(Long produitId, int newStock) {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        Session session = sessionFactory.openSession();
        org.hibernate.Transaction transac = null;

        try {

            Produit p = session.load(Produit.class, produitId);
            p.setStock(newStock);
            session.update(p);

        } catch (Exception e) {
            if (transac != null) {
                transac.rollback();
                e.printStackTrace();

                return false;
            }

        } finally {
            session.close();
            sessionFactory.close();
        }
        return true;
    }


    @Override
    public boolean getProduitById(Long produitId) {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        Session session = sessionFactory.openSession();
        org.hibernate.Transaction transac = null;

        try {
            Produit p = session.get(Produit.class, produitId);
        } catch (Exception e) {
            if (transac != null) {
                transac.rollback();
                e.printStackTrace();

                return false;
            }

        } finally {
            session.close();
            sessionFactory.close();
        }
        return true;
    }

        @Override
        public List<Produit> getAllProduit () {
            StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
            SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
            Session session = sessionFactory.openSession();
            org.hibernate.Transaction transac = null;
            List<Produit> allProduit = null;

            try {
                Query<Produit> produitQuery = session.createQuery("from Produit");
                allProduit = produitQuery.list();

                for (Produit p : allProduit) {
                    System.out.println("Produit " + p);
                }

            } catch (Exception e) {
                if (transac != null) {
                    transac.rollback();
                    e.printStackTrace();

                    return null;
                }

            } finally {
                session.close();
                sessionFactory.close();
            }
            return allProduit;
        }

        @Override
        public boolean deleteProduit (Long produitId){
            StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
            SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
            Session session = sessionFactory.openSession();
            org.hibernate.Transaction transac = null;
            List<Produit> allProduit = null;

            try {
                Produit p = session.get(Produit.class, produitId);
                session.delete(p);

            } catch (Exception e) {
                if (transac != null) {
                    transac.rollback();
                    e.printStackTrace();

                    return false;
                }

            } finally {
                session.close();
                sessionFactory.close();
            }
            return true;
        }

        @Override
        public List<Produit> getProduitDateFilter (Date date1, Date date2){
            StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
            SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
            Session session = sessionFactory.openSession();
            org.hibernate.Transaction transac = null;
            List<Produit> rangeProduit = null;

            try {
                Query<Produit> produitQuery = session.createQuery("from Produit where dateAchat > :date1 and dateAchat < :date2");
                produitQuery.setParameter("date1", date1);
                produitQuery.setParameter("date2", date2);

            } catch (Exception e) {
                if (transac != null) {
                    transac.rollback();
                    e.printStackTrace();

                    return null;
                }

            } finally {
                session.close();
                sessionFactory.close();
            }
            return rangeProduit;
        }

        @Override
        public List<Produit> getProduitPriceFilter (Double price){
            StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
            SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
            Session session = sessionFactory.openSession();
            org.hibernate.Transaction transac = null;
            List<Produit> priceProduit = null;

            try {
                Query<Produit> produitQuery = session.createQuery("from Produit where prix > :price");
                produitQuery.setParameter("price", price);

            } catch (Exception e) {
                if (transac != null) {
                    transac.rollback();
                    e.printStackTrace();

                    return null;
                }

            } finally {
                session.close();
                sessionFactory.close();
            }
            return priceProduit;
        }

    @Override
    public List<Produit> getProduitByStockLevel(int stockLevel) {
        List<Produit> produitList = null;
        Query<Produit> produitQuery = session.createQuery("from Produit where stock < :stockLevel");
        produitQuery.setParameter("stockLevel", stockLevel);
        produitList = produitQuery.list();
        return produitList;
    }

    @Override
    public void valueProduitBrand(String brand) {
        double valueBrandProduct = (double) session.createQuery("select prix * stock from Produit where :brand").uniqueResult();
        System.out.println("La valeur actuelle du stock de "+ brand + " est "+ valueBrandProduct + " €");

    }

    @Override
    public List<Produit> getByBrand(String brand) throws Exception {
        if(brand != null){

            Query<Produit> produitQuery = session.createQuery("from Produit where marque like :brand ");
            produitQuery.setParameter("brand",brand);
            System.out.println(produitQuery);
            return produitQuery.list();
        }
        throw new Exception("erreur brand");
    }

    @Override
    public boolean deleteByBrand(String brand) throws Exception {
        session = sessionFactory.openSession();
        session.beginTransaction();
        List<Produit>selectedProduct = getByBrand(brand);
        session.delete(selectedProduct);
        session.getTransaction().commit();
        return true;
    }
}

