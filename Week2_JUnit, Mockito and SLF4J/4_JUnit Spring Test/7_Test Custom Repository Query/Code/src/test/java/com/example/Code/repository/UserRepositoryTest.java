package com.example.Code.repository;

import com.example.Code.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @BeforeEach
    void setUp() {
        userRepository.save(new User("Alice"));
        userRepository.save(new User("Bob"));
        userRepository.save(new User("Alice"));
    }

    @Test
    void testFindByName() {
        List<User> result = userRepository.findByName("Alice");

        assertThat(result).hasSize(2);
        assertThat(result.get(0).getName()).isEqualTo("Alice");
        assertThat(result.get(1).getName()).isEqualTo("Alice");
    }
}
