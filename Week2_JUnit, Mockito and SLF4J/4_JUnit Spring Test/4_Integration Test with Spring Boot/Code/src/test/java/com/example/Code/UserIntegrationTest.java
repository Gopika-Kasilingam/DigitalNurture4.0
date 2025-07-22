package com.example.Code;

import com.example.Code.entity.User;
import com.example.Code.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserIntegrationTest {

	@Autowired
	private TestRestTemplate restTemplate;

	@Autowired
	private UserRepository userRepository;

	@Test
	public void testCreateAndFetchUser() {
		// Arrange
		User newUser = new User("Alice", "alice@example.com");

		// Act: Save User
		ResponseEntity<User> postResponse = restTemplate.postForEntity("/users", newUser, User.class);
		assertThat(postResponse.getStatusCode()).isEqualTo(HttpStatus.OK);
		User savedUser = postResponse.getBody();
		assertThat(savedUser).isNotNull();
		assertThat(savedUser.getId()).isNotNull();

		// Act: Fetch User
		ResponseEntity<User> getResponse = restTemplate.getForEntity("/users/" + savedUser.getId(), User.class);
		assertThat(getResponse.getStatusCode()).isEqualTo(HttpStatus.OK);
		assertThat(getResponse.getBody().getEmail()).isEqualTo("alice@example.com");
	}
}
