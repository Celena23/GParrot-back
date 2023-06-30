package fr.gparrot.gparrotback.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Horaires {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



}
