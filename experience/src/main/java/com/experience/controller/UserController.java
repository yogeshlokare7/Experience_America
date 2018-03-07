package com.experience.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.experience.entity.User;
import com.experience.service.UserService;


@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public String getCountries(Model model) {
		List<User> users = userService.getUsers();
		model.addAttribute("users", users);
		return "userlist";
	}
	
	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
	public String getUserById(@PathVariable("id") Integer id, Model model) {
		User user = userService.getUser(id);
		model.addAttribute("user", user);
		return "userview";
	}

}
