package techit.rest.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import techit.model.User;
import techit.model.dao.UserDao;


@RestController
public class UserController {

	@Autowired
	private UserDao userDao;

	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
	public User getUser(@PathVariable int id) {
		return null;

	}

	@RequestMapping(value = "/user/", method = RequestMethod.GET)
	public List<User> getUsers() {
		return userDao.getUsers();
	}

	
	
	
	
}