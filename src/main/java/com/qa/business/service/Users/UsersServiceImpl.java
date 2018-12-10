package com.qa.business.service.Users;

import java.util.List;
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
	public String deleteUser(String username) {
		if(userExists(username)){
            repo.deleteById(username);
            return "User successfully deleted";
        }
        return "User not found";
	}

	@Override
	public String updateUser(Users user) {
		if(userExists(user.getUsername())){
			Users userInDb = repo.findById(user.getUsername()).get();
            userInDb.setUsername(user.getUsername());
            userInDb.setPassword(user.getPassword());
            userInDb.setEnabled(user.getEnabled());
            userInDb.setRole(user.getRole());
            repo.save(userInDb);
            return user.toString();
        }
        return "User not found";
	}
	
	private boolean userExists(String username){
        Optional<Users> userOptional = repo.findById(username);
        return userOptional.isPresent();
    }

}
