/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config.fund;

import com.creditcloud.model.BaseObject;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 *
 * @author guohuazhang
 */
@NoArgsConstructor
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class HuaAnMoneyFundConfig extends BaseObject {

    private static final long serialVersionUID = 20150408L;

    /**
     * AES加解密密钥,base64编码
     *
     * @return
     */
    @Getter
    @XmlElement(required = false)
    private String merchantPrivateKey;
    /**
     * AES加解密密钥,base64编码
     *
     * @return
     */
    @Getter
    @XmlElement(required = false)
    private String platformPrivateKey;

    /**
     * 平台ID
     *
     * @return
     */
    @Getter
    @XmlElement(required = false)
    private String platformId;

    /**
     *
     * 商户ID，华安基金公司管理，商户在华安基金公司的基金账号
     *
     * @return
     */
    @Getter
    @XmlElement(required = false)
    private String merchantId;

    /**
     *
     * 云信管理的商户ID，对云信每个商户唯一
     *
     * @return
     */
    @Getter
    @XmlElement(required = false)
    private String merchantIdInCreditCloud;

    /**
     * 华安货币基金接口地址
     *
     * @return
     */
    @Getter
    @XmlElement(required = true)
    private String interfaceURL;
}
