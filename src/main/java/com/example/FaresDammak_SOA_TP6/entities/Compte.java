package com.example.FaresDammak_SOA_TP6.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import javax.xml.crypto.Data;
import java.util.Date;

@Getter//pour generer getters automatiquement
@Setter//pour generer setters automatiquemente
@Entity//considerer comme une base de donnee
@ToString//pour generer la methode ToString automatiquemente
@NoArgsConstructor
@AllArgsConstructor
public class Compte {
    @Id//l'atribut id est un cle primaire
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double solde;
    private Date date;
    private TypeCompte type;
    private EtatCompte etat;



}

