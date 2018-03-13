package com.experience.dao;

import java.util.List;

import com.experience.entity.User;

public interface UserDao {
	
	public final String USER_LIST_QUERY="from User";
	
	public List<User> getUsers() throws Exception;
	
	public User getUser(Integer id) throws Exception;
	
	public User saveUser(User user) throws Exception;
	
	public void updateUser(User user) throws Exception;
	
	public void deleteUser(Integer id) throws Exception;
}
