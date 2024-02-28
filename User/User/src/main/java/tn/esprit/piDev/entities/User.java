package tn.esprit.piDev.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.esprit.piDev.entities.enumerations.Role;
import tn.esprit.piDev.entities.enumerations.SectorOfActivity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    long idUser ;

    String firstName ;
    String lastName ;
    String email ;
    String password ;

    @Temporal(TemporalType.DATE)
    Date birthDate ;

    @Temporal(TemporalType.DATE)
    LocalDate inscriptionDate ;

    String address ;

    @Enumerated(EnumType.STRING)
    Role role ;

    String immatriculationNumber ;

    @Enumerated(EnumType.STRING)
    SectorOfActivity sectorOfActivity ;

    String levelOfStudies ;
    String domainOfStudies ;




}
