/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.config;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 *
 * @author wenqiang
 * 微信抽奖奖品抽中概率等配置
 */
@Data
@NoArgsConstructor
@XmlRootElement(name = "LotteryEventPrizeConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class LotteryEventPrizeConfig extends BaseConfig{
    
    private static final long serialVersionUID = 201504101154L;
    public static final String CONFIG_NAME = "LotteryEventPrizeConfig";
    
    @Getter
    @XmlElement(name = "lotteryPrize")
    private LotteryPrize[] lotteryPrize;
    
    public List<LotteryPrize> getLotteryPrizes(String eventNo){
        List<LotteryPrize> list = new ArrayList<>();
        for(LotteryPrize p : lotteryPrize){
            if(p.getEventNo().equals(eventNo)){
                list.add(p);
            }
        }
        return list;
    }
    
    public List<BigDecimal> getProbabilities(String eventNo){
        List<LotteryPrize> list = getLotteryPrizes(eventNo);
        List<BigDecimal> probabilities = new ArrayList<>();
        for(LotteryPrize p : list){
            probabilities.add(p.getProbability());
        }
        return probabilities;
    }
}
