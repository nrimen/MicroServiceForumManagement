package tn.esprit.piDev.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.piDev.entities.Application;
import tn.esprit.piDev.entities.Offer;
import tn.esprit.piDev.repositories.ApplicationRepository;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class ApplicationServiceImpl  implements IApplicationService{
   @Autowired
    ApplicationRepository applicationRepository ;
    public List<Application> retrieveAllApplications() {
        return applicationRepository.findAll();
    }


    public Application retrieveApplication(long idApplication) {
        return applicationRepository.findById(idApplication).get();
    }





    public Application addApplication(Application a) {
        return applicationRepository.save(a);
    }


    public void removeApplication(long idApplication) {
        applicationRepository.deleteById(idApplication);
    }


    public Application modifyApplication(Application application) {
        return applicationRepository.save(application);
    }
}
