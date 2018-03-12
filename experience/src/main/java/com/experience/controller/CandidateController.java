package com.experience.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CandidateController {

	
	@RequestMapping(value = "/candidate/add", method = RequestMethod.GET) 
	public String addCandidate() {
		return "candidate/add_candidate";    
	}

	@RequestMapping(value = "/candidate/view", method = RequestMethod.GET) 
	public String viewCandidate() {
		return "candidate/view_candidate";    
	}

	@RequestMapping(value = "/candidate/edit/{id}", method = RequestMethod.GET) 
	public String editCandidate(Integer id) {
		return "candidate/add_candidate";    
	}

	@RequestMapping(value = "/candidate/delete/{id}", method = RequestMethod.GET) 
	public String deleteCandidate(Integer id) {
		return "candidate/view_candidate";    
	}
	
}
