package com.experience.dto;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.experience.entity.User;

 
public class UserDto {

	private Integer id;
	private String firstname;
	private String lastname;
	private String useremail;
	private Integer userage;
	private String userpwd;
	private Byte userenabled;
	private String confirmationtoken;
	private String resettoken;
	private Date createdon;
	private Date lastlogin;
	private Set<AssignRoleDto> assignroles = new HashSet<AssignRoleDto>(0);

	public UserDto() {
	}

	public UserDto(String firstname, String lastname, String useremail, Integer userage, String userpwd, Byte userenabled, String confirmationtoken, String resettoken, Date createdon, Date lastlogin, Set<AssignRoleDto> assignroles) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.useremail = useremail;
		this.userage = userage;
		this.userpwd = userpwd;
		this.userenabled = userenabled;
		this.confirmationtoken = confirmationtoken;
		this.resettoken = resettoken;
		this.createdon = createdon;
		this.lastlogin = lastlogin;
		this.assignroles = assignroles;
	}


	public UserDto(User user) {
		setFirstname(user.getFirstname());
		setLastname(user.getLastname());
		setUseremail(user.getUseremail());
		setUserage(user.getUserage());
		setUserpwd(user.getUserpwd());
		setUserenabled(user.getUserenabled());
		setConfirmationtoken(user.getConfirmationtoken());
		setResettoken(user.getResettoken());
		setCreatedon(user.getCreatedon());
		setLastlogin(user.getLastlogin());
		//setAssignroles(user.getAssignroles());
	}
	
	
	public User  getEntityFromDTO() {
		User user= new User ();
		user.setFirstname(getFirstname());
		user.setLastname(getLastname());
		user.setUseremail(getUseremail());
		user.setUserage(getUserage());
		user.setUserpwd(getUserpwd());
		user.setUserenabled(getUserenabled());
		user.setConfirmationtoken(getConfirmationtoken());
		user.setResettoken(getResettoken());
		user.setCreatedon(getCreatedon());
		user.setLastlogin(getLastlogin());
		return user;
	
	}

	
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getUseremail() {
		return this.useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}


	public Integer getUserage() {
		return this.userage;
	}

	public void setUserage(Integer userage) {
		this.userage = userage;
	}


	public String getUserpwd() {
		return this.userpwd;
	}

	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}


	public Byte getUserenabled() {
		return this.userenabled;
	}

	public void setUserenabled(Byte userenabled) {
		this.userenabled = userenabled;
	}


	public String getConfirmationtoken() {
		return this.confirmationtoken;
	}

	public void setConfirmationtoken(String confirmationtoken) {
		this.confirmationtoken = confirmationtoken;
	}


	public String getResettoken() {
		return this.resettoken;
	}

	public void setResettoken(String resettoken) {
		this.resettoken = resettoken;
	}

	public Date getCreatedon() {
		return this.createdon;
	}

	public void setCreatedon(Date createdon) {
		this.createdon = createdon;
	}

	public Date getLastlogin() {
		return this.lastlogin;
	}

	public void setLastlogin(Date lastlogin) {
		this.lastlogin = lastlogin;
	}

	public Set<AssignRoleDto> getAssignroles() {
		return this.assignroles;
	}

	public void setAssignroles(Set<AssignRoleDto> assignroles) {
		this.assignroles = assignroles;
	}

	@Override
	public String toString() {
		return "UserDto [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", useremail=" + useremail + ", userage=" + userage + ", userpwd=" + userpwd + ", userenabled=" + userenabled + ", confirmationtoken=" + confirmationtoken + ", resettoken=" + resettoken + ", createdon=" + createdon + ", lastlogin=" + lastlogin + ", assignroles=" + assignroles + "]";
	}

}


