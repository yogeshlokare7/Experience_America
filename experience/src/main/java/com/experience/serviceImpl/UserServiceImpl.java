package com.experience.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.experience.dao.UserDao;
import com.experience.entity.User;
import com.experience.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	public List<User> getUsers() throws Exception {
		return userDao.getUsers();
	}

	public User getUser(Integer id) throws Exception {
		return userDao.getUser(id);
	}

	public User saveUser(User user) throws Exception {
		return userDao.saveUser(user);
	}

	public void updateUser(User user) throws Exception {
		userDao.updateUser(user);
	}

	public void deleteUser(Integer id) throws Exception {
		userDao.deleteUser(id);
	}

}
