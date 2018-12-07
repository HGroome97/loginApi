package com.qa.business.service.Users;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.qa.repository.domain.Users;
import com.qa.repository.persistence.UsersRepository;

@Service
public class UsersServiceImpl implements UsersService{

	@Autowired
	private UsersRepository repo;
	
	@Override
	public String addUser(Users user) {
		repo.save(user);
    	return user.toString();
	}

	@Override
	public ResponseEntity<Object> deleteUser(String username) {
		if(userExists(username)){
            repo.deleteById(username);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
	}

	@Override
	public ResponseEntity<Object> updateUser(Users user) {
		if(userExists(user.getUsername())){
			Users userInDb = repo.findById(user.getUsername()).get();
            userInDb.setUsername(user.getUsername());
            userInDb.setPassword(user.getPassword());
            userInDb.setEnabled(user.getEnabled());
            repo.save(userInDb);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
	}
	
	private boolean userExists(String username){
        Optional<Users> userOptional = repo.findById(username);
        return userOptional.isPresent();
    }

}
