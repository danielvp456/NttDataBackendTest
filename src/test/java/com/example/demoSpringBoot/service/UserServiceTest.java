package com.example.demoSpringBoot.service;

import com.example.demoSpringBoot.api.model.UserModel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {

    private UserService userService;

    @BeforeEach
    void setUp() {
        userService = new UserService();
    }

    @Test
    void testGetUserSuccess() {
        UserModel user = userService.getUser("C", "23445322");
        assertNotNull(user);
        assertEquals("Juan", user.getFirstName());
    }

    @Test
    void testGetUserNotFound() {
        UserModel user = userService.getUser("C", "00000000");
        assertNull(user);
    }

    @Test
    void testGetUserInvalidDocumentType() {
        UserModel user = userService.getUser("X", "23445322");
        assertNull(user);
    }
}