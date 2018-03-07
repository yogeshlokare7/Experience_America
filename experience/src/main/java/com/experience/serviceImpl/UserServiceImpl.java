package com.experience.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.experience.dao.UserDao;
import com.experience.entity.TblUser;
import com.experience.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	public List<TblUser> getUsers() {
		return userDao.getUsers();
	}

	public TblUser getUser(Integer id) {
		return userDao.getUser(id);
	}

	public TblUser saveUser(TblUser user) {
		return userDao.saveUser(user);
	}

	public void updateUser(TblUser user) {
		userDao.updateUser(user);
	}

	public void deleteUser(Integer id) {
		userDao.deleteUser(id);
	}

}
