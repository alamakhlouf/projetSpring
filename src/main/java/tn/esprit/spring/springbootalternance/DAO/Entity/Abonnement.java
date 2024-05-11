package tn.esprit.spring.springbootalternance.DAO.Entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@Table(name = "Abonnement")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Abonnement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numAbon")
    Long numAbon;

    @Column(name = "dateDebut")
    @Temporal(TemporalType.DATE)
    LocalDate dateDebut;

    @Column(name = "dateFin")
    @Temporal(TemporalType.DATE)
    LocalDate dateFin ;

    @Column(name = "prixAbon")
    Float prixAbon ;

    @Column(name = "typeAbonnement")
    @Enumerated(EnumType.STRING)
    TypeAbonnement typeAbonnement;
}


enum TypeAbonnement {
    ANNULER,
    SEMESTRIEL,
    MENSULE,
}