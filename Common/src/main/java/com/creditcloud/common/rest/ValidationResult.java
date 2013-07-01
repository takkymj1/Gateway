/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.rest;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * This is the wrapper class for the return JSON result for jqBootstrapValidation plugin.
 * 
 * @author sobranie
 */
@XmlRootElement
public class ValidationResult {

    private String value;
    private boolean valid;
    private String message;

    public ValidationResult() {
    }
    
    public ValidationResult(final String value) {
        this(value, false, null);
    }

    public ValidationResult(final String value, final boolean valid, final String message) {
        this.value = value;
        this.valid = valid;
        this.message = message;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
