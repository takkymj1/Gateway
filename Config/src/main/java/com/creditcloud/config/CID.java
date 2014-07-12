/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config;

import com.creditcloud.model.BaseObject;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author yangxiongwei 短信模版cid
 */
@Data
@NoArgsConstructor
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CID extends BaseObject {

    private static final long serialVersionUID = 20140711L;

    /**
     * 注册 CreditMarket 的手机激活码
     */
    @XmlElement
    private String register;

    /**
     * CreditMarket用户账号绑定手机
     */
    @XmlElement
    private String authenticateMobile;

    /**
     * CreditMarke中用戶更改密码发送确认码
     */
    @XmlElement
    private String changeLoginPassword;

    /**
     * CreditMarket中用户忘记密码时候重设密码
     */
    @XmlElement
    private String resetPassword;

    /**
     * CreditManager 内 Message
     */
    @XmlElement
    private String message;

    /**
     * CreditManager 中给员工重置密码.
     */
    @XmlElement
    private String manageResetPassword;

    /**
     * CreditManager 内给新建员工的短信，包含初始密码
     */
    @XmlElement
    private String employeeCreated;

    /**
     * CreditMarket 内给新建用户的短信，包含初始的随机密码，适用于后台开户
     */
    @XmlElement
    private String userCreated;

    /**
     * LoanRequest 的 状态发生改变时给用户发送的提示信息.
     */
    @XmlElement
    private String loanRequestStatus;

    /**
     * Loan状态变化时发送给用户信息
     */
    @XmlElement
    private String loanStatus;

    /**
     * InvestRepay成功发生时发送给investor的提示信息.
     */
    @XmlElement
    private String loanRepay;

    /**
     * Loan还清时发送给investor的提示信息.
     */
    @XmlElement
    private String loanCleared;

    /**
     * 用户提交取现申请
     */
    @XmlElement
    private String withdrawApply;

}
