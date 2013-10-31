/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.user;

import com.creditcloud.model.BaseObject;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rooseek
 */
@XmlRootElement
public class UserAuthenticate extends BaseObject {

    private static final long serialVersionUID = 20131031L;

    private String userId;

    /**
     * 实名验证是否通过
     */
    private boolean IDAuthenticated;

    /**
     * 手机验证是否通过
     */
    private boolean mobileAuthenticated;

    /**
     * 邮箱验证是否通过
     */
    private boolean emailAuthenticated;

    public UserAuthenticate() {
    }

    public UserAuthenticate(String userId,
                            boolean IDAuthenticated,
                            boolean mobileAuthenticated,
                            boolean emailAuthenticated) {
        this.userId = userId;
        this.IDAuthenticated = IDAuthenticated;
        this.mobileAuthenticated = mobileAuthenticated;
        this.emailAuthenticated = emailAuthenticated;
    }

    public String getUserId() {
        return userId;
    }

    public boolean isIDAuthenticated() {
        return IDAuthenticated;
    }

    public boolean isMobileAuthenticated() {
        return mobileAuthenticated;
    }

    public boolean isEmailAuthenticated() {
        return emailAuthenticated;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setIDAuthenticated(boolean IDAuthenticated) {
        this.IDAuthenticated = IDAuthenticated;
    }

    public void setMobileAuthenticated(boolean mobileAuthenticated) {
        this.mobileAuthenticated = mobileAuthenticated;
    }

    public void setEmailAuthenticated(boolean emailAuthenticated) {
        this.emailAuthenticated = emailAuthenticated;
    }
}
