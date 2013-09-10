/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model;

import com.creditcloud.model.client.Branch;
import com.creditcloud.model.constraints.ClientCode;
import com.creditcloud.model.constraints.LoginName;
import com.creditcloud.model.constraints.MobileNumber;
import com.creditcloud.model.constraints.RealName;
import java.util.Date;
import javax.validation.constraints.Past;
import javax.ws.rs.FormParam;

/**
 * This may be used in both Manager and Agent
 *
 * @author sobranie
 */
public class Employee extends BaseObject {
    
    @FormParam("id")
    private String id;
    
    @ClientCode
    private String clientCode;

    @FormParam("loginName")
    @LoginName
    private String loginName;

    @FormParam("employeeId")
    private String employeeId;

    @FormParam("name")
    @RealName
    private String name;

    @FormParam("mobile")
    @MobileNumber
    private String mobile;
    
    /**
     * 员工所属分支机构
     */
    private Branch branch;

    @Past
    private Date registerDate;

    @Past
    private Date lastLoginDate;
    
    public Employee() {
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClientCode() {
        return clientCode;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }
}
