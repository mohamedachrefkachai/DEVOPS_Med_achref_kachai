package tn.esprit.tp_ski.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tp_ski.Entities.Skieur;

public interface SkieurRepository extends JpaRepository<Skieur,Long> {
}
