package com.experience.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.experience.dao.PermissionDao;
import com.experience.entity.Permission;

public class PermissionDaoImpl implements PermissionDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public Integer savePermission(Permission permission) {
		return null;
	}

	public Integer updatePermission(Permission permission) {
		return null;
	}

	public void deletePermission(Permission permission) {
		
	}

	public Permission getPermission(Integer permissionId) {
		return null;
	}

	public List<Permission> getPermissionList() {
		return null;
	}

}
