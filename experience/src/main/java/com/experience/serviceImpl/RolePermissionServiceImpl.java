package com.experience.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.experience.dao.RolePermissionDao;
import com.experience.entity.Rolepermission;
import com.experience.service.RolePermissionService;

/*
 * 
 */
@Service
public class RolePermissionServiceImpl implements RolePermissionService{

	@Autowired
	RolePermissionDao rolePermissionDao;
	
	/* (non-Javadoc)
	 * @see com.experience.service.RolePermissionService#saveRolepermission(com.experience.entity.Rolepermission)
	 */
	public Integer saveRolepermission(Rolepermission rolepermission) throws Exception {
		return rolePermissionDao.saveRolepermission(rolepermission);
	}

	/* (non-Javadoc)
	 * @see com.experience.service.RolePermissionService#updateRolepermission(com.experience.entity.Rolepermission)
	 */
	public Rolepermission updateRolepermission(Rolepermission rolepermission) throws Exception {
		return rolePermissionDao.updateRolepermission(rolepermission);
	}

	/* (non-Javadoc)
	 * @see com.experience.service.RolePermissionService#deleteRolepermission(com.experience.entity.Rolepermission)
	 */
	public void deleteRolepermission(Rolepermission rolepermission) throws Exception {
		rolePermissionDao.deleteRolepermission(rolepermission);
	}

	/* (non-Javadoc)
	 * @see com.experience.service.RolePermissionService#getRolepermission(java.lang.Integer)
	 */
	public Rolepermission getRolepermission(Integer rolepermissionId) throws Exception {
		return rolePermissionDao.getRolepermission(rolepermissionId);
	}

	/* (non-Javadoc)
	 * @see com.experience.service.RolePermissionService#getRolepermissionList()
	 */
	public List<Rolepermission> getRolepermissionList()  throws Exception{
		return rolePermissionDao.getRolepermissionList();
	}


}
