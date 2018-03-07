package com.experience.service;

import java.util.List;

import com.experience.entity.User;

public interface UserService {
	
	public List<User> getUsers();
	
	public User getUser(Integer id);
	
	public User saveUser(User user);
	
	public void updateUser(User user);
	
	public void deleteUser(Integer id);
	
}
