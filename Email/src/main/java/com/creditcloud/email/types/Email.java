/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.email.types;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.constraints.EmailAddress;
import javax.validation.constraints.NotNull;

/**
 *
 * @author rooseek
 */
public abstract class Email extends BaseObject {

    /**
     * email address
     */
    @EmailAddress
    protected final String address;
    
    /**
     * personal info for this address like user name
     */
    @NotNull
    protected final String personal;
    
    /**
     * email type
     */
    @NotNull
    protected final EmailType type;

    public Email(String address, String personal, EmailType type) {
        this.address = address;
        if (personal != null) {
            this.personal = personal;
        } else {
            this.personal = address;
        }
        this.type = type;
    }

    public Email(String address, EmailType type) {
        this(address, address, type);
    }

    public String getAddress() {
        return address;
    }

    public String getPersonal() {
        return personal;
    }
    
    public EmailType getType(){
        return type;
    }
}
