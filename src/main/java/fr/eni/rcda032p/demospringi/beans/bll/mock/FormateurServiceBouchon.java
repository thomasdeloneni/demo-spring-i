package fr.eni.rcda032p.demospringi.beans.bll.mock;

import fr.eni.rcda032p.demospringi.beans.bll.FormateurService;
import fr.eni.rcda032p.demospringi.beans.bo.Formateur;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@Profile("dev")
public class FormateurServiceBouchon implements FormateurService {
    private static final List<Formateur> formateurs;

    static {
        formateurs = new ArrayList<>();
        formateurs.add(new Formateur("Baille", "Anne-lise", "abaille@campus-eni.fr"));
        formateurs.add(new Formateur("Gobin", "Stéphane", "sgobin@campus-eni.fr"));
        formateurs.add(new Formateur("Macé", "Cyril", "cmace@campus-eni.fr"));
    }


    @Override
    public void add(String nom, String prenom, String email) {
       formateurs.add(new Formateur(nom, prenom, email));
    }

    @Override
    public List<Formateur> getFormateurs() {
        return formateurs;
    }
}
