package tn.esprit.tp_ski.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tp_ski.Entities.Abonnement;
import tn.esprit.tp_ski.Repositories.AbonnementRepository;

import java.util.List;

@Service
public class IAbonnementServiceImp implements IAbonnementService{

    @Autowired
    private AbonnementRepository abonnementRepository;

    @Override
    public Abonnement addAbonnement(Abonnement abonnement) {
        return abonnementRepository.save(abonnement);
    }

    @Override
    public Abonnement updateAbonnement(Abonnement abonnement) {
        return abonnementRepository.save(abonnement);
    }

    @Override
    public void deleteAbonnement(Long id) {
        abonnementRepository.deleteById(id);
    }

    @Override
    public Abonnement getAbonnementById(Long id) {
        return abonnementRepository.findById(id).orElse(null);
    }

    @Override
    public List<Abonnement> getAllAbonnement() {
        return abonnementRepository.findAll();
    }
}
