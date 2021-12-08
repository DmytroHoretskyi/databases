package com.horetskyi.demo.exception;

import org.springframework.http.HttpStatus;

public class NotFoundException extends RuntimeException {
    public NotFoundException(HttpStatus httpStatus) {
        super(httpStatus.name());
    }
}
