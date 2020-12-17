package com.kuzmin.dasboard.service;

import com.kuzmin.dasboard.model.User;
import com.kuzmin.dasboard.repository.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
public class UserServiceTest {
    @MockBean
    private UserRepository userRepository;
    private UserService userService;

    @Before
    public void init() {
        this.userService = new UserService(userRepository);
    }

    @Test
    public void getAllCommentsForToday_HappyPath_ShouldReturn1Comment() {
        // Given
        User user = new User();
        user.setUsername("user1");
        user.setPassword("user908");
        user.setRole("USER");
        when(userRepository.findByUsername("user1")).thenReturn(user);
        // When
        UserDetails actual = userService.loadUserByUsername("user1");
        // Then
        verify(userRepository, times(1)).findByUsername("user1");
    }
}
