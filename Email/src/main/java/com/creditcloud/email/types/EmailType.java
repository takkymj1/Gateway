/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.email.types;

/**
 *
 * @author sobranie
 */
public enum EmailType {

    CONFIRM_CREDITMARKET_REGISTRATION("confirm.creditmarket.registration"),
    
    CONFIRM_CREDITMARKET_ACTIVATION("confirm.creditmarket.activation");
    
    private final String key;

    private EmailType(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}
