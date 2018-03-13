package com.experience.serviceImpl;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.experience.entity.Rolepermission;
import com.experience.service.RolePermissionService;

/*
 * 
 */
@Repository
public class RolePermissionDaoImpl extends EntityTransactionServiceImpl<Rolepermission> implements RolePermissionService{

	@Autowired
	private SessionFactory sessionFactory;
 
	public Integer saveRolepermission(Rolepermission Rolepermission) throws Exception {
		return saveEntity(Rolepermission, sessionFactory);
	}

	public Rolepermission updateRolepermission(Rolepermission Rolepermission) throws Exception {
		return updateEntity(Rolepermission, sessionFactory);
	}

	public void deleteRolepermission(Rolepermission Rolepermission) throws Exception {
		deleteEntity(Rolepermission, sessionFactory);
	}

	public Rolepermission getRolepermission(Integer RolepermissionId) throws Exception {
		return getEntity(new Rolepermission(), RolepermissionId, sessionFactory);
	}

	public List<Rolepermission> getRolepermissionList() throws Exception {
		return getEntityList(new Rolepermission(), sessionFactory);
	}

}
