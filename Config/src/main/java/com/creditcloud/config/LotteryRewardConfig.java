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
 * @author wenqiang
 * 微信抽奖奖品抽中概率等配置
 */
@Data
@NoArgsConstructor
@XmlRootElement(name = "LotteryRewardConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class LotteryRewardConfig extends BaseConfig{
    
    private static final long serialVersionUID = 201504101154L;
    public static final String CONFIG_NAME = "LotteryRewardConfig";
    
    @XmlElement(required = false)
    private LotteryReward fiveLotteryReward;
    
    @XmlElement(required = false)
    private LotteryReward tenLotteryReward;
    
    @XmlElement(required = false)
    private LotteryReward twentyLotteryReward;
    
    @XmlElement(required = false)
    private LotteryReward thirtyLotteryReward;
    
    @XmlElement(required = false)
    private LotteryReward tenTelChargeLotteryReward;
    
    @XmlElement(required = false)
    private LotteryReward twentyTelChargeLotteryReward;
    
    @XmlElement(required = false)
    private LotteryReward iphoneLotteryReward;
    
    @XmlElement(required = false)
    private LotteryReward cameraLotteryReward;
    
    
    
}
