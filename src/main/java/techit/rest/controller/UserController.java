package techit.rest.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import techit.model.Project;
import techit.model.User;
import techit.model.dao.UserDao;


@RestController
public class UserController {

	@Autowired
	private UserDao userDao;

	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
	public User getUser(@PathVariable int id) {
		User user = userDao.getUser(id);
		//System.out.println(user.getProjects().size());
		
		if (user.getId() == 1){
			
			Set<Project> projects = user.getProjects();
			// use projects for the hr to view in the html
			System.out.println(projects.size());
		}
		return user;
	}

	@RequestMapping(value = "/user/", method = RequestMethod.GET)
	public List<User> getUsers() {
		return userDao.getUsers();
	}

	/*@RequestMapping(value = "/user/", method = RequestMethod.POST)
	public User addUser(@RequestBody User user) {
		if (user.getUsername() == null || user.getPassword() == null)
			throw new RestException(400, "Missing username and/or password.");

		return userDao.saveUser(user);
		}*/
	
	
	
}