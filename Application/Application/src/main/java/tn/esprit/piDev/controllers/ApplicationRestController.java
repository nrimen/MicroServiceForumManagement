package tn.esprit.piDev.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.*;
import tn.esprit.piDev.entities.Application;
import tn.esprit.piDev.services.IApplicationService;

import java.util.List;

@Tag(name = "Ce Web Service gère le CRUD pour une Application")
@RestController

@AllArgsConstructor
@RequestMapping("/application")
public class ApplicationRestController {


    @Autowired
    IApplicationService applicationService;

    // http://localhost:8089/piDev/application/retrieve-all-applications
    @Operation(description = "Ce web service permet de récupérer toutes les applications de la base de données")

    @GetMapping("/retrieve-all-applications")
    public List<Application> getApplications() {
        List<Application> listApplications = applicationService.retrieveAllApplications();
        return listApplications;
    }
    // http://localhost:8089/piDev/application/retrieve-application/8

    @GetMapping("/retrieve-application/{application-id}")
    public Application retrieveApplication(@PathVariable("application-id") Long chId) {
        Application application = applicationService.retrieveApplication(chId);
        return application;
    }

    // http://localhost:8089/piDev/application/add-application

    @PostMapping("/add-application")
    public Application addApplication(@RequestBody Application c) {
        Application application = applicationService.addApplication(c);
        return application;
    }

    // http://localhost:8089/piDev/application/remove-application/{application-id}

    @DeleteMapping("/remove-application/{application-id}")
    public void removeApplication(@PathVariable("application-id") Long chId) {
        applicationService.removeApplication(chId);
    }

    // http://localhost:8089/piDev/application/modify-application

    @PutMapping("/modify-application")
    public Application modifyApplication(@RequestBody Application app) {
        Application application = applicationService.modifyApplication(app);
        return application;
    }


}
