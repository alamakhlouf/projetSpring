package tn.esprit.spring.springbootalternance.DAO.Entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Table(name = "Cours")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Cours {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numCours")
    Long numCours;

    @Column(name = "niveau")
    int niveau;

    @Column(name = "typeCours")
    @Enumerated(EnumType.STRING)
    TypeCours typeCours;

    @Column(name = "support")
    @Enumerated(EnumType.STRING)
    Support support;
    @Column(name = "prix")
    float prix;

    @Column(name = "cerneau")
    int cerneau;

    @OneToMany(mappedBy = "cours")
    List<Inscription> inscriptions;

}

enum Support {
    SKI,
    SNOWBOARD,
}

enum TypeCours {
    COLLECTIF_ENFANT,
    COLLECTIF_ADULTE,
    PARTICULIER,
}