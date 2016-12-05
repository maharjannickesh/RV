package com.rv.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.rv.dto.ErrorMessage;
import com.rv.exception.DataNotFoundException;

/**
 * This class is a Custom Exception Controller for handling exceptions.
 * 
 * @author maharjan.nickesh
 */

@ControllerAdvice
public class CustomExceptionController {

	@ExceptionHandler(DataNotFoundException.class)
	public ResponseEntity<ErrorMessage> handleDataNotFoundException(DataNotFoundException ex) {

		ErrorMessage errorMessage = new ErrorMessage(ex.getMessage(), 404);
		return new ResponseEntity<>(errorMessage, HttpStatus.NOT_FOUND);

	}

	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<ErrorMessage> handleNoHandlerFoundException(NoHandlerFoundException ex) {
		ErrorMessage errorMessage = new ErrorMessage(ex.getMessage(), 404);
		return new ResponseEntity<ErrorMessage>(errorMessage, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorMessage> handleAllException(Throwable ex) {
		ErrorMessage errorMessage = new ErrorMessage(ex.getMessage(), 500);
		return new ResponseEntity<>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);

	}

}
