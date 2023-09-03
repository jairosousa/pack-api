package com.jnsdev.parkapi.exception;

/**
 * @Autor Jairo Nascimento
 * @Created 03/09/2023 - 17:04
 */
public class CodigoUniqueViolationException extends RuntimeException {
    public CodigoUniqueViolationException(String message) {
        super(message);
    }
}
