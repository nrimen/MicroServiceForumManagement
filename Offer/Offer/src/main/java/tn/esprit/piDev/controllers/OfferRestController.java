package tn.esprit.piDev.controllers;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.piDev.entities.Offer;
import tn.esprit.piDev.services.IOfferService;

import java.util.List;

@Slf4j
@RestController
@AllArgsConstructor

@RequestMapping("/offer")
public class OfferRestController {
    @Autowired
    IOfferService offerService ;


    @GetMapping("/retrieve-all-offers")
    public List<Offer> getOffers() {
        List<Offer> listOffers = offerService.retrieveAllOffers() ;
        return listOffers ;
    }

    @GetMapping("/retrieve-offer/{idOffer}")
    public Offer retrieveOffer(@PathVariable("idOffer") long idOffer) {
        Offer  offer=offerService.retrieveOffer(idOffer) ;
        return offer ;
    }


    @PostMapping("/add-offer")
    public Offer addOffer(@RequestBody Offer o) {
        Offer offer=offerService.addOffer(o) ;
        return offer ;
    }

    @DeleteMapping("/remove-offer/{idOffer}")
    public void removeOffer(@PathVariable("idOffer") long idOffer) {
        offerService.removeOffer(idOffer);
    }

    @PutMapping("/modify-offer")
    public Offer modifyOffer(@RequestBody Offer o) {
        Offer offer=offerService.modifyOffer(o) ;
        return offer ;
    }
}
