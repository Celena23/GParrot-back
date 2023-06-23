package fr.gparrot.gparrotback.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Employe {
    @Id
    private Long id;
    private String name;
    private String firstname;
    private String password;
    private String identifier;
    private Boolean admin;
}
