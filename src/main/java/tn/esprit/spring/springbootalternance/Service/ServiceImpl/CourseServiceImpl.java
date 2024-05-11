package tn.esprit.spring.springbootalternance.Service.ServiceImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.springbootalternance.DAO.Entity.Cours;
import tn.esprit.spring.springbootalternance.DAO.Repository.CoursRepository;
import tn.esprit.spring.springbootalternance.Service.ServiceInterface.CoursServiceInterface;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CoursServiceInterface {

    CoursRepository coursRepository ;
    @Override
    public Cours getCoursByInscriptionId(Long id) {
        return coursRepository.findByInscriptionsNumInscription(id);
    }
}
