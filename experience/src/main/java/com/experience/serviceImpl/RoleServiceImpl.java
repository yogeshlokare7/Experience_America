package com.experience.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.experience.dao.RoleDao;
import com.experience.entity.Role;
import com.experience.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService{

	@Autowired
	private  RoleDao roleDao;

	public Integer saveRole(Role role) {
		return roleDao.saveRole(role);
	}

	public Integer updateRole(Role role) {
		return roleDao.updateRole(role);
	}

	public void deleteRole(Role role) {
		roleDao.deleteRole(role);
	}

	public Role getRole(Integer roleId) {
		return roleDao.getRole(roleId);
	}

	public List<Role> getRoleList() {
		return roleDao.getRoleList();
	}

}
