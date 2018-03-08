package com.experience.daoImpl;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;


import org.springframework.stereotype.Repository;

import com.experience.dao.RolePermissionDao;
import com.experience.entity.Rolepermission;

/*
 * 
 */
@Repository
public class RolePermissionDaoImpl implements RolePermissionDao{

	@Autowired
	private SessionFactory sessionFactory;
 
	public Integer saveRolepermission(Rolepermission Rolepermission) {
		return null;
	}

	public Integer updateRolepermission(Rolepermission Rolepermission) {
		return null;
	}

	public void deleteRolepermission(Rolepermission Rolepermission) {
		
	}

	public Rolepermission getRolepermission(Integer RolepermissionId) {
		return null;
	}

	public List<Rolepermission> getRolepermissionList() {
		return null;
	}

}
