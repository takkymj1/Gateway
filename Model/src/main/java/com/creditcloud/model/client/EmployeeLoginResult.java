/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.client;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.LoginResult;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rooseek
 */
@XmlRootElement
public class EmployeeLoginResult extends BaseObject {

    private static final long serialVersionUID = 20130925L;

    @NotNull
    private LoginResult result;

    private Employee employee;

    public EmployeeLoginResult() {
    }

    public EmployeeLoginResult(LoginResult result,
                               Employee employee) {
        this.result = result;
        this.employee = employee;
    }

    public LoginResult getResult() {
        return result;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setResult(LoginResult result) {
        this.result = result;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
