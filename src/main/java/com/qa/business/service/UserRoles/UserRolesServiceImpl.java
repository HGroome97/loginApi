package com.qa.business.service.UserRoles;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.qa.repository.domain.UserRoles;
import com.qa.repository.domain.Users;
import com.qa.repository.persistence.UserRolesRepository;

@Service
public class UserRolesServiceImpl implements UserRolesService {

	@Autowired
	private UserRolesRepository repo;
	
	@Override
	public String addUserRoles(UserRoles userRole) {
		repo.save(userRole);
		return userRole.toString();
	}

	@Override
	public ResponseEntity<Object> deleteUserRoles(String username) {
		long userRoleId = repo.findIdByUsername(username);
		if(userRoleExists(userRoleId)){
            repo.deleteById(userRoleId);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
	}

	@Override
	public ResponseEntity<Object> updateUserRoles(UserRoles userRole) {
		if(userRoleExists(userRole.getUser_role_id())){
			UserRoles userRoleInDb = repo.findById(userRole.getUser_role_id()).get();
			userRoleInDb.setUsername(userRole.getUsername());
			userRoleInDb.setRole(userRole.getRole());
            repo.save(userRoleInDb);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
	}
	
	private boolean userRoleExists(Long id){
        Optional<UserRoles> userRoleOptional = repo.findById(id);
        return userRoleOptional.isPresent();
    }

}
