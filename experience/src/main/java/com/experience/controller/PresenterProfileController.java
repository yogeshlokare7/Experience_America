package com.experience.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PresenterProfileController{

	@RequestMapping(value = "/presenterprofile/add", method = RequestMethod.GET) 
	public String addPresenterProfile() {
		return "presenterprofile/add_presenterprofile";    
	}

	@RequestMapping(value = "/presenterprofile/view", method = RequestMethod.GET) 
	public String viewPresenterProfile() {
		return "presenterprofile/view_presenterprofile";    
	}

	@RequestMapping(value = "/presenterprofile/edit/{id}", method = RequestMethod.GET) 
	public String editPresenterProfile(Integer id) {
		return "presenterprofile/add_presenterprofile";    
	}

	@RequestMapping(value = "/presenterprofile/delete/{id}", method = RequestMethod.GET) 
	public String deletePresenterProfile(Integer id) {
		return "presenterprofile/view_presenterprofile";    
	}
	
	
	
	
	
}
