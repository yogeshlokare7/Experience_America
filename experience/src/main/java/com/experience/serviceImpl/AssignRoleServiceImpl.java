package com.experience.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.experience.dao.AssignRoleDao;
import com.experience.entity.Assignrole;
import com.experience.service.AssignRoleService;

@Service
public class AssignRoleServiceImpl implements AssignRoleService{

	@Autowired
	private AssignRoleDao assignRoleDao;

	public Integer saveAssignrole(Assignrole assignrole) {
		return assignRoleDao.saveAssignrole(assignrole);
	}

	public Integer updateAssignrole(Assignrole assignrole) {
		return assignRoleDao.updateAssignrole(assignrole);
	}

	public void deleteAssignrole(Assignrole assignrole) {
		assignRoleDao.deleteAssignrole(assignrole);
	}

	public Assignrole getAssignrole(Integer assignroleId) {
		return assignRoleDao.getAssignrole(assignroleId);
	}

	public List<Assignrole> getAssignroleList() {
		return assignRoleDao.getAssignroleList();
	}

}
