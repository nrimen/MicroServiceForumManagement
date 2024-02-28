package tn.esprit.piDev.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.piDev.entities.Offer;
import tn.esprit.piDev.repositories.OfferRepository;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class OfferServiceImpl implements IOfferService{
    @Autowired
    OfferRepository offerRepository;
    public List<Offer> retrieveAllOffers() {
        return offerRepository.findAll();
    }


    public Offer retrieveOffer(long idOffer) {
        return offerRepository.findById(idOffer).get() ;
    }


    public Offer addOffer(Offer o) {
        return offerRepository.save(o);
    }


    public void removeOffer(long idOffer) {
        offerRepository.deleteById(idOffer);

    }


    public Offer modifyOffer(Offer offer) {
        return offerRepository.save(offer);
    }
}
