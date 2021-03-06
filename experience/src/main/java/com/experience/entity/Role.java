package com.experience.entity;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="role")
public class Role  implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String role;
	private Set<Assignrole> assignroles = new HashSet<Assignrole>(0);
	private Set<Rolepermission> rolepermissions = new HashSet<Rolepermission>(0);

	public Role() {
	}


	public Role(Integer id, String role, Set<Assignrole> assignroles, Set<Rolepermission> rolepermissions) {
		this.id = id;
		this.role = role;
		this.assignroles = assignroles;
		this.rolepermissions = rolepermissions;
	}



	@Id @GeneratedValue(strategy=IDENTITY)
	@Column(name="id", unique=true, nullable=false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	
	

	@OneToMany(fetch=FetchType.LAZY, mappedBy="role")
	public Set<Assignrole> getAssignroles() {
		return this.assignroles;
	}

	@Column(name="role")
	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public void setAssignroles(Set<Assignrole> assignroles) {
		this.assignroles = assignroles;
	}

	@OneToMany(fetch=FetchType.LAZY, mappedBy="role")
	public Set<Rolepermission> getRolepermissions() {
		return this.rolepermissions;
	}

	public void setRolepermissions(Set<Rolepermission> rolepermissions) {
		this.rolepermissions = rolepermissions;
	}




}


