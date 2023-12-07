package org.example.oservable.gestionnnaire_stock;

public class Supplier implements Observer<Integer> {

    @Override
    public void update(Integer stock) {
        System.out.println("new stock ! "+stock);
    }
}
