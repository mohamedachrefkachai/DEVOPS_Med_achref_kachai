package tn.esprit.tp_ski.Services;

import tn.esprit.tp_ski.Entities.Skieur;

import java.util.List;

public interface ISkieurService {

    Skieur addSkieur(Skieur skieur);
    Skieur updateSkieur(Skieur skieur);
    void deleteSkieur(Long id);
    Skieur getSkieurById(Long id);
    List<Skieur> getAllSkieur();
}
