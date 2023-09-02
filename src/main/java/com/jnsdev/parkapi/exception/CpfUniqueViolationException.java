package com.jnsdev.parkapi.exception;

/**
 * @Autor Jairo Nascimento
 * @Created 02/09/2023 - 17:16
 */
public class CpfUniqueViolationException extends RuntimeException {
    public CpfUniqueViolationException(String mensagem) {
        super(mensagem);
    }
}
