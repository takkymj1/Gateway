/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.userinfo;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.User;
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
    private User user;

    @NotNull
    private PersonalInfo personal;

    @NotNull
    private FinanceInfo finance;

    @NotNull
    private CareerInfo career;

    @NotNull
    private ContactInfo contact;

    @NotNull
    private CreditInfo credit;

    public UserInfo() {
    }

    /**
     *
     * @param user 用户
     * @param personal 个人详细信息
     * @param finance 个人资产及财务信息
     * @param career 工作信息
     * @param contact 联系人信息
     * @param credit 信用信息,用戶无权设定,可以为空
     */
    public UserInfo(User user,
                    PersonalInfo personal,
                    FinanceInfo finance,
                    CareerInfo career,
                    ContactInfo contact,
                    CreditInfo credit) {
        this.userId = user.getId();
        this.user = user;
        this.personal = personal;
        this.finance = finance;
        this.career = career;
        this.contact = contact;
        this.credit = credit;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public CreditInfo getCredit() {
        return credit;
    }

    public void setCredit(CreditInfo credit) {
        this.credit = credit;
    }
}
