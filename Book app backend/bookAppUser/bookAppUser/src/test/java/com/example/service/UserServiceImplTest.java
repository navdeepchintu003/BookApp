
package com.example.service;

import static org.junit.Assert.assertEquals;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Optional;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
//import org.mockito.junit.jupiter.MockitoExtension;

import com.example.exception.BookAlreadyExistsException;

import com.example.model.User;

import com.example.repo.UserRepository;

@RunWith(MockitoJUnitRunner.class)
//@ExtendWith(MockitoExtension.class)
public class UserServiceImplTest {
	
	@Mock
	private UserRepository userRepository;
	@InjectMocks
	private UserServiceImpl service;
	User user;
	List<User> listuser;
	Optional<User> optUser;
	@Before
	public void setUp() throws Exception {
		user = new User("unknown@gmail.com","user","user","image1");
		optUser = Optional.of(user);
	}
	@Test
	public void testAddUserSuccess() throws BookAlreadyExistsException {
		when(userRepository.save(Mockito.any(User.class))).
					thenReturn(user);
		User addedBook = service.registeruser(user);
		verify(userRepository).save(Mockito.any());
	}


}
