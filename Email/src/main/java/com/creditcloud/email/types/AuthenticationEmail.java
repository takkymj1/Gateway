/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.email.types;

import com.creditcloud.model.user.User;
import javax.validation.constraints.NotNull;

/**
 * 绑定邮箱
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
    
    /**
     * 绑定邮箱的用户
     */
    @NotNull
    private final String userId;

    public AuthenticationEmail(String address, User user, String confirmCode) {
        super(address, user.getName(), EmailType.CONFIRM_CREDITMARKET_AUTHENTICATION);
        this.confirmCode = confirmCode;
        this.userId = user.getId();
    }

    public String getConfirmCode() {
        return confirmCode;
    }
    
    public String getUserId() {
        return userId;
    }
}
