/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.misc;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.Source;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rooseek
 */
@XmlRootElement
public class LoginRecord extends BaseObject {

    private static final long serialVersionUID = 20130925L;

    @NotNull
    private Date loginTime;

    /**
     * 如果是web端登录那么记录ip，如果是mobile端登录则记录相应设备信息
     */
    @NotNull
    private String loginInfo;

    @NotNull
    private Source source;

    public LoginRecord() {
    }

    public LoginRecord(Date loginTime, String loginInfo, Source source) {
        this.loginTime = loginTime;
        this.loginInfo = loginInfo;
        this.source = source;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getLoginInfo() {
        return loginInfo;
    }

    public void setLoginInfo(String loginInfo) {
        this.loginInfo = loginInfo;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }
}
