package fr.eni.rcda032p.demospringi.dal;

import fr.eni.rcda032p.demospringi.bo.Cours;

import java.util.List;

public interface CoursDAO {
	
	Cours read(long id);

	List<Cours> findAll();
	
	void insertCoursFormateur(long idCours, String emailFormateur);
}
