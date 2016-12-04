package com.rv.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.rv.exception.DataNotFoundException;
import com.rv.exception.ErrorMessage;

@ControllerAdvice
public class CustomExceptionController {

	@ExceptionHandler(DataNotFoundException.class)
	public ResponseEntity<ErrorMessage> handleDataNotFoundException(DataNotFoundException ex) {

		ErrorMessage errorMessage = new ErrorMessage(ex.getMessage(), 404, "Documentation Goes Here");
		return new ResponseEntity<>(errorMessage, HttpStatus.NOT_FOUND);

	}
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<ErrorMessage> handleNoHandlerFoundException(NoHandlerFoundException ex) {
		ErrorMessage errorMessage = new ErrorMessage(ex.getMessage(), 404, "Requested Page Not Found");
		return new ResponseEntity<ErrorMessage>(errorMessage, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorMessage> handleAllException(Exception ex) {
		ErrorMessage errorMessage = new ErrorMessage(ex.getMessage(), 400, "Documentation Goes Here");
		return new ResponseEntity<>(errorMessage, HttpStatus.NOT_FOUND);

	}

}
