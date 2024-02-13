package com.example.demo_spring.service;

import com.example.demo_spring.model.Cat;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class CatService {
    private final Map<UUID, Cat> cats;

    public CatService() {
        cats = new HashMap<>();
        Cat catA = Cat.builder()
                .id(UUID.randomUUID())
                .name("O Maley")
                .breed("Main Coon")
                .build();
        Cat catB = Cat.builder()
                .id(UUID.randomUUID())
                .name("Duchesse")
                .breed("Persan")
                .build();
        Cat catC = Cat.builder()
                .id(UUID.randomUUID())
                .name("Berlioz")
                .breed("Munchkin")
                .build();

        cats.put(catA.getId(), catA);
        cats.put(catB.getId(), catB);
        cats.put(catC.getId(), catC);
    }
    public List<Cat> getCats(){
        return cats.values().stream().toList();
    }
    public Cat getCatById(UUID id){
        return cats.values().stream().filter(c -> c.getId().equals(id)).findFirst().orElse(null);
        // return cats.get(id);  C'est plus simple ^^'
    }

}
