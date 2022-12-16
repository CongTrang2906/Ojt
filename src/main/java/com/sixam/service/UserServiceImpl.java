package com.sixam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sixam.entities.Role;
import com.sixam.entities.Account;
import com.sixam.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public int getAccountRole(String userName, String password) {
		// TODO Auto-generated method stub

		Account user = userRepository.getAccountRole(userName);
		if (user != null) {
			Role role = userRepository.getAccountRole(user.getLogin_roleId());
			if (user != null && role != null && password.equals(user.getPassword().trim())) {
				if ("admin".equals(role.getRolename().trim())) {
					return 1;
				} else if ("nhanvienhanhchinh".equals(role.getRolename().trim())) {
					return 2;
				} else if ("yta".equals(role.getRolename().trim())) {
					return 3;
				} else if ("bacsi".equals(role.getRolename().trim())) {
					return 4;
				}
			}
		}
		return 0;
	}

}
