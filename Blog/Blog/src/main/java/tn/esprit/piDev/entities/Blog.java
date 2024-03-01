package tn.esprit.piDev.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.esprit.piDev.entities.enumerations.Categorie;

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
public class Blog implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    long idBlog ;

    String comment ;

    @Temporal(TemporalType.DATE)
    Date publishDate ;

    String title ;

    String Image;
    @Enumerated(EnumType.STRING)
    Categorie categorie;

}