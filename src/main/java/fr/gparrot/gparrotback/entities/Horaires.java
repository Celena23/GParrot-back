package fr.gparrot.gparrotback.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Time;
import java.time.LocalTime;

@Getter
@Setter
@ToString
@Entity
public class Horaires {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalTime morningWeekDayStart;
    private LocalTime morningWeekDayEnd ;
    private LocalTime afternoonWeekDayStart ;
    private LocalTime afternoonWeekDayEnd ;
    private LocalTime morningSaturdayStart ;
    private LocalTime morningSaturdayEnd ;

}
