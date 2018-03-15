package com.experience.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.experience.entity.User;
import com.experience.service.UserService;


@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/user/add", method = RequestMethod.GET) 
	public String userUser() {
		return "user/add_user";    
	}

	@RequestMapping(value = "/user/view", method = RequestMethod.GET) 
	public String viewUser(Model model) throws Exception {
		List<User> list = userService.getUsers();
		model.addAttribute("users",list);
		return "user/view_user";    
	}

	@RequestMapping(value = "/user/edit/{id}", method = RequestMethod.GET) 
	public String editUser(Integer id) {
		return "user/add_user";    
	}

	@RequestMapping(value = "/user/delete/{id}", method = RequestMethod.GET) 
	public String deleteUser(@PathVariable("id") Integer id) throws Exception {
		User user = userService.getUser(id);
		if(user!=null) {
			userService.deleteUser(user);
		}
		return "redirect:/user/view";   
	}
	
	//POST
	@RequestMapping(value="/user/save", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("user") User user) throws Exception {
		Integer savedUser = userService.saveUser(user);
		System.out.println("save user:\n"+savedUser);
		return "redirect:/user/view";
	}
}
	