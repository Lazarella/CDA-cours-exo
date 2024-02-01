package com.example.tp_hopital.controller.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FicheDeSoin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_fiche_soin", nullable = false)
    private Long id;
    String typeDeSoin;
    int duree;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_consultation")
    private Consultation consultation;

}
