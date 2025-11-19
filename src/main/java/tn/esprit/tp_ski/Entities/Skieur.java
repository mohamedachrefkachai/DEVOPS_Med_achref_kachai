package tn.esprit.tp_ski.Entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Skieur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numSkieur;
    private String nomS;
    private String prenomS;
    private LocalDate dateNaissance;
    private String ville;

    @OneToMany(mappedBy = "skieur")
    private Set<Inscription> inscriptions;

    @ManyToMany
    private Set<Piste> pistes;

    @OneToOne
    private Abonnement abonnement;
}
