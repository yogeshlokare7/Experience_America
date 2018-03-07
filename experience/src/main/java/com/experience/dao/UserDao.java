package com.experience.dao;

import java.util.List;

import com.experience.entity.User;

public interface UserDao {
	
	public final String USER_LIST_QUERY="from User";
	
	public List<User> getUsers();
	
	public User getUser(Integer id);
	
	public User saveUser(User user);
	
	public void updateUser(User user);
	
	public void deleteUser(Integer id);
}
