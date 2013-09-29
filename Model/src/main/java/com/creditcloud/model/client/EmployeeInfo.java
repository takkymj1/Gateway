/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.client;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.ContactInfo;
import com.creditcloud.model.PersonalInfo;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * TODO 员工的info与用户会有很多不同,有些更丰富如薪酬有些则没有如FinanceInfo。
 *
 * @author rooseek
 */
@XmlRootElement
public class EmployeeInfo extends BaseObject {

    private static final long serialVersionUID = 20130920L;

    @NotNull
    private String employeeId;

    @Valid
    private PersonalInfo personal;

    @Valid
    private ContactInfo contact;

    public EmployeeInfo() {
    }

    public EmployeeInfo(String employeeId,
                        PersonalInfo personal,
                        ContactInfo contact) {

        this.employeeId = employeeId;
        this.personal = personal;
        this.contact = contact;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public PersonalInfo getPersonal() {
        return personal;
    }

    public ContactInfo getContact() {
        return contact;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setPersonal(PersonalInfo personal) {
        this.personal = personal;
    }

    public void setContact(ContactInfo contact) {
        this.contact = contact;
    }
}
