package com.experience.dao;

import java.util.List;

import com.experience.entity.TblUser;

public interface UserDao {
	public final String USER_LIST_QUERY="from TblUser";
	public List<TblUser> getUsers();
	public TblUser getUser(Integer id);
	public TblUser saveUser(TblUser user);
	public void updateUser(TblUser user);
	public void deleteUser(Integer id);
}
