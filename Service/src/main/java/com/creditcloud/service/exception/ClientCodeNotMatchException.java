/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service.exception;

/**
 *
 *
 * @author rooseek
 */
public class ClientCodeNotMatchException extends RuntimeException {

    static final long serialVersionUID = 20130713;

    public ClientCodeNotMatchException() {
    }

    public ClientCodeNotMatchException(String message) {
        super(message);
    }

    public ClientCodeNotMatchException(String message, Throwable cause) {
        super(message, cause);
    }

    public ClientCodeNotMatchException(Throwable cause) {
        super(cause);
    }
}
