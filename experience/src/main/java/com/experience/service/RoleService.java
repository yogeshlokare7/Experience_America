package com.experience.service;

import java.util.List;

import com.experience.entity.Role;

public interface RoleService {

	public Integer saveRole(Role role) throws Exception;

	public Role updateRole(Role role) throws Exception;

	public void deleteRole(Role role) throws Exception;

	public Role getRole(Integer roleId) throws Exception;

	public List<Role> getRoleList() throws Exception;
}
