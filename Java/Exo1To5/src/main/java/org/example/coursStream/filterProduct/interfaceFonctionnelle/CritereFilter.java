package org.example.coursStream.filterProduct.interfaceFonctionnelle;

@FunctionalInterface
public interface CritereFilter {
    abstract boolean filter(Product product);
}
