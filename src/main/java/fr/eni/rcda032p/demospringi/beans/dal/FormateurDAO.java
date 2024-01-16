package fr.eni.rcda032p.demospringi.beans.dal;

import fr.eni.rcda032p.demospringi.beans.bo.Formateur;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface FormateurDAO {

    void create(Formateur formateur);
    List<Formateur> findall();
}
