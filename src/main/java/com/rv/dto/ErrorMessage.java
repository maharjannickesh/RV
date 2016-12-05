package com.rv.dto;

/**
 * This class is a Error Message that store actual exception message, code and related documentation
 * 
 * @author maharjan.nickesh
 */


public class ErrorMessage {

	private String errorMessage;
	private int errorCode;

	public ErrorMessage() {
	}

	public ErrorMessage(String errorMessage, int errorCode) {
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}



}
