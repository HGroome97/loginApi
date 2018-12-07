package com.qa.business.service.UserRoles;

import org.springframework.http.ResponseEntity;

import com.qa.repository.domain.UserRoles;
import com.qa.repository.domain.Users;

public interface UserRolesService {
	
	String addUserRoles(UserRoles user);

    ResponseEntity<Object> deleteUser(Long id);

    ResponseEntity<Object> updateUser(UserRoles user);

}
