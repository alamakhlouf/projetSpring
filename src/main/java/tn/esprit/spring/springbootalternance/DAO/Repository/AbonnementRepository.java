package tn.esprit.spring.springbootalternance.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.springbootalternance.DAO.Entity.Abonnement;

public interface AbonnementRepository extends JpaRepository<Abonnement, Long> {
}
