package tn.esprit.tp_ski.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tp_ski.Entities.Piste;

public interface PisteRepository extends JpaRepository<Piste,Long> {
}
