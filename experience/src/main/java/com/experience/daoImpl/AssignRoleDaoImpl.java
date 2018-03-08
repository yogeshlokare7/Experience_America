package com.experience.daoImpl;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;




import org.springframework.stereotype.Repository;

import com.experience.dao.AssignRoleDao;
import com.experience.entity.Assignrole;



@Repository

public class AssignRoleDaoImpl implements AssignRoleDao{

	@Autowired
	private SessionFactory sessionFactory;

	public Integer saveAssignrole(Assignrole Assignrole) {
		return null;
	}

	public Integer updateAssignrole(Assignrole Assignrole) {
		return null;
	}

	public void deleteAssignrole(Assignrole Assignrole) {
	}

	public Assignrole getAssignrole(Integer AssignroleId) {
		return null;
	}

	public List<Assignrole> getAssignroleList() {
		return null;
	}

}
