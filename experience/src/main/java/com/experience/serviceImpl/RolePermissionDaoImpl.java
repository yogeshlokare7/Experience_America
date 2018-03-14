package com.experience.serviceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.experience.dao.RolePermissionDao;
import com.experience.entity.Rolepermission;
import com.experience.service.RolePermissionService;


@Repository
public class RolePermissionDaoImpl  implements RolePermissionService{

	@Autowired
	protected RolePermissionDao rolePermissionDao ;
 
	public Integer saveRolepermission(Rolepermission Rolepermission) throws Exception {
		return rolePermissionDao.saveRolepermission(Rolepermission);
	}

	public Rolepermission updateRolepermission(Rolepermission Rolepermission) throws Exception {
		return rolePermissionDao.updateRolepermission(Rolepermission);
	}

	public void deleteRolepermission(Rolepermission Rolepermission) throws Exception {
		rolePermissionDao.deleteRolepermission(Rolepermission);
	}

	public Rolepermission getRolepermission(Integer RolepermissionId) throws Exception {
		return rolePermissionDao.getRolepermission(RolepermissionId);
	}

	public List<Rolepermission> getRolepermissionList() throws Exception {
		return rolePermissionDao.getRolepermissionList();
	}

}
