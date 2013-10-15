/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.user;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.constraints.ClientCode;
import com.creditcloud.model.constraints.EmailAddress;
import com.creditcloud.model.constraints.IdNumber;
import com.creditcloud.model.constraints.LoginName;
import com.creditcloud.model.constraints.MobileNumber;
import com.creditcloud.model.constraints.RealName;
import com.creditcloud.model.constraints.UUID;
import com.creditcloud.model.enums.Source;
import com.creditcloud.model.validation.group.BackSourceCheck;
import com.creditcloud.model.validation.group.MobileSourceCheck;
import com.creditcloud.model.validation.group.WebSourceCheck;
import java.io.StringReader;
import java.util.Date;
import javax.json.Json;
import javax.json.JsonObject;
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

    private static final long serialVersionUID = 20130918L;

    @NotNull
    @UUID
    protected String id;

    @ClientCode
    protected String clientCode;

    /**
     * The real name of this person
     */
    @FormParam("name")
    @RealName
    protected String name;

    /**
     * 登录名，对于Source.Web方式注册用户必须有,其他方式默认为特殊字符串+手机号
     */
    @FormParam("loginName")
    @LoginName
    protected String loginName;

    /**
     * 身份证号
     */
    @FormParam("idNumber")
    @IdNumber
    protected String idNumber;

    /**
     * 手机号
     */
    @FormParam("mobile")
    @MobileNumber
    protected String mobile;

    /**
     * 邮箱，对于Source.Web方式注册用户必须有,且不能为默认的
     */
    @FormParam("email")
    @EmailAddress(groups = WebSourceCheck.class)
    protected String email;

    @NotNull
    protected Source source;

    @NotNull(groups = {BackSourceCheck.class, MobileSourceCheck.class})
    private String employeeId;

    @Past
    protected Date lastLoginDate;

    @Past
    protected Date registerDate;

    public User() {
    }

    public User(String Id,
                String clientCode,
                String name,
                String loginName,
                String idNumber,
                String mobile,
                String email,
                Source source) {
        this(Id, clientCode, name, loginName, idNumber, mobile, email, source, null, null, null);
    }

    public User(String id,
                String clientCode,
                String name,
                String loginName,
                String idNumber,
                String mobile,
                String email,
                Source source,
                String employeeId,
                Date lastLoginDate,
                Date registerDate) {
        this.id = id;
        this.clientCode = clientCode;
        this.name = name;
        this.loginName = loginName;
        this.idNumber = idNumber;
        this.mobile = mobile;
        this.email = email;
        this.source = source;
        this.employeeId = employeeId;
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

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public static User fromJsonString(String jsonString) {
        if (jsonString == null) {
            return null;
        }
        JsonObject jo = Json.createReader(new StringReader(jsonString)).readObject();
        User result = new User();
        //TODO this and many other fromJsonString methods for user classes will mostly be called from device.
        //currently only email is allowed to be reset from device side.
        result.setEmail(jo.getString("email"));

        return result;
    }
}
