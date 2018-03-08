package com.experience.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.experience.entity.Permission;

@Service
public interface PermissionService {
	
	public Integer savePermission(Permission permission);

	public Integer updatePermission(Permission permission);

	public void deletePermission(Permission permission);

	public Permission getPermission(Integer permissionId);

	public List<Permission> getPermissionList();
	
}
