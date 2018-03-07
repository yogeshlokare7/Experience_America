package com.experience.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.experience.dao.UserDao;
import com.experience.entity.TblUser;

@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<TblUser> getUsers() {
		Session session = sessionFactory.openSession();
		List<TblUser> list = session.createQuery("from TblUser").list();
		session.close();
		return list;
	}

	public TblUser getUser(Integer id) {
		Session session =  sessionFactory.openSession();
		TblUser user = (TblUser) session.load(TblUser.class, new Integer(id));
		return user;
	}

	public TblUser saveUser(TblUser user) {
		Session session =  sessionFactory.openSession();
		session.persist(user);
		return user;
	}

	public void updateUser(TblUser user) {
		Session session =  sessionFactory.openSession();
		session.update(user);
	}

	public void deleteUser(Integer id) {
		Session session =  sessionFactory.openSession();
		TblUser user = (TblUser) session.load(TblUser.class, new Integer(id));
		if (user != null) {
			session.delete(user);
		}
	}

}
