package com.experience.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.experience.dao.RoleDao;
import com.experience.entity.Role;
import com.experience.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleDao roleDao;

	public Integer saveRole(Role role) throws Exception {
		return roleDao.saveRole(role);
	}

	public Role updateRole(Role role) throws Exception {
		return roleDao.updateRole(role);
	}

	public void deleteRole(Role role) throws Exception {
		roleDao.deleteRole(role);
	}

	public Role getRole(Integer roleId) throws Exception {
		return roleDao.getRole(roleId);
	}

	public List<Role> getRoleList() throws Exception {
		return roleDao.getRoleList();
	}

}
