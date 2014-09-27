/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config.wealthproduct;

import com.creditcloud.config.Fee;
import com.creditcloud.model.BaseObject;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 *
 * @author rooseek
 */
@NoArgsConstructor
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ProductFeeConfig extends BaseObject {

    private static final long serialVersionUID = 20140925L;

    @Getter
    @XmlElement(name = "purchaseFee", required = true)
    private Fee purchaseFee;

    @Getter
    @XmlElement(name = "manageFee", required = true)
    private Fee manageFee;

    @Getter
    @XmlElement(name = "redeemFee", required = true)
    private Fee redeemFee;

    @Getter
    @XmlElement(name = "advanceRedeemFee", required = true)
    private Fee advanceRedeemFee;
}
