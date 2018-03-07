package com.experience.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.experience.dao.PermissionDao;
import com.experience.entity.Permission;

@Service
public class PermissionServiceImpl implements PermissionDao{

	@Autowired
	private PermissionDao permissionDao;
	
	public Integer savePermission(Permission permission) {
		return permissionDao.savePermission(permission);
	}

	public Integer updatePermission(Permission permission) {
		return permissionDao.updatePermission(permission);
	}

	public void deletePermission(Permission permission) {
		permissionDao.deletePermission(permission);
	}

	public Permission getPermission(Integer permissionId) {
		return permissionDao.getPermission(permissionId);
	}

	public List<Permission> getPermissionList() {
		return permissionDao.getPermissionList();
	}

}
