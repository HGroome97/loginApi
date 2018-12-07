package com.qa.business.service.UserRoles;

import org.springframework.http.ResponseEntity;

import com.qa.repository.domain.UserRoles;

public interface UserRolesService {
	
	String addUserRoles(UserRoles userRole);

    ResponseEntity<Object> deleteUserRoles(String username);

    ResponseEntity<Object> updateUserRoles(UserRoles userRole);

}
