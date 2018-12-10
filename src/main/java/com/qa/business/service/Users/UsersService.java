package com.qa.business.service.Users;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.qa.repository.domain.Users;

public interface UsersService {

	String addUser(Users user);

    String deleteUser(String username);

    String updateUser(Users user);
   
}
