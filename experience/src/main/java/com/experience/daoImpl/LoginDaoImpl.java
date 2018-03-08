package com.experience.daoImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.experience.dao.LoginDao;
import com.experience.entity.User;

@Repository
public class LoginDaoImpl extends EntityTransactionImpl<User> implements  LoginDao {

	@Autowired
	private SessionFactory sessionFactory;

	public boolean login(String username, String password) throws Exception {
		String query ="select useremail,password from User where useremail= :username AND password= :password";
		Map<String, String> param = new HashMap<String, String>();
		param.put("useremail", username);
		param.put("password", password);
		List<User> users = getEntityListFromCustomQuery(query, param, sessionFactory);
		return (users == null || users.isEmpty() || users.size() == 0) ? false : true;
	}
 
}
