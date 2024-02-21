package com.example.demospringdatarest.exo_candy_shop.repository;

import com.example.demospringdatarest.exo_candy_shop.entity.DetailOrderCandy;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailOrderRepository extends JpaRepository<DetailOrderCandy, Long> {
}
