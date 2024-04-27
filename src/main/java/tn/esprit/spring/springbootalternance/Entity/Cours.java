package tn.esprit.spring.springbootalternance.Entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

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