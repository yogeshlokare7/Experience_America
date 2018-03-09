package com.experience.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.experience.entity.User;
import com.experience.service.LoginService;


@Controller   
public class LoginController {

	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/", method = RequestMethod.GET) 
	public ModelAndView signIn() {
		ModelAndView mv = new ModelAndView("signin");
		return mv;    
	}

	@RequestMapping(value="/hello", method = RequestMethod.GET)
	public ModelAndView showMessage(@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		ModelAndView mv = new ModelAndView("helloworld");
		mv.addObject("name", name);
		return mv;
	}


	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}

	//****************************************POST***********************************

	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(@ModelAttribute("User") User user) {
		try {
			if(loginService.login(user.getUseremail(), user.getUserpwd())) {
				return "redir:/hello";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "login";
	}

	@RequestMapping(value = "/reset", method = RequestMethod.GET) 
	public String resetPage() {
		return "reset";    
	}
}
