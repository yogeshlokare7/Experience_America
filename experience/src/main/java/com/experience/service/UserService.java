package com.experience.service;

import java.util.List;

import com.experience.entity.TblUser;

public interface UserService {
	public List<TblUser> getUsers();
	public TblUser getUser(Integer id);
	public TblUser saveUser(TblUser user);
	public void updateUser(TblUser user);
	public void deleteUser(Integer id);
}
