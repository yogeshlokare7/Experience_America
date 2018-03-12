package com.experience.service;

import org.springframework.stereotype.Service;

import com.experience.dto.UserDto;

@Service
public interface LoginService {
	
	public UserDto login(String username, String password) throws Exception;
	
}
