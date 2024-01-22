package fr.eni.rcda032p.demospringi.dal.mock;

import fr.eni.rcda032p.demospringi.bo.Formateur;
import fr.eni.rcda032p.demospringi.dal.FormateurDAO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FormateurDAOBouchon implements FormateurDAO {

	// Solution temporaire - gestion d'une liste de formateur locale
	private static List<Formateur> lstFormateurs;

	public FormateurDAOBouchon() {
		lstFormateurs = new ArrayList<Formateur>();
		lstFormateurs.add(new Formateur("Baille", "Anne-Lise", "abaille@campus-eni.fr"));
		lstFormateurs.add(new Formateur("Gobin", "Stéphane", "sgobin@campus-eni.fr"));
		// Ajout d’un formateur pour différencier les bouchons des couches DAL et BLL
		lstFormateurs.add(new Formateur("Trillard", "Julien", "jtrillard@campus-eni.fr"));
		// Pour que le cas par défaut fonctionne : coach@campus-eni.fr
		lstFormateurs.add(new Formateur("Coach", "Coach", "coach@campus-eni.fr"));
	}

	@Override
	public void create(Formateur formateur) {
		lstFormateurs.add(formateur);
	}

	@Override
	public List<Formateur> findAll() {
		return lstFormateurs;
	}

	@Override
	public Formateur read(String emailFormateur) {
		return lstFormateurs.stream().filter(item -> item.getEmail().equals(emailFormateur)).findAny().orElse(null);
	}

	@Override
	public void update(Formateur formateur) {
		Formateur item = read(formateur.getEmail());
		if (item != null) {
			item.setEmail(formateur.getEmail());
			item.setNom(formateur.getNom());
			item.setPrenom(formateur.getPrenom());
		}		
	}

}
