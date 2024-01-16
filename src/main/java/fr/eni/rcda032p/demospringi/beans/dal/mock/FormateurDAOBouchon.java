package fr.eni.rcda032p.demospringi.beans.dal.mock;

import fr.eni.rcda032p.demospringi.beans.bo.Formateur;
import fr.eni.rcda032p.demospringi.beans.dal.FormateurDAO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class FormateurDAOBouchon implements FormateurDAO {

    private static final List<Formateur> formateurs;

    static{
        formateurs = new ArrayList<>();
        formateurs.add(new Formateur("Baille", "Anne-lise", "abaille@campus-eni.fr"));
        formateurs.add(new Formateur("Gobin", "Stéphane", "sgobin@campus-eni.fr"));
    }
    @Override
    public void create(Formateur formateur) {
        formateurs.add(formateur);
    }

    @Override
    public List<Formateur> findall() {
        return formateurs;
    }
}

