package com.qa.business.service.Users;

import org.springframework.http.ResponseEntity;

import com.qa.repository.domain.Users;

public interface UsersService {

	String addUser(Users user);

    ResponseEntity<Object> deleteUser(Long id);

    ResponseEntity<Object> updateUser(Users user);
}
