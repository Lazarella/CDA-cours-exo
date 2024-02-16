package com.example.tp_hopital.controller.entity;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Consultation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_consultation", nullable = false)
    private int id;
    private Date dateConsultation;
    private String nomMedecin;
    private String prescription;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_patient_file")
    private FicheDeSoin ficheDeSoin;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_fiche_soin")
    private List<FicheDeSoin> ficheDeSoinList;
}
