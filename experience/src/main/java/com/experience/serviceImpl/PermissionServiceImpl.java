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
	
	public Integer savePermission(Permission permission) throws Exception {
		return permissionDao.savePermission(permission);
	}

	public Permission updatePermission(Permission permission) throws Exception {
		return permissionDao.updatePermission(permission);
	}

	public void deletePermission(Permission permission)  throws Exception{
		permissionDao.deletePermission(permission);
	}

	public Permission getPermission(Integer permissionId) throws Exception {
		return permissionDao.getPermission(permissionId);
	}

	public List<Permission> getPermissionList()  throws Exception{
		return permissionDao.getPermissionList();
	}

}
