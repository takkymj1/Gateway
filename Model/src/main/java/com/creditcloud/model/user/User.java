/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.user;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.constraints.ClientCode;
import com.creditcloud.model.constraints.EmailAddress;
import com.creditcloud.model.constraints.IdNumber;
import com.creditcloud.model.constraints.LoginName;
import com.creditcloud.model.constraints.MobileNumber;
import com.creditcloud.model.constraints.RealName;
import com.creditcloud.model.constraints.UUID;
import com.creditcloud.model.enums.Source;
import com.creditcloud.model.misc.RealmEntity;
import com.creditcloud.model.validation.group.BackSourceCheck;
import com.creditcloud.model.validation.group.IndividualUserCheck;
import com.creditcloud.model.validation.group.MobileSourceCheck;
import com.creditcloud.model.validation.group.WebSourceCheck;
import java.util.Date;
import javax.validation.Validator;
import javax.validation.constraints.NotNull;
import javax.validation.groups.Default;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author sobranie
 */
@Data
@NoArgsConstructor
@XmlRootElement
public class User extends BaseObject {

    private static final long serialVersionUID = 20130918L;

    @UUID
    protected String id;

    @ClientCode
    protected String clientCode;

    /**
     * The real name of this person
     */
    @FormParam("name")
    @RealName
    protected String name;

    /**
     * 登录名，对于Source.Web方式注册用户必须有,其他方式默认为特殊字符串+手机号
     */
    @FormParam("loginName")
    @LoginName
    protected String loginName;

    /**
     * 身份证号
     */
    @FormParam("idNumber")
    @IdNumber
    protected String idNumber;

    /**
     * 手机号
     */
    @FormParam("mobile")
    @MobileNumber(groups = {Default.class})
    @NotNull(groups = {IndividualUserCheck.class})
    protected String mobile;

    /**
     * 邮箱，对于Source.Web方式注册用户必须有,且不能为默认的
     */
    @FormParam("email")
    @EmailAddress(groups = WebSourceCheck.class)
    protected String email;

    @NotNull
    protected Source source;

    @NotNull(groups = {BackSourceCheck.class})
    private String employeeId;

    private String lastModifiedBy;

    /**
     * 渠道来源，主要与Source区别<p>
     * source是预定义的来源终端如浏览器、手机，channel是外部用户导入渠道如百度推广
     */
    @FormParam("channel")
    private String channel;

    protected Date lastLoginDate;

    protected Date registerDate;

    /**
     * 用户默认是启用状态
     */
    private boolean enabled = true;

    /**
     * 推荐人，可以为空，也可以为用户、员工等
     */
    private RealmEntity referralEntity;

    /**
     * 默认是个人用户
     */
    private boolean enterprise = false;

    /**
     * 是否已经注册奖励
     */
    private boolean registryRewarded;

    /**
     * 是否已经推荐奖励
     */
    private boolean referralRewarded;

    /**
     * 用戶组
     */
    private String groupId;

    public User(String Id,
                String clientCode,
                String name,
                String loginName,
                String idNumber,
                String mobile,
                String email,
                Source source,
                String employeeId,
                String lastModifiedBy) {
        this(Id, clientCode, name, loginName, idNumber, mobile, email, source, employeeId, lastModifiedBy, null, null, null);
    }

    public User(String id,
                String clientCode,
                String name,
                String loginName,
                String idNumber,
                String mobile,
                String email,
                Source source,
                String employeeId,
                String lastModifiedBy,
                Date lastLoginDate,
                Date registerDate,
                RealmEntity referralEntity) {
        this.id = id;
        this.clientCode = clientCode;
        this.name = name;
        this.loginName = loginName;
        this.idNumber = idNumber;
        this.mobile = mobile;
        this.email = email;
        this.source = source;
        this.employeeId = employeeId;
        this.lastLoginDate = lastLoginDate;
        this.registerDate = registerDate;
        this.referralEntity = referralEntity;
    }

    /**
     * validate user
     *
     * @param user
     * @param validator
     */
    public static void validate(Validator validator, User user) {
        Class sourceClazz = Default.class;
        switch (user.getSource()) {
            case WEB:
                sourceClazz = WebSourceCheck.class;
                break;
            case BACK:
                sourceClazz = BackSourceCheck.class;
                break;
            case MOBILE:
                sourceClazz = MobileSourceCheck.class;
                break;
        }
        Class userClazz = Default.class;
        if (user.isEnterprise()) {
            userClazz = IndividualUserCheck.class;
        }
        validator.validate(user, sourceClazz, userClazz);
    }
}
