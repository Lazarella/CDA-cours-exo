package exo.exo2.DAO;

import exo.exo1.model.Produit;

import java.util.Date;
import java.util.List;

public interface ProduitDAO {
    public boolean addProduit (Produit produit);
    public boolean updateProduit (Long produitId, int newStock);
    public boolean getProduitById (Long produitId);
    public List<Produit> getAllProduit();
    public boolean deleteProduit( Long produitId);
    public List<Produit> getProduitDateFilter(Date date1, Date date2);
    public List<Produit> getProduitPriceFilter(Double price);

    public List<Produit> getProduitByStockLevel(int stockLevel);
    public void valueProduitBrand(String brand);
    public List<Produit> getByBrand(String brand) throws Exception;

    public boolean deleteByBrand(String brand) throws Exception;


}
