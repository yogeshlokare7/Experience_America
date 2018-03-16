package com.experience.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.experience.entity.Role;
import com.experience.service.RoleService;

@Controller
public class RoleController {

	
	@Autowired
	RoleService  roleService;
	
	/// THIS IS GET MTHODS 
	@RequestMapping(value = "/role/add", method = RequestMethod.GET) 
	public String addRole(Model model) throws Exception {
		return "role/add_role";    
	}

	@RequestMapping(value = "/role/view", method = RequestMethod.GET) 
	public String viewRole(Model model) throws Exception {
		System.out.println("***** List Capturing Started");
		List<Role> roleList = roleService.getRoleList();
		model.addAttribute("roleList",roleList);
		return "role/view_role";    
	}

	@RequestMapping(value = "/role/edit/{id}", method = RequestMethod.GET) 
	public String editRole(Model model, Integer id) {
		return "role/add_role";    
	}

	@RequestMapping(value = "/role/delete/{id}", method = RequestMethod.GET) 
	public String deleteRole(Model model, Integer id) {
		return "role/view_role";    
	}
	
	
	/// THIS IS POST MTHODS 
	
	@RequestMapping(value="/role/saverole",method=RequestMethod.POST)
	public String saveRole(@ModelAttribute("role") Role role) throws Exception {
		roleService.saveRole(role);
		return "redirect:/role/view";
	}
}
