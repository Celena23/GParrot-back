package fr.gparrot.gparrotback.entities;


import com.fasterxml.jackson.annotation.JsonTypeId;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Getter
@Setter
@ToString
public class Vehicule {

    private Long id;
    private String marque;
    private LocalDate miseCirculation;
    private Float kilometrage;
    private String description;
    private String modele;
    private String version;
    private String puissance;
    private String carburant;
    private String transmission;
    private String co2;
    private String couleur;
    private Float prix;
    private LocalDate dateVente;
    private String photos;
}
