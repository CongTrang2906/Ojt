package com.sixam.repositories;

import com.sixam.entities.Account;
import com.sixam.entities.Role;

public interface UserRepository {

	public Account getAccountRole(String userName);
	public Role getAccountRole(int roleId);
}
