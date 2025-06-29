package com.example.service;

import com.example.entity.User;
import com.example.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UserServiceTest {

	@Mock
	private UserRepository userRepository;

	@InjectMocks
	private UserService userService;

	public UserServiceTest() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	void testGetUserById() {
		// Arrange
		User user = new User(1L, "Alice");
		when(userRepository.findById(1L)).thenReturn(Optional.of(user));

		// Act
		User result = userService.getUserById(1L);

		// Assert
		assertNotNull(result);
		assertEquals("Alice", result.getName());

		// Verify interaction
		verify(userRepository, times(1)).findById(1L);
	}
}
