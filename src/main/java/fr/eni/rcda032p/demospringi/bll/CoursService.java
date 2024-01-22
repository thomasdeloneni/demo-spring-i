package fr.eni.rcda032p.demospringi.bll;

import fr.eni.rcda032p.demospringi.bo.Cours;

import java.util.List;

public interface CoursService {
	List<Cours> getCours();

	Cours findById(long id);
}
