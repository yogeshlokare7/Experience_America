package com.experience.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PermissionController {

	@RequestMapping(value = "/permission/add", method = RequestMethod.GET) 
	public String addpermission() {
		return "permission/add_permission";    
	}

	@RequestMapping(value = "/permission/view", method = RequestMethod.GET) 
	public String viewpermission() {
		return "permission/view_permission";    
	}

	@RequestMapping(value = "/permission/edit/{id}", method = RequestMethod.GET) 
	public String editpermission(Integer id) {
		return "permission/add_permission";    
	}

	@RequestMapping(value = "/permission/delete/{id}", method = RequestMethod.GET) 
	public String deletepermission(Integer id) {
		return "permission/view_permission";    
	}
}
