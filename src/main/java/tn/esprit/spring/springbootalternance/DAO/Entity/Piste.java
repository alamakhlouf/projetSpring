package tn.esprit.spring.springbootalternance.DAO.Entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Piste")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Piste implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numPiste")
    private Long numPiste;

    @Column(name = "nomPiste")
    private String nomPiste;

    @Enumerated(EnumType.STRING)
    @Column(name = "couleur")
    private Couleur couleur;

    @Column(name = "longeur")
    private Integer longeur;

    @Column(name = "pente")
    private Integer pente;

    @ToString.Exclude
    @ManyToMany
    List<Skieur> skieur ;
}


enum Couleur {
    Vert,
    Bleu,
    Rouge,
    Noir,
}