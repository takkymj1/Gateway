/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.user.info;

import com.creditcloud.model.BaseObject;
import java.io.StringReader;
import javax.json.Json;
import javax.json.JsonObject;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rooseek
 */
@XmlRootElement
public class UserInfo extends BaseObject {

    private static final long serialVersionUID = 20130918L;

    @NotNull
    private String userId;

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

    public UserInfo() {
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

    public void setUserId(String userId) {
        this.userId = userId;
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

    public static UserInfo fromJsonString(String jsonString) {
        if (jsonString == null) {
            return null;
        }
        JsonObject jo = Json.createReader(new StringReader(jsonString)).readObject();
        UserInfo result = new UserInfo();
        result.setCareer(CareerInfo.fromJsonString(jo.getJsonObject("career") == null ? null : jo.getJsonObject("career").toString()));
        result.setContact(ContactInfo.fromJsonString(jo.getJsonObject("contact") == null ? null : jo.getJsonObject("contact").toString()));
        result.setFinance(FinanceInfo.fromJsonString(jo.getJsonObject("finance") == null ? null : jo.getJsonObject("finance").toString()));
        result.setPersonal(PersonalInfo.fromJsonString(jo.getJsonObject("personal") == null ? null : jo.getJsonObject("personal").toString()));
        result.setUserId(null);

        return result;
    }
}
