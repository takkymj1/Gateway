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
import lombok.NoArgsConstructor;
import lombok.Data;

/**
 *
 * @author caojiadong
 */
@Data
@NoArgsConstructor
@XmlRootElement(name = "FengCouponConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class FengCouponConfig extends BaseConfig {
    private static final long serialVersionUID = 20150325L;

    public static final String CONFIG_NAME = "FengCouponConfig";

    @XmlElement(required = false)
    private FengCoupon registerCoupon;
}
