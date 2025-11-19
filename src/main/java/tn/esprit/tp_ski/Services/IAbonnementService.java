package tn.esprit.tp_ski.Services;

import tn.esprit.tp_ski.Entities.Abonnement;

import java.util.List;

public interface IAbonnementService {
    Abonnement addAbonnement(Abonnement abonnement);
    Abonnement updateAbonnement(Abonnement abonnement);
    void deleteAbonnement(Long id);
    Abonnement getAbonnementById(Long id);
    List<Abonnement> getAllAbonnement();
}
