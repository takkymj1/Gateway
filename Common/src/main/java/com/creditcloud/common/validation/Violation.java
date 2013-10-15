/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.validation;

import com.creditcloud.model.BaseObject;

/**
 *
 * @author sobranie
 */
public class Violation extends BaseObject {

    private static final long serialVersionUID = 20131015L;

    private final String message;

    private final Object invalidValue;

    private final Object invalidObject;

    public Violation(final String message,
                     final Object invalidValue,
                     final Object invalidObject) {
        this.message = message;
        this.invalidValue = invalidValue;
        this.invalidObject = invalidObject;
    }

    public String getMessage() {
        return message;
    }

    public Object getInvalidValue() {
        return invalidValue;
    }

    public Object getInvalidObject() {
        return invalidObject;
    }
}
