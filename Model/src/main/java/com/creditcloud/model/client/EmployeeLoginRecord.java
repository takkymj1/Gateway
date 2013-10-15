/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.client;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.misc.LoginRecord;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rooseek
 */
@XmlRootElement
public class EmployeeLoginRecord extends BaseObject {

    private static final long serialVersionUID = 20130925L;

    @NotNull
    private String id;

    @NotNull
    private String employeeId;

    @NotNull
    private LoginRecord record;

    public EmployeeLoginRecord() {
    }

    public EmployeeLoginRecord(String id, String employeeId, LoginRecord record) {
        this.id = id;
        this.employeeId = employeeId;
        this.record = record;
    }

    public String getId() {
        return id;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public LoginRecord getRecord() {
        return record;
    }

    public void setRecord(LoginRecord record) {
        this.record = record;
    }
}
