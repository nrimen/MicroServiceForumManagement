package tn.esprit.piDev.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.piDev.entities.Request;
import tn.esprit.piDev.services.IRequestService;
import tn.esprit.piDev.services.RequestService;

import java.util.List;

@Tag(name = "Ce Web Service gère le CRUD pour une Request")
@RestController
@AllArgsConstructor
@RequestMapping("/request")
public class RequestRestController {

    @Autowired
    IRequestService requestService;

    // http://localhost:8089/piDev/request/retrieve-all-requests
    @Operation(description = "Ce web service permet de récupérer toutes les requests de la base de données")
     
    @GetMapping("/retrieve-all-requests")
    public List<Request> getRequests() {
        List<Request> listRequests = requestService.retrieveAllRequests();
        return listRequests;
    }
    // http://localhost:8089/piDev/request/retrieve-request/8
     
    @GetMapping("/retrieve-request/{request-id}")
    public Request retrieveRequest(@PathVariable("request-id") Long chId) {
        Request request = requestService.retrieveRequest(chId);
        return request;
    }

    // http://localhost:8089/piDev/request/add-request
     
    @PostMapping("/add-request")
    public Request addRequest(@RequestBody Request c) {
        Request request = requestService.addRequest(c);
        return request;
    }

    // http://localhost:8089/piDev/request/remove-request/{request-id}
     
    @DeleteMapping("/remove-request/{request-id}")
    public void removeRequest(@PathVariable("request-id") Long chId) {
        requestService.removeRequest(chId);
    }

    // http://localhost:8089/piDev/request/modify-request
     
    @PutMapping("/modify-request")
    public Request modifyRequest(@RequestBody Request c) {
        Request request = requestService.modifyRequest(c);
        return request;
    }


}
