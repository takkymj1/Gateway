package com.creditcloud.chinapay.exception;

public class InvalidResponseFormatException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -880871181518322810L;
    public InvalidResponseFormatException(String message) {
        super(message);
    }
}
