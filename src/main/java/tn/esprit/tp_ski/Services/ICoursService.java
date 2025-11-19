package tn.esprit.tp_ski.Services;

import tn.esprit.tp_ski.Entities.Cours;

import java.util.List;

public interface ICoursService {
    Cours addCours(Cours cours);
    Cours updateCours(Cours cours);
    void deleteCours(Long id);
    Cours getCoursById(Long id);
    List<Cours> getAllCours();
}
