/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.exception;

import javax.ejb.ApplicationException;

/**
 * 三方支付exception
 *
 * @author rooseek
 */
@ApplicationException(rollback = true)
public class PaymentException extends RuntimeException {

    private static final long serialVersionUID = 20140731L;

    public PaymentException() {
    }

    public PaymentException(String message) {
        super(message);
    }

    public PaymentException(String message, Throwable cause) {
        super(message, cause);
    }

    public PaymentException(Throwable cause) {
        super(cause);
    }
}
