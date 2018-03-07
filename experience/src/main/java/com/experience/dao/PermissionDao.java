package com.experience.dao;

import java.util.List;

import com.experience.entity.Permission;

public interface PermissionDao {
	
	public Integer savePermission(Permission permission);

	public Integer updatePermission(Permission permission);

	public void deletePermission(Permission permission);

	public Permission getPermission(Integer permissionId);

	public List<Permission> getPermissionList();
	
}
