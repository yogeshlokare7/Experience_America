package com.experience.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RoleController {

	@RequestMapping(value = "/role/add", method = RequestMethod.GET) 
	public String addRole() {
		return "role/add_role";    
	}

	@RequestMapping(value = "/role/view", method = RequestMethod.GET) 
	public String viewRole() {
		return "role/view_role";    
	}

	@RequestMapping(value = "/role/edit/{id}", method = RequestMethod.GET) 
	public String editRole(Integer id) {
		return "role/add_role";    
	}

	@RequestMapping(value = "/role/delete/{id}", method = RequestMethod.GET) 
	public String deleteRole(Integer id) {
		return "role/view_role";    
	}
}
