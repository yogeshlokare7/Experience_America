package com.experience.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.experience.entity.Permission;
import com.experience.service.PermissionService;

@Controller
public class PermissionController {
	
	@Autowired
    PermissionService permissionService;
	
	
	@RequestMapping(value = "/permission/add", method = RequestMethod.GET) 
	public String addpermission(Model model) {
		return "permission/add_permission";    
	}

	@RequestMapping(value = "/permission/view", method = RequestMethod.GET) 
	public String viewpermission(Model model) throws Exception {
		List<Permission> permissionList = permissionService.getPermissionList();
		model.addAttribute("permissionList",permissionList);
		return "permission/view_permission";    
	}

	@RequestMapping(value = "/permission/edit/{id}", method = RequestMethod.GET) 
	public String editpermission(Model model, Integer id) {
		return "permission/add_permission";    
	}

	@RequestMapping(value = "/permission/delete/{id}", method = RequestMethod.GET) 
	public String deletepermission(Model model, Integer id) {
		return "permission/view_permission";    
	}
	
	//post Method
	@RequestMapping(value="/permission/addPermission",method=RequestMethod.POST)
	public String addPermission(@ModelAttribute("permission") Permission permission) throws Exception {
		permissionService.savePermission(permission);
		return "redirect:/permission/view";
	}
}
