package tn.esprit.tp_ski.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tp_ski.Entities.Inscription;

public interface InscriptionRepository extends JpaRepository<Inscription,Long> {
}
