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
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 不通用的平台特殊功能
 *
 * @author rooseek
 */
@NoArgsConstructor
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ClientFeatures extends BaseObject {

    private static final long serialVersionUID = 20140729L;

    /**
     * 保理业务
     */
    @XmlElement
    @Getter
    private boolean enableFactoring = false;

    /**
     * PDF电子签章与签名 (for fmax & feng)
     */
    @XmlElement
    @Getter
    private boolean enablePDFSignature = false;

    /**
     * 话务系统 自动登录管理后台 (for ifeng)
     */
    @XmlElement
    @Getter
    private boolean enableServiceHotline = false;

    /**
     * Sentinel Config
     */
    @XmlElement
    @Getter
    private boolean enableServiceSentinel = false;

    /**
     * Redis Config
     */
    @XmlElement
    @Getter
    private boolean enableServiceRedis = false;

    /**
     * 是否支持原始债权
     */
    @XmlElement
    @Getter
    private boolean enableClaim = false;

    /**
     * 远程认证地址
     */
    @XmlElement
    @Getter
    private String remoteAttestationUrl;
    
    /**
     * 微信抽奖功能（TJHJ）
     */
    @XmlElement
    @Getter
    private boolean enableWechatInfo = false;
    
    /**
     * 居间服务协议
     */
    @XmlElement
    @Getter
    private boolean enableBrokerage = false;
    
    /**
     * 是否支持快速还款
     */
    @XmlElement
    @Getter
    private boolean enableLoanFastRepay = false;
    
    /**
     * 是否支持LoanRequestDatail
     */
    @XmlElement
    @Getter
    private boolean enableLoanRequestDetail = false;
    
    /**
     * 限制提现
     */
    @XmlElement
    @Getter
    private boolean restrictWithdraw = false;
    
    /**
     * 是否显示所有费率.
     * 
     * false 则只显示 平台服务费一项
     */
    @XmlElement
    @Getter
    private boolean enableFee = true;
    
    /**
     * 可以控制第三方账户权限
     */
    @XmlElement
    @Getter
    private boolean thirdPartyPerm = true;
    
    
    /**
     * 是否支持手机验证码管理
     */
    @XmlElement
    @Getter
    private boolean enableMobileCaptchaManage = false;

    /**
     * 可以控制借款人（有借款）是否计算平台取现服务费
     */
    @XmlElement
    @Getter
    private boolean enableWithdrawFeeToClientWhenLoan = false;
    
    /**
     * 可用控制又拍云存储
     * true 又拍云
     * false 凤凰
     */
    @XmlElement
    @Getter
    private boolean enableUPaiYun = false;
    
    /**
     * 可用控制平台消息管理中短信发送功能
     * true 使用
     * false 不使用
     */
    @XmlElement
    @Getter
    private boolean enableMessageSend = false;
}
