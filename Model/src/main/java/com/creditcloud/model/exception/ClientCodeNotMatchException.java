/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.exception;

/**
 *
 * service之间调用时传递的客户代码clientCode不匹配,这是个极其严重的exception,是不允许发生的
 *
 * @author rooseek
 */
public class ClientCodeNotMatchException extends CreditCloudException {

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
