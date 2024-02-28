package tn.esprit.piDev.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Application implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    long idApplication ;

    boolean discussion ;
    boolean isAccepted ;

    @ManyToOne
    Offer offerApplication;


    @OneToOne(mappedBy="applicationInterview")
    private Interview interviewApplication;

}
