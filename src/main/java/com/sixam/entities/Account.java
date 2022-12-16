package com.sixam.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity

public class Account {

	@Id
	@Column(unique = true)
	private String userName;
	@Column
	private String password;
	@Column
	private int login_roleId;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(String username, String password, int login_roleId) {
		super();
		this.userName = username;
		this.password = password;
		this.login_roleId = login_roleId;
	}
	public String getUsername() {
		return userName;
	}
	public void setUsername(String username) {
		this.userName = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getLogin_roleId() {
		return login_roleId;
	}
	public void setLogin_roleId(int login_roleId) {
		this.login_roleId = login_roleId;
	}
	@Override
	public String toString() {
		return "User [username=" + userName + ", password=" + password + ", login_roleId=" + login_roleId + "]";
	}

}
