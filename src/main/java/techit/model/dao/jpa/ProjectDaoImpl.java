package techit.model.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import techit.model.Project;
import techit.model.User;
import techit.model.dao.ProjectDao;

public class ProjectDaoImpl implements ProjectDao {
	
	@PersistenceContext
	   private EntityManager entityManager;
	
	@Override
	public List<Project> getAllProjects() {
		// TODO Auto-generated method stub
		return entityManager.createQuery( "from Project order by id", Project.class )
	            .getResultList();
		
	}

	@Override
	public Project getProjectById(int id) {
		// TODO Auto-generated method stub
		return entityManager.find(Project.class, id);

	}

}
