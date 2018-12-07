package com.qa.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.business.service.UserRoles.UserRolesService;
import com.qa.business.service.Users.UsersService;
import com.qa.repository.domain.Users;

@CrossOrigin
@RequestMapping("/users")
@RestController
public class UsersRest {

    @Autowired
    private UsersService usersService;
    
    @Autowired
    private UserRolesService userRolesService ;
    
    
//    @Value("${url.generator}")
//    private String generatorURL;
//    
//    @Value("${path.genBabyName}")
//    private String babyNameGeneratorPath;
//    
    
    
    @DeleteMapping("/deleteUser/{username}")
    public ResponseEntity<Object> deleteUser(@PathVariable String username) {
        userRolesService.deleteUserRoles(username);
    	return usersService.deleteUser(username);
    }

    @PutMapping("/updateUser")
    public ResponseEntity<Object> updateUser(@RequestBody Users user) {
        return usersService.updateUser(user);
    }

    @PostMapping("/createUser")
    public String createUser(@RequestBody Users user) {
        return usersService.addUser(user);
    }

}
