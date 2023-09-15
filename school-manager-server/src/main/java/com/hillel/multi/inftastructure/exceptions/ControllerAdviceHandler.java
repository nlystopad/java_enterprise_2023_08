package com.hillel.multi.inftastructure.exceptions;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Date;

@RestControllerAdvice
public class ControllerAdviceHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity handleNotFoundException(NotFoundException exception) {
        ProblemDetails problemDetails = new ProblemDetails();
        problemDetails.description = "Something went wrong";
        problemDetails.exceptionMessage = exception.getMessage();
        problemDetails.timestamp = new Date();
        problemDetails.errorType = "Entity was not found";
        problemDetails.rootCause = "Id or name is not correct";

        return new ResponseEntity<>(problemDetails, new HttpHeaders(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(AlreadyExistException.class)
    public ResponseEntity handleAlreadyExistException(AlreadyExistException exception) {
        ProblemDetails problemDetails = new ProblemDetails();
        problemDetails.description = "Something went wrong";
        problemDetails.exceptionMessage = exception.getMessage();
        problemDetails.timestamp = new Date();
        problemDetails.errorType = "Entity is already exist found";
        problemDetails.rootCause = "This entity already exists in the database";

        return new ResponseEntity<>(problemDetails, new HttpHeaders(), HttpStatus.BAD_REQUEST);
    }

}
