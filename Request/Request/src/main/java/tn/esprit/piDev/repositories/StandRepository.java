package tn.esprit.piDev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.piDev.entities.Stand;
@Repository
public interface StandRepository extends JpaRepository<Stand, Long> {
}
