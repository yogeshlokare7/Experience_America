package com.experience.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.experience.dao.RoleDao;
import com.experience.entity.Role;

public class RoleDaoImpl implements RoleDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public Integer saveRole(Role role) {
		return null;
	}

	public Integer updateRole(Role role) {
		return null;
	}

	public void deleteRole(Role role) {
	}

	public Role getRole(Integer roleId) {
		return null;
	}

	public List<Role> getRoleList() {
		return null;
	}

}
