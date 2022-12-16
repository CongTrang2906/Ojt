package com.sixam.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Role {

	@Id
	private int roleID;
	@Column
	private String rolename;
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Role(int roleID, String rolename) {
		super();
		this.roleID = roleID;
		this.rolename = rolename;
	}
	public int getRoleID() {
		return roleID;
	}
	public void setRoleID(int roleID) {
		this.roleID = roleID;
	}
	public String getRolename() {
		return rolename;
	}
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	@Override
	public String toString() {
		return "Role [roleID=" + roleID + ", rolename=" + rolename + "]";
	}
	
}
