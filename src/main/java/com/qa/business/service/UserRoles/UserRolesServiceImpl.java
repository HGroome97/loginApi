package com.qa.business.service.UserRoles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.qa.repository.domain.UserRoles;
import com.qa.repository.persistence.UserRolesRepository;
import com.qa.repository.persistence.UsersRepository;

public class UserRolesServiceImpl implements UserRolesService {

	@Autowired
	private UserRolesRepository repo;
	
	@Override
	public String addUserRoles(UserRoles userRole) {
		repo.save(userRole);
		return null;
	}

	@Override
	public ResponseEntity<Object> deleteUser(Long id) {
		return null;
	}

	@Override
	public ResponseEntity<Object> updateUser(UserRoles userRole) {
		return null;
	}

}
