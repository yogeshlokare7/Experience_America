package com.experience.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class VolunteerManagerController {
	@RequestMapping(value = "/volunteermanager/add", method = RequestMethod.GET) 
	public String addVolunteerManager() {
		return "volunteermanager/add_volunteermanager";    
	}

	@RequestMapping(value = "/volunteermanager/view", method = RequestMethod.GET) 
	public String viewVolunteerManager() {
		return "volunteermanager/view_volunteermanager";    
	}

	@RequestMapping(value = "/volunteermanager/edit/{id}", method = RequestMethod.GET) 
	public String editVolunteerManager(Integer id) {
		return "volunteermanager/add_volunteermanager";    
	}

	@RequestMapping(value = "/volunteermanager/delete/{id}", method = RequestMethod.GET) 
	public String deleteVolunteerManager(Integer id) {
		return "volunteermanager/view_volunteermanager";    
	}
}
