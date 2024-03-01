package tn.esprit.piDev.services;

import tn.esprit.piDev.entities.Application;


import java.util.List;

public interface IApplicationService {
    public List<Application> retrieveAllApplications() ;
    public Application retrieveApplication(long idApplication) ;
    public Application addApplication(Application a) ;
    public void removeApplication(long idApplication) ;
    public Application modifyApplication(Application application) ;
}
