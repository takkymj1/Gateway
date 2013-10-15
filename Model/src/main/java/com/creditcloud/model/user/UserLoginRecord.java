/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.user;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.misc.LoginRecord;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rooseek
 */
@XmlRootElement
public class UserLoginRecord extends BaseObject {

    private static final long serialVersionUID = 20130925L;

    @NotNull
    private String id;

    @NotNull
    private String userId;

    @NotNull
    private LoginRecord record;

    public UserLoginRecord() {
    }

    public UserLoginRecord(String id, String userId, LoginRecord record) {
        this.id = id;
        this.userId = userId;
       this.record = record;
    }

    public String getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public LoginRecord getRecord() {
        return record;
    }

    public void setRecord(LoginRecord record) {
        this.record = record;
    }

}
