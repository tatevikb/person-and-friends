package com.person.core.exceptions;

public class ValidationException extends RuntimeException {
    public ValidationException(String msg)
    {
        super(msg);
    }
}
