/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model;

import com.creditcloud.model.client.Branch;
import com.creditcloud.model.constraints.ClientCode;
import com.creditcloud.model.constraints.IdNumber;
import com.creditcloud.model.constraints.LoginName;
import com.creditcloud.model.constraints.MobileNumber;
import com.creditcloud.model.constraints.RealName;
import java.util.Date;
import javax.validation.constraints.Past;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * This may be used in both Manager and Agent
 *
 * @author sobranie
 */
@XmlRootElement
public class Employee extends BaseObject {

    private static final long serialVersionUID = 20130918L;

    @FormParam("id")
    @XmlElement(name = "id")
    private String id;

    @ClientCode
    private String clientCode;

    @FormParam("loginName")
    @LoginName
    @XmlElement(name = "loginName")
    private String loginName;

    @FormParam("employeeId")
    @XmlElement(name = "employeeId")
    private String employeeId;

    @FormParam("name")
    @RealName
    @XmlElement(name = "name")
    private String name;

    @FormParam("IdNumber")
    @IdNumber
    @XmlElement(name = "IdNumber")
    private String IdNumber;

    @FormParam("mobile")
    @MobileNumber
    @XmlElement(name = "mobile")
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

    public Employee(String id,
                    String clientCode,
                    String loginName,
                    String employeeId,
                    String name,
                    String IdNumber,
                    String mobile,
                    Branch branch,
                    Date registerDate,
                    Date lastLoginDate) {
        this.id = id;
        this.clientCode = clientCode;
        this.loginName = loginName;
        this.employeeId = employeeId;
        this.name = name;
        this.IdNumber = IdNumber;
        this.mobile = mobile;
        this.branch = branch;
        this.registerDate = registerDate;
        this.lastLoginDate = lastLoginDate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdNumber(String IdNumber) {
        this.IdNumber = IdNumber;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public String getId() {
        return id;
    }

    public String getClientCode() {
        return clientCode;
    }

    public String getLoginName() {
        return loginName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getIdNumber() {
        return IdNumber;
    }

    public String getMobile() {
        return mobile;
    }

    public Branch getBranch() {
        return branch;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }
}
