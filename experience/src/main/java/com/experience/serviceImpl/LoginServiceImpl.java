package com.experience.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.experience.dao.LoginDao;
import com.experience.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	protected LoginDao dao;

	public boolean login(String username, String password) throws Exception {
		return dao.login(username, password);
	}

}
