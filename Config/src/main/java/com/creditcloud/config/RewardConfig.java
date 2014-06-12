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

/**
 * config related to reward
 *
 * @author rooseek
 */
@XmlRootElement(name = "RewardConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public final class RewardConfig extends BaseConfig {

    private static final long serialVersionUID = 20140611L;

    public static final String CONFIG_NAME = "RewardConfig";

    @XmlElement(name = "ReferralReward", required = false)
    private ReferralReward referralReward;

    public ReferralReward getReferralReward() {
        return referralReward == null ? null : new ReferralReward();
    }
}
