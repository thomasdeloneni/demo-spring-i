package fr.eni.rcda032p.demospringi.bll;

import fr.eni.rcda032p.demospringi.bo.Cours;
import fr.eni.rcda032p.demospringi.bo.Formateur;
import fr.eni.rcda032p.demospringi.dal.CoursDAO;
import fr.eni.rcda032p.demospringi.dal.FormateurDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormateurServiceImpl implements FormateurService {
	private FormateurDAO formateurDAO;
	private CoursDAO coursDAO;

	public FormateurServiceImpl(FormateurDAO formateurDAO, CoursDAO coursDAO) {
		this.formateurDAO = formateurDAO;
		this.coursDAO = coursDAO;
	}

	@Override
	public void add(String nom, String prenom, String email) {
		Formateur formateur = new Formateur(nom, prenom, email);
		formateurDAO.create(formateur);
	}

	@Override
	public List<Formateur> getFormateurs() {
		return formateurDAO.findAll();
	}

	@Override
	public Formateur findByEmail(String emailFormateur) {
		return formateurDAO.read(emailFormateur);
	}

	public void update(Formateur formateur) {
		formateurDAO.update(formateur);
	}

	@Override
	public void updateCoursFormateur(String emailFormateur, long idCours) {
		//Mise à jour au niveau BO
		Formateur f = formateurDAO.read(emailFormateur);
		Cours c = coursDAO.read(idCours);	
		f.getListeCours().add(c);
		
		//Mise à jour en base
		coursDAO.insertCoursFormateur(idCours, emailFormateur);
	}

}
