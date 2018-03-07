package techit.model.dao;

import java.util.List;

import techit.model.Project;

public interface ProjectDao {
	
	// Get all the projects
	List<Project> getAllProjects();
	
	// Get a project by id
	Project getProjectById(int id);
	
	
	
	
	
	
}
