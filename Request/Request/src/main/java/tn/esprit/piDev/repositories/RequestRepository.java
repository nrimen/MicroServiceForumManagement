package tn.esprit.piDev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.piDev.entities.Interview;
import tn.esprit.piDev.entities.Request;

@Repository
public interface RequestRepository extends JpaRepository<
        Request, Long>{
}
