package com.example.demospringdatarest.exo_candy_shop.repository;

import com.example.demospringdatarest.exo_candy_shop.entity.Candy;
import com.example.demospringdatarest.exo_candy_shop.entity.MagicEffect;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource (path = "candies")
public interface CandyRepository extends JpaRepository<Candy, Long> {
    List<Candy> findAllByNameContaining(String str);
    Candy findByMagicEffect(MagicEffect magicEffect);
    List<Candy> findAllByPriceIsBetween(Double min ,Double max );

}
