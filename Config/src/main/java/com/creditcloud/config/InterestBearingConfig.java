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
 * @author GuohuaZhang
 */
@Data
@NoArgsConstructor
@XmlRootElement(name = "InterestBearingConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class InterestBearingConfig extends BaseConfig {

    private static final long serialVersionUID = 20150510L;

    public static final String CONFIG_NAME = "InterestBearingConfig";

    // 云信余额生息TA接口
    @XmlElement(required = true)
    private String urlCreditCloudTAResourceBase;

    //开通华安基金账号的云信网关系统
    @XmlElement(required = true)
    private String urlCreditCloudGateWay;
    
    //访问云信网关系统用以开通华安基金账户，或者注册云信TA的邀请码
    @XmlElement(required = true)
    private String invitationCode;
}
