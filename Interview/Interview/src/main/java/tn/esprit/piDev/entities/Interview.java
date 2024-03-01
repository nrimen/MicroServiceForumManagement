package tn.esprit.piDev.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.esprit.piDev.entities.enumerations.InterviewType;

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
public class Interview implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    long idInterview ;

    @Enumerated(EnumType.STRING)
    InterviewType interviewType ;

    @Temporal(TemporalType.DATE)
    Date interviewDate ;

    String classRoom ;
    String link ;

    @OneToOne
    private Application applicationInterview;
}
