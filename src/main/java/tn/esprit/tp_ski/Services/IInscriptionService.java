package tn.esprit.tp_ski.Services;

import tn.esprit.tp_ski.Entities.Inscription;

import java.util.List;

public interface IInscriptionService {
    Inscription addInscription(Inscription inscription);
    Inscription updateInscription(Inscription inscription);
    void deleteInscription(Long id);
    Inscription getInscriptionById(Long id);
    List<Inscription> getAllInscription();
}
