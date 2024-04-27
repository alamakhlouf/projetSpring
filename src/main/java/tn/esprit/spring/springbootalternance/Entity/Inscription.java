package tn.esprit.spring.springbootalternance.Entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "Inscription")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Inscription {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numInscription")
    Long numInscription;
    @Column(name = "numSemaine")
    int numSemaine;
}
