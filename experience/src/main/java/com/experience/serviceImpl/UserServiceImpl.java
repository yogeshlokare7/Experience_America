package com.experience.serviceImpl;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.experience.dao.UserDao;
import com.experience.entity.User;

@Service
public class UserServiceImpl implements UserDao{

 @Autowired
 private SessionFactory sessionFactory;

 @SuppressWarnings("unchecked")
 public List<User> getUsers() {
  Session session = sessionFactory.openSession();
  List<User> list = session.createQuery("from User").list();
  session.close();
  return list;
 }

 public User getUser(Integer id) {
  Session session =  sessionFactory.openSession();
  User user = (User) session.load(User.class, new Integer(id));
  return user;
 }

 public User saveUser(User user) {
  Session session =  sessionFactory.openSession();
  session.persist(user);
  return user;
 }

 public void updateUser(User user) {
  Session session =  sessionFactory.openSession();
  session.update(user);
 }

 public void deleteUser(Integer id) {
  Session session =  sessionFactory.openSession();
  User user = (User) session.load(User.class, new Integer(id));
  if (user != null) {
   session.delete(user);
  }
 }

}