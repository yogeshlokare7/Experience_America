package com.experience.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.experience.dao.AssignRoleDao;
import com.experience.entity.Assignrole;
import com.experience.service.AssignRoleService;

 
public class AssignRoleServiceImpl implements AssignRoleService{

	@Autowired
	private AssignRoleDao assignRoleDao;

	public Integer saveAssignrole(Assignrole assignrole) throws Exception {
		return assignRoleDao.saveAssignrole(assignrole);
	}

	public Assignrole updateAssignrole(Assignrole assignrole) throws Exception {
		return assignRoleDao.updateAssignrole(assignrole);
	}

	public void deleteAssignrole(Assignrole assignrole) throws Exception {
		assignRoleDao.deleteAssignrole(assignrole);
	}

	public Assignrole getAssignrole(Integer assignroleId) throws Exception {
		return assignRoleDao.getAssignrole(assignroleId);
	}

	public List<Assignrole> getAssignroleList() throws Exception {
		return assignRoleDao.getAssignroleList();
	}

}
