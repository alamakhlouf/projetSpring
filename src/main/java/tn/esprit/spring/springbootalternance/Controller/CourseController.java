package tn.esprit.spring.springbootalternance.Controller;

import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.springbootalternance.DAO.Entity.Cours;
import tn.esprit.spring.springbootalternance.Service.ServiceImpl.CourseServiceImpl;
import tn.esprit.spring.springbootalternance.Service.ServiceInterface.CoursServiceInterface;

@RestController
@AllArgsConstructor
@RequestMapping("/cours")
public class CourseController {
    CoursServiceInterface coursServiceInterface ;

    @GetMapping("/getcourse/{inscriptionId}")
    public Cours getCoursByInscriptionId(@PathVariable Long inscriptionId) {
        return coursServiceInterface.getCoursByInscriptionId(inscriptionId);
    }
}
