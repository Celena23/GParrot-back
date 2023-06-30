package fr.gparrot.gparrotback.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "TEXT")
    private String servicemeca;
    @Column(columnDefinition = "TEXT")
    private String servicecaro;
    @Column(columnDefinition = "TEXT")
    private String serviceentretien;

}
