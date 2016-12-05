package com.rv.exception;

public class DataNotFoundException extends RuntimeException {

	/**
	 * This class is a Data Not Found Exception
	 * 
	 * @author maharjan.nickesh
	 */
	private static final long serialVersionUID = -4249897348224650564L;

	public DataNotFoundException(String message) {
		super(message);
	}

}
