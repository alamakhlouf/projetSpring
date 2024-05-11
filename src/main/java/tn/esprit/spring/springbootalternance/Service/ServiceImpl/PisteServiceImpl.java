package tn.esprit.spring.springbootalternance.Service.ServiceImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.springbootalternance.DAO.Entity.Piste;
import tn.esprit.spring.springbootalternance.DAO.Repository.PisteRepository;
import tn.esprit.spring.springbootalternance.Service.ServiceInterface.PisteServiceInterface;

import java.util.List;

@Service
@AllArgsConstructor
public class PisteServiceImpl implements PisteServiceInterface {

    PisteRepository pisteRepository ;

    @Override
    public List<Piste> retrieveAllPistes() { return pisteRepository.findAll(); }

    @Override
    public Piste addPiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Piste retrievePiste(Long numPiste) {
        return pisteRepository.findById(numPiste).orElse(null);
    }
}
