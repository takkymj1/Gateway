package com.creditcloud.chinapay.exception;

public class NoEnoughMoneyForSinglePayException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -880871181518322810L;
    public NoEnoughMoneyForSinglePayException(String message) {
        super(message);
    }
}
