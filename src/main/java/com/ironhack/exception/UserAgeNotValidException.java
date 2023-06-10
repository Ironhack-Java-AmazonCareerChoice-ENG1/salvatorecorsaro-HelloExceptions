package com.ironhack.exception;

import static com.ironhack.model.User.MINIMUM_AGE;

public class UserAgeNotValidException extends UserException{
    public UserAgeNotValidException() {
        super("Age should be at least: "
                + MINIMUM_AGE);
    }
}
