package com.qa.business.service.UserRoles;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.qa.repository.domain.UserRoles;
import com.qa.repository.persistence.UserRolesRepository;

public class UserRolesServiceImpl implements UserRolesService {

	@Autowired
	private UserRolesRepository repo;
	
	@Override
	public String addUserRoles(UserRoles userRole) {
		repo.save(userRole);
		return null;
	}

	@Override
	public ResponseEntity<Object> deleteUserRoles(String username) {
		return null;
	}

	@Override
	public ResponseEntity<Object> updateUserRoles(UserRoles userRole) {
		return null;
	}
	
	private boolean userRoleExists(Long id){
        Optional<UserRoles> userRoleOptional = repo.findById(id);
        return userRoleOptional.isPresent();
    }

}
