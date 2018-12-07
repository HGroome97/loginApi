package com.qa.business.service.Users;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.qa.repository.domain.Users;

public interface UsersService {

	String addUser(Users user);

    ResponseEntity<Object> deleteUser(String username);

    ResponseEntity<Object> updateUser(Users user);
    
    List<Users> getAll();
}
