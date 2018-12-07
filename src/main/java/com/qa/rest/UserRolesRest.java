package com.qa.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.business.service.UserRoles.UserRolesService;
import com.qa.repository.domain.UserRoles;
import com.qa.repository.domain.Users;

@CrossOrigin
@RequestMapping("/users")
@RestController
public class UserRolesRest {
	
	 @Autowired
	 private UserRolesService userRolesService ;
	 
	@PutMapping("${path.updateBaby}")
    public ResponseEntity<Object> updateUser(@RequestBody UserRoles userRole) {
        return userRolesService.updateUserRoles(userRole);
    }
}
