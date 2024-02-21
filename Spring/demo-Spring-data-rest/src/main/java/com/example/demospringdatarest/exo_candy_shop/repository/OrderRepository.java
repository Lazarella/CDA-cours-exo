package com.example.demospringdatarest.exo_candy_shop.repository;

import com.example.demospringdatarest.exo_candy_shop.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
}
