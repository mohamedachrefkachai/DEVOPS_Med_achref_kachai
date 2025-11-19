package tn.esprit.tp_ski.Services;

import tn.esprit.tp_ski.Entities.Moniteur;

import java.util.List;

public interface IMoniteurService {
    Moniteur addMoniteur(Moniteur moniteur);
    Moniteur updateMoniteur(Moniteur moniteur);
    void deleteMoniteur(Long id);
    Moniteur getMoniteurById(Long id);
    List<Moniteur> getAllMoniteur();
}
