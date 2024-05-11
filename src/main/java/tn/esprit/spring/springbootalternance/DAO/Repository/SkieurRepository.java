package tn.esprit.spring.springbootalternance.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.springbootalternance.DAO.Entity.Skieur;

@Repository
public interface SkieurRepository extends JpaRepository<Skieur,Long> {

}
