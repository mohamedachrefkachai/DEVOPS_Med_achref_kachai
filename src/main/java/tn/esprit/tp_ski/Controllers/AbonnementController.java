package tn.esprit.tp_ski.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp_ski.Entities.Abonnement;
import tn.esprit.tp_ski.Services.IAbonnementService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/abonnement")

public class AbonnementController {

    private final IAbonnementService abonnementService;

    @PostMapping("/ajouterAbonnement")
    public Abonnement ajouterAbonnement(@RequestBody Abonnement abonnement)

    {
        return abonnementService.addAbonnement(abonnement);
    }

    @PutMapping("/modifierAbonnement")
    public Abonnement modifierAbonnement(@RequestBody Abonnement abonnement)

    {
        return abonnementService.updateAbonnement(abonnement);
    }

    @DeleteMapping("/supprimerAbonnement/{id}")
    public void supprimerAbonnement(@PathVariable Long id)
    {
        abonnementService.deleteAbonnement(id);
    }

    @GetMapping("/getAbonnement/{id}")
    public Abonnement getAbonnement(@PathVariable Long id)
    {
        return abonnementService.getAbonnementById(id);
    }


    @GetMapping("/allAbonnement")
    public List<Abonnement> allAbonnement()
    {
        return abonnementService.getAllAbonnement();
    }


}
