package techit.rest.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import techit.model.Project;
import techit.model.dao.ProjectDao;



public class ProjectController {
		
	@Autowired
	private ProjectDao projectDao;
	
	@RequestMapping("/getproject")
	public Project getprojectById(Integer id,Integer userId)
	{
		Project project =  projectDao.getProjectById(id);
		// User is Employee
		if(userId == 2){
			// Call the employee display where he can add the sentiments
			
			
		}
		// user is Manager
		else if(userId == 1){
			// Project sentiments and if manager is wanted to add his sentiments then he can do that
		}
		// User is HR
		else if (userId == 3){
			// Call to the project display for the HR with all the project details
			// 
			
		}
		
		return null;
		
	}
}
