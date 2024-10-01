package com.example.examen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    @Test
    void createUser() {
        UserService userService = new UserService();
        userService.createUser(new User("juan","1234","perez","Gómez"));
        assertEquals(userService.getUsers().size(), 1);
    }
}