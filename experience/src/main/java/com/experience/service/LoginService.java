package com.experience.service;

import org.springframework.stereotype.Service;

@Service
public interface LoginService {
	
	public boolean login(String username, String password) throws Exception;
	
}
