package com.experience.dao;

import java.util.List;

import com.experience.entity.Rolepermission;

public interface RolePermissionDao {

	public Integer saveRolepermission(Rolepermission Rolepermission);

	public Integer updateRolepermission(Rolepermission Rolepermission);

	public void deleteRolepermission(Rolepermission Rolepermission);

	public Rolepermission getRolepermission(Integer RolepermissionId);

	public List<Rolepermission> getRolepermissionList();
}
