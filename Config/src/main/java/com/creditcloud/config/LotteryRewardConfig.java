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
    
    @XmlElement(required = true)
    private LotteryReward fiveLotteryReward;
    
    @XmlElement(required = true)
    private LotteryReward tenLotteryReward;
    
    @XmlElement(required = true)
    private LotteryReward twentyLotteryReward;
    
    @XmlElement(required = true)
    private LotteryReward thirtyLotteryReward;
    
    @XmlElement(required = true)
    private LotteryReward tenTelChargeLotteryReward;
    
    @XmlElement(required = true)
    private LotteryReward twentyTelChargeLotteryReward;
    
    @XmlElement(required = true)
    private LotteryReward iphoneLotteryReward;
    
    @XmlElement(required = true)
    private LotteryReward cameraLotteryReward;
    
    
    
}
