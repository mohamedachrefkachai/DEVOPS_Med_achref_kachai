package tn.esprit.tp_ski.Controllers;

import org.springframework.web.bind.annotation.*;
import tn.esprit.tp_ski.Entities.Cours;
import tn.esprit.tp_ski.Services.ICoursService;


import java.util.List;

public class CoursController {
/*
    private final ICoursService coursService;
*/
    @PostMapping("/ajouterCours")
    public Cours ajouterCours(@RequestBody Cours Cours)

    {
        return coursService.addCours(Cours);
    }

    @PutMapping("/modifierCours")
    public Cours modifierCours(@RequestBody Cours Cours)

    {
        return coursService.updateCours(Cours);
    }

    @DeleteMapping("/supprimerCours/{id}")
    public void supprimerCours(@PathVariable Long id)
    {
        coursService.deleteCours(id);
    }

    @GetMapping("/getCours/{id}")
    public Cours get(@PathVariable Long id)
    {
        return coursService.getCoursById(id);
    }


    @GetMapping("/allCours")
    public List<Cours> allCours()
    {
        return coursService.getAllCours();
    }


}
