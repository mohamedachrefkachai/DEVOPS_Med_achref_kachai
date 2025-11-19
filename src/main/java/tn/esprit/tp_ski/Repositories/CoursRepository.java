package tn.esprit.tp_ski.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tp_ski.Entities.Cours;

public interface CoursRepository extends JpaRepository<Cours,Long> {
}
