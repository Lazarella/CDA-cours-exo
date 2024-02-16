package org.example.coursStream.filterProduct.interfaceFonctionnelle;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> myStore = Arrays.asList(
                new Product("Casque sans fil",120, "Audio" ),
                new Product("Baffle unitaire",80, "Audio" ),
                new Product("Casque sans fil",120, "Audio" ),
                new Product("Ecran 28p",210, "Informatique" ),
                new Product("pad numérique",120, "Informatique" ),
                new Product("Ecouteurs sans fil",120, "Audio" )
        );
        List<Product> filterProducts = Service.filterProducts(myStore, (p) -> p.getPrice() > 50);
        System.out.println(filterProducts);
        filterProducts = Service.filterProducts(myStore, (p)-> p.getPrice() > 20 && p.getCategory().equals("c1"));
        System.out.println(filterProducts);
    }
}

