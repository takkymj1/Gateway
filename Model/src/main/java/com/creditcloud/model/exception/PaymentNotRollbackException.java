/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.exception;

import javax.ejb.ApplicationException;

/**
 * 三方支付exception,不回滚，从而不影响调用者事务
 *
 * @author rooseek
 */
@ApplicationException(rollback = false)
public class PaymentNotRollbackException extends PaymentException {

    private static final long serialVersionUID = 20140731L;

    public PaymentNotRollbackException() {
    }

    public PaymentNotRollbackException(String message) {
        super(message);
    }

    public PaymentNotRollbackException(String message, Throwable cause) {
        super(message, cause);
    }

    public PaymentNotRollbackException(Throwable cause) {
        super(cause);
    }
}
