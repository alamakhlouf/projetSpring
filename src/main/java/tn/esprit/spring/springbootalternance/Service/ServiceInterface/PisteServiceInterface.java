package tn.esprit.spring.springbootalternance.Service.ServiceInterface;

import tn.esprit.spring.springbootalternance.DAO.Entity.Piste;

import java.util.List;

public interface PisteServiceInterface {
    List<Piste> retrieveAllPistes();

    Piste addPiste(Piste piste);

    Piste updatePiste(Piste piste);

    Piste retrievePiste(Long numPiste);
}
