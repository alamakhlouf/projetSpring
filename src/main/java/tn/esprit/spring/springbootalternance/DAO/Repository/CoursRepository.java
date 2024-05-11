package tn.esprit.spring.springbootalternance.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.springbootalternance.DAO.Entity.Cours;

public interface CoursRepository extends JpaRepository<Cours,Long> {
}
