package fr.gparrot.gparrotback.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Employe {
    private Long id;
    private String name;
    private String firstname;
    private String password;
    private String identifier;
}
