/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config.fund;

import com.creditcloud.config.BaseConfig;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 基金相关配置
 *
 * @author suetming <suetming.ma at creditcloud.com>
 */
@NoArgsConstructor
@XmlRootElement(name = "FundConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class FundConfig extends BaseConfig {

    private static final long serialVersionUID = 20150309L;

    public static final String CONFIG_NAME = "FundConfig";

    /**
     * 诺安全基金配置
     *
     * @return
     */
    @Getter
    @XmlElement(required = false)
    private LionFundConfig lionFund;

    /**
     * 诺安货币型基金配置
     *
     * @return
     */
    @Getter
    @XmlElement(required = false)
    private LionMoneyFundConfig lionMoneyFund;

    /**
     * 华安货币型基金配置
     *
     * @return
     */
    @Getter
    @XmlElement(required = false)
    private HuaAnMoneyFundConfig huaAnMoneyFund;

}
