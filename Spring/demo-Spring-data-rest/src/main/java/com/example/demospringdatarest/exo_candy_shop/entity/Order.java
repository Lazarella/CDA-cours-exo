package com.example.demospringdatarest.exo_candy_shop.entity;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="order_candy")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String clientName;
    private LocalDate orderDate = LocalDate.now();

    @ManyToMany
    private List<Candy> candyList;

    @JsonUnwrapped
    private OrderStatus orderStatus;

    @OneToMany(mappedBy = "orderCandy")
    private List<DetailOrderCandy> detailOrderCandyList;
}
