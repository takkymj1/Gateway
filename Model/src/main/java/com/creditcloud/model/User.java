/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model;

import com.creditcloud.model.constraints.ClientCode;
import com.creditcloud.model.constraints.EmailAddress;
import com.creditcloud.model.constraints.IdNumber;
import com.creditcloud.model.constraints.LoginName;
import com.creditcloud.model.constraints.MobileNumber;
import com.creditcloud.model.constraints.RealName;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sobranie
 */
@XmlRootElement
public class User extends BaseObject {

    @NotNull
    protected String id;

    @ClientCode
    protected String clientCode;

    /**
     * The real name of this person
     */
    @FormParam("name")
    @RealName
    protected String name;

    @FormParam("loginName")
    @LoginName
    protected String loginName;

    @FormParam("idNumber")
    @IdNumber
    protected String idNumber;

    @FormParam("mobile")
    @MobileNumber
    protected String mobile;

    @FormParam("email")
    @EmailAddress
    protected String email;

    protected String salt;

    protected String passphrase;

    @Past
    protected Date lastLoginDate;

    @Past
    protected Date registerDate;

    public User() {
    }

    public User(String id,
                String clientCode,
                String name,
                String loginName,
                String idNumber,
                String mobile,
                String email) {
        this(id, clientCode, name, loginName, idNumber, mobile, email, null, null, null, null);
    }

    public User(String id,
                String clientCode,
                String name,
                String loginName,
                String idNumber,
                String mobile,
                String email,
                String salt,
                String passphrase,
                Date lastLoginDate,
                Date registerDate) {
        this.id = id;
        this.clientCode = clientCode;
        this.name = name;
        this.loginName = loginName;
        this.idNumber = idNumber;
        this.mobile = mobile;
        this.email = email;
        this.salt = salt;
        this.passphrase = passphrase;
        this.lastLoginDate = lastLoginDate;
        this.registerDate = registerDate;
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

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public String getClientCode() {
        return clientCode;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getPassphrase() {
        return passphrase;
    }

    public void setPassphrase(String passphrase) {
        this.passphrase = passphrase;
    }
}
