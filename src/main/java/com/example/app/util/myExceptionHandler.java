package com.example.app.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class myExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseEntity internalServerError(final Exception exception) {
        ResponseEntity responseEntity=new ResponseEntity(exception.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        return responseEntity;
    }
}
