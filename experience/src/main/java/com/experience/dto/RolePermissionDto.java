package com.experience.dto;

public class RolePermissionDto{

	private Integer id;
	private Integer permissionId;
	private Integer roleId;
	private PermissionDto permission;
	private RoleDto role;

	public RolePermissionDto() {
	}

	public RolePermissionDto(PermissionDto permission, RoleDto role) {
		this.permission = permission;
		this.role = role;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public PermissionDto getPermission() {
		return this.permission;
	}

	public void setPermission(PermissionDto permission) {
		this.permission = permission;
	}

	public RoleDto getRole() {
		return this.role;
	}

	public void setRole(RoleDto role) {
		this.role = role;
	}

	public Integer getPermissionId() {
		return permissionId;
	}

	public void setPermissionId(Integer permissionId) {
		this.permissionId = permissionId;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

}


