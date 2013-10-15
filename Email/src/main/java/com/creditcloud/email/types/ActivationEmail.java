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
public class ActivationEmail extends Email {

    private static final long serialVersionUID = 20131015L;

    /**
     * confirmcode for activating account
     */
    @NotNull
    private String confirmCode;

    public ActivationEmail(String address, String personal, String confirmCode) {
        super(address, personal, EmailType.CONFIRM_CREDITMARKET_ACTIVATION);
        this.confirmCode = confirmCode;
    }

    public String getConfirmCode() {
        return confirmCode;
    }
}
