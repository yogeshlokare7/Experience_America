package com.experience.serviceImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.experience.dao.LoginDao;
import com.experience.entity.LoginEntity;

@Repository
public class LoginServiceImpl extends EntityTransactionServiceImpl<LoginEntity>  implements LoginDao {

	@Autowired
	protected SessionFactory sessionFactory;

	public boolean login(String username, String password) throws Exception {
		return false;
	}

}
