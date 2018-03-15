package com.experience.serviceImpl;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.experience.dao.UserDao;
import com.experience.entity.User;
import com.experience.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao dao;

	public List<User> getUsers() throws Exception {
		return dao.getUsers();
	}

	public User getUser(Integer id) throws Exception {
		return dao.getUser(id);
	}

	public Integer saveUser(User user) throws Exception {
		return dao.saveUser(user);
	}

	public void updateUser(User user) throws Exception {
		dao.updateUser(user);
	}

	public void deleteUser(User user) throws Exception {
		dao.deleteUser(user);
	}

}