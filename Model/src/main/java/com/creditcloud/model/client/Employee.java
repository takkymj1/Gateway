/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.client;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.constraints.ClientCode;
import com.creditcloud.model.constraints.IdNumber;
import com.creditcloud.model.constraints.LoginName;
import com.creditcloud.model.constraints.MobileNumber;
import com.creditcloud.model.constraints.RealName;
import java.util.Date;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This may be used in both Manager and Agent
 *
 * @author sobranie
 */
@Data
@XmlRootElement
public class Employee extends BaseObject {

    private static final long serialVersionUID = 20130918L;

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

    @FormParam("idNumber")
    @IdNumber
    private String idNumber;

    @FormParam("mobile")
    @MobileNumber
    private String mobile;

    /**
     * 员工所属分支机构Id 因为Branch中包含了Employee,此处不能用Branch类型，否则序列化转json有问题
     */
    private String branchId;

    private Date registerDate;

    private Date lastLoginDate;
    
    private boolean enabled = true;

    public Employee() {
    }

    public Employee(String id,
                    String clientCode,
                    String loginName,
                    String employeeId,
                    String name,
                    String idNumber,
                    String mobile,
                    String branchId,
                    Date registerDate,
                    Date lastLoginDate) {
        this.id = id;
        this.clientCode = clientCode;
        this.loginName = loginName;
        this.employeeId = employeeId;
        this.name = name;
        this.idNumber = idNumber;
        this.mobile = mobile;
        this.branchId = branchId;
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

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
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
        return idNumber;
    }

    public String getMobile() {
        return mobile;
    }

    public String getBranchId() {
        return branchId;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }
}
