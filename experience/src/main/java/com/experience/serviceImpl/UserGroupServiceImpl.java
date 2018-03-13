package com.experience.serviceImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.experience.entity.UserGroup;
import com.experience.service.UserGroupService;

@Repository
public class UserGroupServiceImpl extends EntityTransactionServiceImpl<UserGroup> implements UserGroupService{

	@Autowired
	private SessionFactory sessionFactory;

	public Integer saveUserGroup(UserGroup userGroup) throws Exception {
		return saveEntity(userGroup, sessionFactory);
	}

	public UserGroup updateUserGroup(UserGroup userGroup) throws Exception {
		return updateEntity(userGroup, sessionFactory);
	}

	public void deleteUserGroup(UserGroup userGroup) throws Exception {
		deleteEntity(userGroup, sessionFactory);
	}

	public UserGroup getUserGroup(Integer userGroupId) throws Exception {
		return getEntity(new UserGroup(), userGroupId, sessionFactory);
	}

	public List<UserGroup> getUserGroupList() throws Exception {
		return getEntityList(new UserGroup(), sessionFactory);
	}
	
	

}
