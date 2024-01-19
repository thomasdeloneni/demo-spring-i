package fr.eni.rcda032p.demospringi.bll;

import fr.eni.rcda032p.demospringi.bo.Formateur;

import java.util.List;

public interface FormateurService {

    void add(String nom, String prenom, String email);

    List<Formateur> getFormateurs();

    Formateur findByEmail(String emailFormateur);
}
