/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.email.types;

/**
 *
 * @author rooseek
 */
public enum ConfirmResult {

    /**
     * the confirm code and email address match, confirm successful
     */
    SUCCESSFUL("successful"),
    
    /**
     * the confirm code and email address unmatch, confirm unsuccessful
     */
    UNSUCCESSFUL("unsuccessful"),
    
    /**
     * confirm code expired, need to resend confirm mail
     */
    EXPIRED("expired"),
    
    /**
     * the email is activated already
     */
    ACTIVATED("activated");
    
    
    private final String key;

    private ConfirmResult(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}
