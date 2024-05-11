package tn.esprit.spring.springbootalternance.DAO.Entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Skieur")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@ToString
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

    @Column(name = "ville")
    String ville;

    @ManyToMany(mappedBy = "skieur")
    @ToString.Exclude
    List<Piste> piste;

    @OneToMany(mappedBy = "skieur")
    @ToString.Exclude
    List<Inscription> inscription;

    @OneToOne
    @ToString.Exclude
    Abonnement abonnement;
}
