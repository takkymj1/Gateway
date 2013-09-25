/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.entities.embedded;

import com.creditcloud.common.entities.BaseEntity;
import com.creditcloud.model.enums.Source;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author rooseek
 */
@Embeddable
public class LoginRecord extends BaseEntity {

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date loginTime;

    /**
     * 如果是web端登录那么记录ip，如果是mobile端登录则记录相应设备信息
     */
    //TODO set nullable to false when generating loginInfo is ok
    @Column(nullable = true)
    private String loginInfo;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
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
