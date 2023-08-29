package com.jnsdev.parkapi.exception;

/**
 * @Autor Jairo Nascimento
 * @Created 29/08/2023 - 14:45
 */
public class UsernameUniqueViolationException extends RuntimeException {
    public UsernameUniqueViolationException(String message) {
        super(message);
    }
}
