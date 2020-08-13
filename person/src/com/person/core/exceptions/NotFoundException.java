package com.person.core.exceptions;

public class NotFoundException extends ValidationException {
    public NotFoundException(String msg)
    {
        super(msg);
    }
}
