package com.jnsdev.parkapi.exception;

/**
 * @Autor Jairo Nascimento
 * @Created 29/08/2023 - 14:57
 */
public class EntityNotFoundException extends RuntimeException {
    public EntityNotFoundException(String message) {
        super(message);
    }
}
