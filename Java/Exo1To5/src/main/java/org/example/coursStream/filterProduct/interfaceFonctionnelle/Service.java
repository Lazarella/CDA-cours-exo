package org.example.coursStream.filterProduct.interfaceFonctionnelle;
import org.example.coursStream.filterProduct.interfaceFonctionnelle.CritereFilter;
import org.example.coursStream.filterProduct.interfaceFonctionnelle.Product;

import java.util.ArrayList;
import java.util.List;

public class Service {
    private List<Product> products;

        public static List<Product> filterProducts(List<Product> products, CritereFilter critere) {
            List<Product> filteredProducts = new ArrayList<>();
            for (Product p : products) {
                if (critere.filter(p)) {
                    filteredProducts.add(p);
                }
            }
            return filteredProducts;
        }
}
