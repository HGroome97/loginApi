package com.qa.business.service.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.qa.repository.domain.Users;
import com.qa.repository.persistence.UsersRepository;

public class UsersServiceImpl implements UsersService{

	@Autowired
	private UsersRepository repo;
	
	@Override
	public String addUser(Users user) {
		repo.save(user);
		return null;
	}

	@Override
	public ResponseEntity<Object> deleteUser(Long id) {
		return null;
	}

	@Override
	public ResponseEntity<Object> updateUser(Users user) {
		return null;
	}

}
