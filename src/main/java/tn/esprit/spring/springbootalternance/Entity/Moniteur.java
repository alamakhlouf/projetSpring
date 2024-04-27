package tn.esprit.spring.springbootalternance.Entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Moniteur")
public class Moniteur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numMoniteur")
    Long numMoniteur;

    @Column(name = "nomM")
    String nomM;

    @Column(name = "PrenomM")
    String PrenomM;

    @Column(name = "dateRecru")
    @Temporal(TemporalType.DATE)
    LocalDate dateRecru;
}
