package fr.gparrot.gparrotback.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    @Column(columnDefinition = "TEXT")
    private String photo;
    @ManyToOne
    private Vehicule vehicule;
}
