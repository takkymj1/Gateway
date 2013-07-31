/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.userinfo;

import com.creditcloud.model.BaseObject;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 *
 * @author rooseek
 */
public class UserInfo extends BaseObject {

    @Id
    private String userId;

    @NotNull
    private PersonalInfo personal;

    @NotNull
    private FinanceInfo finance;

    @NotNull
    private CareerInfo career;

    @NotNull
    private ContactInfo contact;

    public UserInfo() {
    }

    /**
     *
     * @param user 用户
     * @param personal 个人详细信息
     * @param finance 个人资产及财务信息
     * @param career 工作信息
     * @param contact 联系人信息
     */
    public UserInfo(String userId,
                    PersonalInfo personal,
                    FinanceInfo finance,
                    CareerInfo career,
                    ContactInfo contact) {
        this.userId = userId;
        this.personal = personal;
        this.finance = finance;
        this.career = career;
        this.contact = contact;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public PersonalInfo getPersonal() {
        return personal;
    }

    public FinanceInfo getFinance() {
        return finance;
    }

    public CareerInfo getCareer() {
        return career;
    }

    public ContactInfo getContact() {
        return contact;
    }

    public void setPersonal(PersonalInfo personal) {
        this.personal = personal;
    }

    public void setFinance(FinanceInfo finance) {
        this.finance = finance;
    }

    public void setCareer(CareerInfo career) {
        this.career = career;
    }

    public void setContact(ContactInfo contact) {
        this.contact = contact;
    }
}
