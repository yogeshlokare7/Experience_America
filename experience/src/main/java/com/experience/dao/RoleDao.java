package com.experience.dao;

import java.util.List;

import com.experience.entity.Role;

public interface RoleDao {
	
	public Integer saveRole(Role role);

	public Integer updateRole(Role role);

	public void deleteRole(Role role);

	public Role getRole(Integer roleId);

	public List<Role> getRoleList();
}
