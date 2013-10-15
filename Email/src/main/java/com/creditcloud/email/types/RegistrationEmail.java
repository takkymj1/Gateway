/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.email.types;

/**
 *
 * @author rooseek
 */
public class RegistrationEmail extends Email {

    private static final long serialVersionUID = 20131015L;

    public RegistrationEmail(String address, String personal) {
        super(address, personal, EmailType.CONFIRM_CREDITMARKET_REGISTRATION);
    }

    public RegistrationEmail(String address) {
        this(address, address);
    }
}
