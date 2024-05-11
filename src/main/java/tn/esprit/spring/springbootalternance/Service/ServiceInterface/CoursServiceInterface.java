package tn.esprit.spring.springbootalternance.Service.ServiceInterface;

import tn.esprit.spring.springbootalternance.DAO.Entity.Cours;

public interface CoursServiceInterface {

    Cours getCoursByInscriptionId(Long id);
}
