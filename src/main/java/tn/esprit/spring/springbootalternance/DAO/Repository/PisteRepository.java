package tn.esprit.spring.springbootalternance.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.springbootalternance.DAO.Entity.Piste;

import java.util.List;

public interface PisteRepository extends JpaRepository<Piste, Long> {

    List<Piste> findAllBySkieurNumSkieur(Long numSkieur);

    List<Piste> findBySkieurNomSkieurLikeAndSkieurInscriptionNumInscription(String nomSkieur, Long numInscription);

    List<Piste> findBySkieurNomSkieurLike(String nom);
}
