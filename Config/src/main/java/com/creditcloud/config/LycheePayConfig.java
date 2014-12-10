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
 * 快付通
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@XmlRootElement(name = "LycheePayConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class LycheePayConfig extends BaseConfig {

    private static final long serialVersionUID = 20141201L;

    public static final String CONFIG_NAME = "LycheePayConfig";

    /**
     * 最长20位纯数字商户编号，API调用用
     */
    @XmlElement(required = false)
    private String merchantId;

    /**
     * keyStorePassword
     */
    @XmlElement(required = false)
    private String keyStorePassword;
    
    /**
     * keyPassword
     */
    @XmlElement(required = false)
    private String keyPassword;
    
    /**
     * 私钥文件路径
     */
    @XmlElement(required = false)
    private String keyStorePath;
    
    /**
     * 商户公钥文件路径
     */
    @XmlElement(required = false)
    private String certificatePath;

    /**
     * 三方支付服务器的URL
     */
    @XmlElement(required = false)
    private URL url;
    
    /**
     * 三方支付服务器收银台的URL
     */
    @XmlElement(required = false)
    private URL cashierurl;

    /**
     * 用户开户路径
     */
    @XmlElement(required = false)
    private String accountNewPath;
    
    /**
     * 用户账户信息查询路径
     */
    @XmlElement(required = false)
    private String accountDetailPath;
    
    /**
     * 绑卡
     */
    @XmlElement(required = false)
    private String accountBankcardAddPath;
    
    /**
     * 解绑银行卡
     */
    @XmlElement(required = false)
    private String accountBankcardRemovePath;
    
    /**
     * 提现
     */
    @XmlElement(required = false)
    private String accountWithdrawPath;
    
    /**
     * 用户账户信息查询路径
     */
    @XmlElement(required = false)
    private String accountQueryCapitalDetailRecordPath;
    
    /**
     * 通用验密
     */
    @XmlElement(required = false)
    private String accountVerifyPath;
    
    /**
     * 网银充值
     */
    @XmlElement(required = false)
    private String cashierTradePath;
    
    /**
     * 投标签约
     */
    @XmlElement(required = false)
    private String signSubjectContractPath;

    /**
     * 三方支付回调的Url，一般是网站运行的地址
     */
    @XmlElement(required = false)
    private String retUrl;

    /**
     * Manager三方支付回调url
     */
    @XmlElement(required = false)
    private String adminRetUrl;
    
}
