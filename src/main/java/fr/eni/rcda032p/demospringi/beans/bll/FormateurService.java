package fr.eni.rcda032p.demospringi.beans.bll;

import fr.eni.rcda032p.demospringi.beans.bo.Formateur;

import java.util.List;

public interface FormateurService {

    void add(String nom, String prenom, String email);

    List<Formateur> getFormateurs();
}
