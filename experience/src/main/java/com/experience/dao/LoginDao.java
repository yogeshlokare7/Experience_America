package com.experience.dao;

import com.experience.dto.UserDto;

public interface LoginDao {
     
	 public UserDto login(String username, String password) throws Exception;
}
