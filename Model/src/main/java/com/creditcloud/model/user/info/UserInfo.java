/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.user.info;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.ContactInfo;
import com.creditcloud.model.PersonalInfo;
import com.creditcloud.model.SocialInfo;
import com.creditcloud.model.user.User;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@XmlRootElement
public class UserInfo extends BaseObject {

    private static final long serialVersionUID = 20130918L;

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

    @XmlElement(name = "social")
    private SocialInfo social;

    /**
     * 平台自定义域,可以用于存储平台相关的用户信息,一般存json格式key-value
     */
    private String priv;

    /**
     *
     * @param user     用户
     * @param personal 个人详细信息
     * @param finance  个人资产及财务信息
     * @param career   工作信息
     * @param contact  联系人信息
     * @param social   社交信息
     */
    public UserInfo(User user,
                    PersonalInfo personal,
                    FinanceInfo finance,
                    CareerInfo career,
                    ContactInfo contact,
                    SocialInfo social) {
        this.userId = user.getId();
        this.user = user;
        this.personal = personal;
        this.finance = finance;
        this.career = career;
        this.contact = contact;
        this.social = social;
    }
}
