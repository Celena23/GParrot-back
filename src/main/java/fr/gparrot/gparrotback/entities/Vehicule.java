package fr.gparrot.gparrotback.entities;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonTypeId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


@Getter
@Setter
@ToString
@Entity
public class Vehicule {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marque;
//    @JsonFormat(pattern="yyyy-MM-dd")
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
//    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate dateVente;
    @OneToMany(mappedBy = "vehicule")
    private List <Photo> photo;

}
