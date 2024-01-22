package fr.eni.rcda032p.demospringi.bll;

import fr.eni.rcda032p.demospringi.bo.Cours;
import fr.eni.rcda032p.demospringi.dal.CoursDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursServiceImpl implements CoursService {
	private CoursDAO courseDAO;

	public CoursServiceImpl(CoursDAO courseDAO) {
		this.courseDAO = courseDAO;
	}

	@Override
	public List<Cours> getCours() {
		return courseDAO.findAll();
	}

	@Override
	public Cours findById(long id) {
		return courseDAO.read(id);
	}
}
