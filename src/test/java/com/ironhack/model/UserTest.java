package com.ironhack.model;

import com.ironhack.exception.UserException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    public void validateNameTestFail(){
        User user = new User();
        assertThrows(UserException.class, () -> user.validateName("Stella"));
    }

    @Test
    public void validateNameTestGood(){
        User user = new User();
        assertDoesNotThrow( () -> user.validateName("Stella Polare"));
    }

}