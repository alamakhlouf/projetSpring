package tn.esprit.spring.springbootalternance.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.springbootalternance.DAO.Entity.Inscription;

import java.util.List;

public interface InscriptionRepository extends JpaRepository<Inscription, Long> {

   List<Inscription> findByCoursNumCours(long id);





}
