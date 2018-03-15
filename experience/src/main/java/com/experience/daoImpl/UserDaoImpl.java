package com.experience.daoImpl;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.experience.dao.UserDao;
import com.experience.entity.Accommodation;
import com.experience.entity.User;

@Repository
public class UserDaoImpl extends EntityTransactionImpl<User> implements UserDao{

	@Autowired
	protected SessionFactory sessionFactory;
	
	public List<User> getUsers() throws Exception {
		return getEntityList(new User(), sessionFactory);
	}

	public User getUser(Integer id) throws Exception {
		return getEntity(new User(), id, sessionFactory);
	}

	public Integer saveUser(User user) throws Exception {
		return saveEntity(user, sessionFactory);
	}

	public void updateUser(User user) throws Exception {
		updateEntity(user, sessionFactory);
	}

	public void deleteUser(User user) throws Exception {
		deleteEntity(user, sessionFactory);
	}

	

}
