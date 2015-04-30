/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Getter;

/**
 *
 * @author rooseek
 */
@XmlRootElement(name = "SMSConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public final class SMSConfig extends BaseConfig {

    private static final long serialVersionUID = 20140711L;

    public static final String CONFIG_NAME = "SMSConfig";

    @XmlElement(required = false)
    @Getter
    private String platform;

    @XmlElement
    @Getter
    private String url;

    @XmlElement
    @Getter
    private String uid;

    @XmlElement
    @Getter
    private String key;

    @XmlElement(required = false)
    @Getter
    private CID cid;

    //for c123
    @XmlElement(required = false)
    @Getter
    private String cgid;
    
    // for zucp.net
    @XmlElement(required = false)
    @Getter
    private String signature;
    
    // for zucp.net 扩展账号
    @XmlElement(required = false)
    @Getter
    private String ext;

    //for chinacom DES加密key
    @XmlElement(required = false)
    @Getter
    private String deskey;
    
    @XmlElement(required = false)
    @Getter
    private String version;
    
    @XmlElement(required = false)
    @Getter
    private String propertiesPath;
    
    /**
     * 还款短信提醒，提前提醒天数配置
     */
    @XmlElement(required = false)
    @Getter
    private String remindDays;
    
    /**
     * 开启结息日短信提醒
     */
    @Getter
    @XmlElement
    private boolean enableSettleInterestNotification = false;
    
    /**
     * 开启投资成功短信提醒
     */
    @Getter
    @XmlElement
    private boolean enableInvestSuccessNotification = false;
    
    /**
     * 开启充值成功短信提醒
     */
    @Getter
    @XmlElement
    private boolean enableChargeNotification = false;
    
    /**
     * 开启提现申请短信提醒
     */
    @Getter
    @XmlElement
    private boolean enableWithDrawApplyNotification = false;
    
    /**
     * 开启标的审核结果短信提醒
     * 
     * NOTIFICATION_LOAN_OPEN
     * NOTIFICATION_LOAN_REJECT
     */
    @Getter
    @XmlElement
    private boolean enableLoanAuditNotification = false;
    
    /**
     * 开启标的募集结果短信提醒
     * 
     * NOTIFICATION_LOAN_SETTLE
     * NOTIFICATION_LOAN_FAILED
     * 
     * NOTIFICATION_LOAN_SETTLE_INVESTER
     * NOTIFICATION_LOAN_FAILED_INVESTER
     */
    @Getter
    @XmlElement
    private boolean enableLoanSettleNotification = false;
    
    /**
     * 开启标的还款短信提醒
     * 
     * NOTIFICATION_LOAN_REPAY_REMIND
     * NOTIFICATION_LOAN_REPAY_SUCCESS
     * NOTIFICATION_LOAN_REPAY_OVDERDUE
     * 
     * NOTIFICATION_LOAN_REPAY
     * NOTIFICATION_LOAN_REPAY_OVERDUE_INVESTER
     */
    @Getter
    @XmlElement
    private boolean enableRepayNotification = false;
    
    /**
     * 开启注册成功短信提醒
     */
    @Getter
    @XmlElement
    private boolean enableRegistSuccessNotification = false;
}
