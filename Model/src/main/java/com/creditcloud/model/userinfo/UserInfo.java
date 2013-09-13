/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.userinfo;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.Jsonizable;
import com.creditcloud.model.User;
import javax.json.Json;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rooseek
 */
@XmlRootElement
public class UserInfo extends BaseObject implements Jsonizable<UserInfo> {

    @NotNull
    private String userId;

    @XmlElement(name = "user")
    private User user;

    @XmlElement(name = "personal")
    private PersonalInfo personal;

    @XmlElement(name = "finance")
    private FinanceInfo finance;

    @XmlElement(name = "career")
    private CareerInfo career;

    @XmlElement(name = "contact")
    private ContactInfo contact;

    /**
     *
     * @param user 用户
     * @param personal 个人详细信息
     * @param finance 个人资产及财务信息
     * @param career 工作信息
     * @param contact 联系人信息
     */
    public UserInfo(User user,
                    PersonalInfo personal,
                    FinanceInfo finance,
                    CareerInfo career,
                    ContactInfo contact) {
        this.userId = user.getId();
        this.user = user;
        this.personal = personal;
        this.finance = finance;
        this.career = career;
        this.contact = contact;
    }

    public UserInfo() {
    }

    @Override
    public UserInfo fromJsonString(String jsonString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toJsonString() {
        return Json.createObjectBuilder()
                .add("user", user.toJsonString())
                .add("personal", personal.toJsonString())
                .add("finance", finance.toJsonString())
                .add("career", career.toJsonString())
                .add("contact", contact.toJsonString())
                .build().toString();

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

    public User getUser() {
        return user;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUser(User user) {
        this.user = user;
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
