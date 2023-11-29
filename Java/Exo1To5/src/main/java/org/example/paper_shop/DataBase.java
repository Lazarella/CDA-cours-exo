package org.example.paper_shop;

import java.util.HashMap;
import java.util.Set;


public class DataBase {
    private Item item;
    private HashMap<Integer, Item> hashMap;


    public DataBase() {
        hashMap = new HashMap<>();
        hashMap.put(1, new Pen("Stylo", 1.20, "Bleu"));
        hashMap.put(2, new Pen("Stylo", 1.20, "Bleu"));
        hashMap.put(3, new Pen("Stylo", 1.20, "Bleu"));
        hashMap.put(4, new Pen("Stylo", 1.20, "Bleu"));
        hashMap.put(5, new Pen("Stylo", 1.20, "Bleu"));
        hashMap.put(6, new Pen("Surligneur", 1.70, "Mauve"));
        hashMap.put(7, new Pen("Surligneur", 1.70, "Turquoise"));
        hashMap.put(8, new Pen("Surligneur", 1.70, "Abricot"));
        hashMap.put(9, new Pen("Surligneur", 1.70, "Carmin"));
        hashMap.put(10, new Pen("Stylo", 1.20, "Noir"));
        hashMap.put(11, new Pen("Stylo", 1.20, "Noir"));
        hashMap.put(12, new Pen("Stylo", 1.20, "Noir"));
        hashMap.put(13, new Pen("Stylo", 1.20, "Noir"));
        hashMap.put(14, new Pen("Stylo", 1.20, "Rouge"));
        hashMap.put(15, new Pen("Stylo", 1.20, "Rouge"));
        hashMap.put(16, new Pen("Stylo", 1.20, "Rouge"));
        hashMap.put(17, new Pen("Stylo", 1.20, "Rouge"));
        hashMap.put(18, new Pen("Stylo", 1.20, "Rouge"));
        hashMap.put(19, new Pen("Stylo", 1.20, "Rouge"));
        hashMap.put(20, new Pen("Stylo", 1.20, "Rouge"));
        hashMap.put(21, new Pen("Stylo", 1.20, "Rouge"));
        hashMap.put(22, new Paper("Papier", 3.20, 90));
        hashMap.put(23, new Paper("Papier", 3.20, 90));
        hashMap.put(24, new Paper("Papier", 3.20, 90));
        hashMap.put(25, new Paper("Papier", 3.90, 120));
        hashMap.put(26, new Paper("Papier", 3.90, 120));
        hashMap.put(27, new Paper("Papier", 3.90, 120));
        hashMap.put(28, new Paper("Super Papier", 3.90, 120));
        hashMap.put(29, new Paper("Super Papier", 3.90, 120));
        hashMap.put(30, new Paper("Super Papier", 3.90, 120));
    }

//    public Item getHashMap() {
//        return hashMap.get();
//    }
    public boolean containsKey(Integer itemRef){
        return hashMap.containsKey(itemRef);
    }

    public Item getItem(Integer itemRef) {
        return hashMap.get(itemRef);
    }
}
