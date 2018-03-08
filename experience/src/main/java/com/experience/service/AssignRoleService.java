package com.experience.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.experience.entity.Assignrole;
 
@Service
public interface AssignRoleService {

	public Integer saveAssignrole(Assignrole Assignrole);

	public Integer updateAssignrole(Assignrole Assignrole);

	public void deleteAssignrole(Assignrole Assignrole);

	public Assignrole getAssignrole(Integer AssignroleId);

	public List<Assignrole> getAssignroleList();

}
