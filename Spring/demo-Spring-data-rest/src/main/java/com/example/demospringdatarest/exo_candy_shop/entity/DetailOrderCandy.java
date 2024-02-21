package com.example.demospringdatarest.exo_candy_shop.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DetailOrderCandy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "candy_id")
    private Candy candy;

    @ManyToOne
    @JoinColumn(name = "order_candy_id")
    private Order orderCandy;

    private Integer quantity;


}
