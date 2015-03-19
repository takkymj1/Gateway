/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config;

import java.net.URL;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 第三方支付需要的配置文件项<p>
 *
 * @author sobranie
 */
@Data
@NoArgsConstructor
@XmlRootElement(name = "PaymentConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class PaymentConfig extends BaseConfig {

    private static final long serialVersionUID = 20131105L;

    public static final String CONFIG_NAME = "PaymentConfig";

    /**
     * 6位客户ID，ChkValue生成用
     */
    @XmlElement(required = false)
    private String merId;

    /**
     * 16位客户ID，API调用用
     */
    @XmlElement(required = false)
    private String merCustId;

    /**
     * 客户私钥文件路径
     */
    @XmlElement(required = false)
    private String privateKeyPath;

    /**
     * 公钥文件路径
     */
    @XmlElement(required = false)
    private String publicKeyPath;

    /**
     * 三方支付服务器的URL
     */
    @XmlElement(required = false)
    private URL url;

    /**
     * 三方支付服务的远程路径
     */
    @XmlElement(required = false)
    private String path;

    /**
     * 三方支付回调的Url，一般是网站运行的地址
     */
    @XmlElement(required = false)
    private String retUrl;

    /**
     * 平板服务三方支付回调url
     */
    @XmlElement(required = false)
    private String deviceRetUrl;

    /**
     * Manager三方支付回调url
     */
    @XmlElement(required = false)
    private String adminRetUrl;

    /**
     * 最大投资手续费率
     */
    @XmlElement(required = false)
    private String maxTenderRate;

    /**
     * 最大借款手续费率
     */
    @XmlElement(required = false)
    private String maxBorrowerRate;

    /**
     * 默认走取现复核
     */
    @XmlElement(required = false)
    private boolean enableWithdrawAudit = true;

    //下面配置的是商户子账户
    /**
     * 基本账户用于充值取现,类型:专属借记账户
     */
    @XmlElement(name = "baseAccount", required = true)
    private SubAccount baseAccount;

    /**
     * 收费账户, 类型:专用借记账户
     */
    @XmlElement(name = "feeAccount", required = true)
    private SubAccount feeAccount;

    /**
     * 风险保证金账户, 类型:专用借记账户
     */
    @XmlElement(name = "guaranteeAccount", required = true)
    private SubAccount guaranteeAccount;

    /**
     * 商户在三方支付的保证金账户
     */
    @XmlElement(name = "marginAccount", required = false)
    private SubAccount marginAccount;

    /**
     * 除了上面三种基本子账户外的其他子账户
     */
    @XmlElement(name = "subAccounts", required = false)
    private SubAccounts subAccounts;

    /**
     * 用户三方支付开户时所使用的账户名、手机、身份证信息后几位<p>
     * 只用于测试环境,用于替换之前账号<p>
     * 例如手机号13810002000被替换为13810002011
     */
    @XmlElement(name = "userRegisterSuffix", required = false)
    private String userRegisterSuffix;

    /**
     * 对账内容太多，可以选择不输出到log
     */
    @XmlElement(name = "printReconciliationLog", required = false)
    private boolean printReconciliationLog = true;

}
