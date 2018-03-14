package com.experience.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.experience.entity.Role;
import com.experience.serviceImpl.RoleServiceImpl;

@Controller
public class RoleController {

	
	@Autowired
	RoleServiceImpl  roleServiceImpl;
	
	/// THIS IS GET MTHODS 
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
	
	
	/// THIS IS POST MTHODS 
	
	@RequestMapping(value="/saverole",method=RequestMethod.POST)
	public String saveRole(@ModelAttribute("Role") Role role) {
		try {
			roleServiceImpl.saveRole(role);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "role/view_role";
	}
}
