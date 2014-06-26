/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.user;

import com.creditcloud.model.BaseObject;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;

/**
 *
 * @author rooseek
 */
@Data
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

    /**
     * 微博认证是否通过
     */
    private boolean weiboAuthenticated;

    /**
     * 微信认证是否通过
     */
    private boolean wechatAuthenticated;

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
}
