package tn.esprit.piDev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.piDev.entities.Interview;

@Repository
public interface InterviewRepository extends JpaRepository<
    Interview, Long>{
}
