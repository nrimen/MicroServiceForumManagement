package tn.esprit.piDev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.piDev.entities.User;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User , Long> {
    public Optional<User> findByFirstName(String firstName ) ;
    public Optional<User> findByLastName (String lastName) ;
    public Optional<User> findByEmail (String email) ;

}
