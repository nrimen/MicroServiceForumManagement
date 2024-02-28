package tn.esprit.piDev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.piDev.entities.Offer;

@Repository
public interface OfferRepository extends JpaRepository <Offer,Long> {
}
