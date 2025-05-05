package com.rts.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long userId) {
        super("No user found with ID: " + userId);
    }
}
