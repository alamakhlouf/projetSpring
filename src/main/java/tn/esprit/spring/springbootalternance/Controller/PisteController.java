package tn.esprit.spring.springbootalternance.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.springbootalternance.DAO.Entity.Piste;
import tn.esprit.spring.springbootalternance.Service.ServiceInterface.PisteServiceInterface;
import java.util.List;

@RestController
@RequestMapping("/Piste")
@AllArgsConstructor
public class PisteController {

    PisteServiceInterface pisteServiceInterface ;

    @GetMapping
    public List<Piste> retrieveAllPistes() {
        return pisteServiceInterface.retrieveAllPistes();
    }

    @PostMapping("/addPiste")
    public Piste addPiste(@RequestBody Piste piste) {
        return pisteServiceInterface.addPiste(piste);
    }

    @PostMapping("/updatePiste")
    public Piste updatePiste(Piste piste) {
        return pisteServiceInterface.updatePiste(piste);
    }

    @GetMapping("/getById")
    public Piste retrievePiste(Long numPiste) {
        return pisteServiceInterface.retrievePiste(numPiste);
    }
}
