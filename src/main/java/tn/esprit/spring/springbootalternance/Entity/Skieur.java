package tn.esprit.spring.springbootalternance.Entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "Skieur")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Skieur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numSkieur")
    Long numSkieur;
    @Column(name = "nomSkieur")
    String nomSkieur;

    @Column(name = "prenomSkieur")
    String prenomSkieur;

    @Column(name = "dateNaissance")
    @Temporal(TemporalType.DATE)
    LocalDate dateNaissance;

    @Column(name="ville")
    String ville;
}
