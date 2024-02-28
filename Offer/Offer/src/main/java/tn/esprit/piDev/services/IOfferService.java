package tn.esprit.piDev.services;

import tn.esprit.piDev.entities.Offer;

import java.util.List;

public interface IOfferService {
    public List<Offer> retrieveAllOffers() ;
    public Offer retrieveOffer(long idOffer) ;
    public Offer addOffer(Offer o) ;
    public void removeOffer(long idOffer) ;
    public Offer modifyOffer(Offer offer) ;
}
