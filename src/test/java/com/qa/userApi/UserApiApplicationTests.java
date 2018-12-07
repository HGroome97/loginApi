package com.qa.userApi;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.qa.business.service.Users.UsersServiceImpl;
import com.qa.repository.domain.Users;
import com.qa.repository.persistence.UsersRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserApiApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@InjectMocks
	private UsersServiceImpl service;

	@Mock
	private UsersRepository repo;
	
	private Users user1;
	private Users user2;
	private ArrayList<Users> allUsers;
	
	@Before
	public void setUp() {
		user1 = new Users();
		user2 = new Users();
		allUsers = new ArrayList<Users>();
		allUsers.add(user1);
		allUsers.add(user2);
	}
	
	@Test
	public void userTests() {
		Users user = new Users();
		assertEquals(null, user.getUsername());
		assertEquals(null, user.getPassword());
		assertEquals(null, user.getEnabled());
		assertEquals(null, user.getRole());

		user.setUsername("usertest");
		user.setPassword("passtest");
		user.setEnabled(true);
		user.setRole("ROLE_ADMIN");;
		
		assertEquals("usertest", user.getUsername());
		assertEquals("passtest", user.getPassword());
		assertEquals(true, user.getEnabled());
		assertEquals("ROLE_ADMIN", user.getRole());
	}
	
	@Test
	public void testGet() {

	}

	@Test
	public void testDelete() {
		
	}

	@Test
	public void testUpdate() {
		
	}

	@Test
	public void testAdd() {
	
	}

	
}
