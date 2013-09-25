/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.user;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.LoginResult;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rooseek
 */
@XmlRootElement
public class UserLoginResult extends BaseObject {

    private static final long serialVersionUID = 20130925L;

    @NotNull
    private LoginResult result;

    private User user;

    public UserLoginResult() {
    }

    public UserLoginResult(LoginResult result, User user) {
        this.result = result;
        this.user = user;
    }

    public LoginResult getResult() {
        return result;
    }

    public User getUser() {
        return user;
    }

    public void setResult(LoginResult result) {
        this.result = result;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
