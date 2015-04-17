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
 * 支付渠道统一控制,用于控制通道类支付
 *
 * @author rooseek
 */
@NoArgsConstructor
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class PaymentFeatures extends BaseObject {

    private static final long serialVersionUID = 20150315L;

    /**
     * 银联支付
     */
    @XmlElement(required = false)
    @Getter
    private boolean enableChinaPay = false;

    /**
     * 连连支付
     */
    @XmlElement(required = false)
    @Getter
    private boolean enableLianLianPay = false;

    /**
     * 富友支付
     */
    @XmlElement(required = false)
    @Getter
    private boolean enableFuiouPay = false;

}
