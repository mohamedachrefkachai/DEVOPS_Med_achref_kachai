package tn.esprit.tp_ski.Services;

import tn.esprit.tp_ski.Entities.Piste;

import java.util.List;

public interface IPisteService {

    Piste addPiste(Piste piste);
    Piste updatePiste(Piste piste);
    void deletePiste(Long id);
    Piste getPisteById(Long id);
    List<Piste> getAllPiste();
}
