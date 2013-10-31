/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.email.types;

import javax.validation.constraints.NotNull;

/**
 *
 * @author rooseek
 */
public class AuthenticationEmail extends Email {

    private static final long serialVersionUID = 20131101L;

    /**
     * confirmcode for authenticating an email
     */
    @NotNull
    private final String confirmCode;

    public AuthenticationEmail(String address, String personal, String confirmCode) {
        super(address, personal, EmailType.CONFIRM_CREDITMARKET_AUTHENTICATION);
        this.confirmCode = confirmCode;
    }

    public String getConfirmCode() {
        return confirmCode;
    }
}
