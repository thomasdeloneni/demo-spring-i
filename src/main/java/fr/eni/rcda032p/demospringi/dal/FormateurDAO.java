package fr.eni.rcda032p.demospringi.dal;

import fr.eni.rcda032p.demospringi.bo.Formateur;

import java.util.List;


public interface FormateurDAO {

    void create(Formateur formateur);
    List<Formateur> findall();

    Formateur read(String emailFormateur);
}
