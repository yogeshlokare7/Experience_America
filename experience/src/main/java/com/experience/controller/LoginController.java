package com.experience.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller   
public class LoginController {
	
	String message = "Welcome to Spring MVC!";
	
	@RequestMapping(value = "/", method = RequestMethod.GET) 
	public ModelAndView signIn() {
		ModelAndView mv = new ModelAndView("signin");
		return mv;    
	}
	
	@RequestMapping(value="/hello", method = RequestMethod.GET)
	public ModelAndView showMessage(@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		ModelAndView mv = new ModelAndView("helloworld");
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}

}
