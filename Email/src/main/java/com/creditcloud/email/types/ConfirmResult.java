/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.email.types;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum ConfirmResult implements BaseEnum {

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
     * the email is activated or authenticated already
     */
    AUTHENTICATED("AUTHENTICATED");

    private final String key;

    private ConfirmResult(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
