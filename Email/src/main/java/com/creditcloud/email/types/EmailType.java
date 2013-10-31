/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.email.types;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author sobranie
 */
public enum EmailType implements BaseEnum{

    CONFIRM_CREDITMARKET_REGISTRATION("confirm.creditmarket.registration"),
    
    CONFIRM_CREDITMARKET_ACTIVATION("confirm.creditmarket.activation"),
    
    CONFIRM_CREDITMARKET_AUTHENTICATION("confirm.creditmarket.authentication");
    
    private final String key;

    private EmailType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
