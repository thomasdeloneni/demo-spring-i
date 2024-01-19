package fr.eni.rcda032p.demospringi.bll;

import fr.eni.rcda032p.demospringi.bo.Formateur;
import fr.eni.rcda032p.demospringi.dal.FormateurDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormateurServiceImpl implements FormateurService {

    private FormateurDAO formateurDAO;

    @Autowired
    public FormateurServiceImpl(FormateurDAO formateurDAO) {
        this.formateurDAO = formateurDAO;
    }

    @Override
    public void add(String nom, String prenom, String email) {
        formateurDAO.create(new Formateur(nom, prenom, email));
    }

    @Override
    public  List<Formateur> getFormateurs() {
        return formateurDAO.findall();
    }

    @Override
    public Formateur findByEmail(String emailFormateur) {
        return formateurDAO.read(emailFormateur);
    }
}
