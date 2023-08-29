package com.jnsdev.parkapi.exception;

/**
 * @Autor Jairo Nascimento
 * @Created 29/08/2023 - 15:05
 */
public class PasswordInvalidException extends RuntimeException {
    public PasswordInvalidException(String message) {
        super(message);
    }
}
