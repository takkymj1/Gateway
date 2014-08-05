/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.exception;

/**
 * root for all user-defined exceptions
 *
 * @author rooseek
 */
public class CreditCloudException extends RuntimeException {

    private static final long serialVersionUID = 20140804L;

    public CreditCloudException() {
    }

    public CreditCloudException(String message) {
        super(message);
    }

    public CreditCloudException(String message, Throwable cause) {
        super(message, cause);
    }

    public CreditCloudException(Throwable cause) {
        super(cause);
    }
}
