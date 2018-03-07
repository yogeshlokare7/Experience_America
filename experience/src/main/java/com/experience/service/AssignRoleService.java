package com.experience.service;

import java.util.List;

import com.experience.entity.Assignrole;
 

public interface AssignRoleService {

	public Integer saveAssignrole(Assignrole Assignrole);

	public Integer updateAssignrole(Assignrole Assignrole);

	public void deleteAssignrole(Assignrole Assignrole);

	public Assignrole getAssignrole(Integer AssignroleId);

	public List<Assignrole> getAssignroleList();

}
