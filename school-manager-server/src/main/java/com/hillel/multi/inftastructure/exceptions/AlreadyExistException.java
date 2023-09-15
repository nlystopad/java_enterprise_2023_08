package com.hillel.multi.inftastructure.exceptions;

public class AlreadyExistException extends RuntimeException {
    public AlreadyExistException() {
    }

    public AlreadyExistException(String message) {
        super(message);
    }

    public AlreadyExistException(Throwable cause) {
        super(cause);
    }
}
