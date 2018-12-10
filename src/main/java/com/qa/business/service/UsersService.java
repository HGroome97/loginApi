package com.qa.business.service;

import com.qa.repository.domain.Users;

public interface UsersService {

	String addUser(Users user);

    String deleteUser(String username);

    String updateUser(Users user);
   
}
