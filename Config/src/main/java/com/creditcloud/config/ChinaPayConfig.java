/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
@XmlRootElement(name = "ChinaPayConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class ChinaPayConfig extends BaseConfig {

    private static final long serialVersionUID = 20150308L;

    public static final String CONFIG_NAME = "ChinaPayConfig";

    // 银联属性
    // 单笔代扣,单笔代付公用信息
    public static final String CHINAPAY_MERCHANT_ID = "999999999999999";

    // 单笔代扣所需配置
    @XmlElement(required = true)
    private String urlSingleCut;
    @XmlElement(required = true)
    private String urlSingleCutQuery;

    // 单笔代付所需配置
    @XmlElement(required = true)
    private String urlSinglePay;
    @XmlElement(required = true)
    private String urlSingPayQuery;
    @XmlElement(required = true)
    private String urlSingPayAccountBalanceQuery;

    // 客户银行卡认证所需配置
    @XmlElement(required = true)
    private String urlFrontendBankAccountValidating;
    @XmlElement(required = true)
    private String urlBackendBankAccountValidating;

    // 中民i投属性
    // 单笔代扣所需配置
    @XmlElement(required = true)
    private String pathSinglePayPrivateKey;
    @XmlElement(required = true)
    private String pathSinglePayPublicKey;
    @XmlElement(required = true)
    private String singlePayMerchantId;

    // 单笔代付所需配置
    @XmlElement(required = true)
    private String pathSingleCutPrivateKey;
    @XmlElement(required = true)
    private String pathSingleCutPublicKey;
    @XmlElement(required = true)
    private String singleCutMerchantId;

    // 客户银行卡认证所需配置
    @XmlElement(required = true)
    private String appSysIdForBankAccountValidating;
    @XmlElement(required = true)
    private String signKeyForBankAccountValidating;
    @XmlElement(required = true)
    private String pathChinaPayPublicKey;
}
