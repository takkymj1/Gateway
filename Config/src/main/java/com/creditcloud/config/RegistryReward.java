/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config;

import javax.validation.constraints.Min;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Getter;

/**
 * config for registry reward
 *
 * @author rooseek
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public final class RegistryReward extends BaseConfig {

    private static final long serialVersionUID = 20140619L;

    /**
     * 在某日期之后注册的用户才给与奖励
     */
    @Getter
    @XmlElement(required = false)
    private String startDate = "1970-01-01";

    /**
     * 奖励金额
     */
    @Min(0)
    @Getter
    @XmlElement(required = false)
    private int rewardAmount = 0;

}
