package fr.eni.rcda032p.demospringi.dal.mock;

import fr.eni.rcda032p.demospringi.bo.Formateur;
import fr.eni.rcda032p.demospringi.dal.FormateurDAO;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class FormateurDAOBouchon implements FormateurDAO {

    private static List<Formateur> formateurs;

    public FormateurDAOBouchon() {
        formateurs = new ArrayList<Formateur>();
        formateurs.add(new Formateur("Baille", "Anne-Lise", "abaille@campus-eni.fr"));
        formateurs.add(new Formateur("Gobin", "Stéphane", "sgobin@campus-eni.fr"));
        // Ajout d’un formateur pour différencier les bouchons des couches DAL et BLL
        formateurs.add(new Formateur("Trillard", "Julien", "jtrillard@campus-eni.fr"));
        // Pour que le cas par défaut fonctionne : coach@campus-eni.fr
        formateurs.add(new Formateur("Coach", "Coach", "coach@campus-eni.fr"));
    }
    @Override
    public void create(Formateur formateur) {
        formateurs.add(formateur);
    }

    @Override
    public List<Formateur> findall() {
        return formateurs;
    }

    @Override
    public Formateur read(String emailFormateur) {
        return formateurs.stream().filter(item -> item.getEmail().equals(emailFormateur)).findAny().orElse(null);
    }

}

