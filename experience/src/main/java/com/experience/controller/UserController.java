package com.experience.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class UserController {
	
	@RequestMapping(value = "/user/add", method = RequestMethod.GET) 
	public String userUser() {
		return "user/add_user";    
	}

	@RequestMapping(value = "/user/view", method = RequestMethod.GET) 
	public String viewUser() {
		return "user/view_User";    
	}

	@RequestMapping(value = "/user/edit/{id}", method = RequestMethod.GET) 
	public String editUser(Integer id) {
		return "user/add_user";    
	}

	@RequestMapping(value = "/user/delete/{id}", method = RequestMethod.GET) 
	public String deleteUser(Integer id) {
		return "user/view_User";    
	}

}
	