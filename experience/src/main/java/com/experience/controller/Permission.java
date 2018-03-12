package com.experience.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class Permission {
	@RequestMapping(value = "/permission/add", method = RequestMethod.GET) 
	public String addCandidate() {
		return "permission/add_permission";    
	}

	@RequestMapping(value = "/permission/view", method = RequestMethod.GET) 
	public String viewCandidate() {
		return "permission/view_permission";    
	}

	@RequestMapping(value = "/permission/edit/{id}", method = RequestMethod.GET) 
	public String editCandidate(Integer id) {
		return "permission/add_permission";    
	}

	@RequestMapping(value = "/permission/delete/{id}", method = RequestMethod.GET) 
	public String deleteCandidate(Integer id) {
		return "permission/view_permission";    
	}
}
