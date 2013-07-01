/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model;

import com.creditcloud.model.constraints.EmailAddress;
import com.creditcloud.model.constraints.IdNumber;
import com.creditcloud.model.constraints.LoginName;
import com.creditcloud.model.constraints.MobileNumber;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author sobranie
 */
public class User extends BaseObject {

    @NotNull
    protected String id;
    
    /**
     * The real name of this person
     */
    @NotNull
    @Size(min = 1, max = 30)
    protected String name;
    
    @LoginName
    protected String loginName;
    
    @IdNumber
    protected String idNumber;
    
    @MobileNumber
    protected String mobile;
    
    @EmailAddress
    protected String email;
    
    public User(String id,
                String name,
                String loginName,
                String idNumber,
                String mobile,
                String email) {
        this.id = id;
        this.name = name;
        this.loginName = loginName;
        this.idNumber = idNumber;
        this.mobile = mobile;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
