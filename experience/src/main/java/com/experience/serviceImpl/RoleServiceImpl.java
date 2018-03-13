package com.experience.serviceImpl;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.experience.entity.Role;
import com.experience.service.RoleService;

@Repository
public class RoleServiceImpl extends EntityTransactionServiceImpl<Role> implements RoleService{


	Role role = new Role();
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public Integer saveRole(Role role) throws Exception {
		return saveEntity(role, sessionFactory);
	}

	public Role updateRole(Role role) throws Exception {
		return updateEntity(role, sessionFactory);
	}

	public void deleteRole(Role role) throws Exception {
		deleteEntity(role, sessionFactory);
	}

	public Role getRole(Integer roleId) throws Exception {
		return getEntity(role, roleId, sessionFactory);
	}

	public List<Role> getRoleList() throws Exception {
		return getEntityList(role, sessionFactory);
	}

}
