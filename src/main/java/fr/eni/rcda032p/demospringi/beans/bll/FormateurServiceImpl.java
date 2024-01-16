package fr.eni.rcda032p.demospringi.beans.bll;

import fr.eni.rcda032p.demospringi.beans.bo.Formateur;
import fr.eni.rcda032p.demospringi.beans.dal.FormateurDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary // s'active si confit
public class FormateurServiceImpl implements FormateurService {

    private FormateurDAO dao;

    @Autowired
    public FormateurServiceImpl(FormateurDAO dao) {
        this.dao = dao;
    }

    @Override
    public void add(String nom, String prenom, String email) {
        dao.create(new Formateur(nom, prenom, email));
    }

    @Override
    public List<Formateur> getFormateurs() {
        return dao.findall();
    }
}
