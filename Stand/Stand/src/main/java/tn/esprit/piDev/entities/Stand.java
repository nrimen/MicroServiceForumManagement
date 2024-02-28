package tn.esprit.piDev.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.esprit.piDev.entities.enumerations.Pack;

import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Stand implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    long idStand ;

    @Temporal(TemporalType.DATE)
    Date reservationDate ;

    @Enumerated(EnumType.STRING)
    Pack pack ;

    float price ;
    String Gallery ;
    boolean isReserved ;
    boolean isFinished ;
    boolean isPartner ;
    String immatriculationStand ;




}
