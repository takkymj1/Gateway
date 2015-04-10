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
import java.math.BigDecimal;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *奖品抽中概率等信息
 * @author wenqiang
 */
@Data
@NoArgsConstructor
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class LotteryReward extends BaseObject{
    
     private static final long serialVersionUID = 20150408L;
     
     /**
      * 奖励id
      */
     @XmlElement(required = false)
     private String awardid;
     
     /**
      * 出现的概率 0表示不按概率进行计算
      */
     @XmlElement(required = false)
     private int probability;
     
     /**
      * 数量 -1表示无限制
      */
     @XmlElement(required = false)
     private int quantity;
     
     /**
      * 该奖品出现的时机 all表示活动期间每天都出现
      */
     @XmlElement(required = false)
     private String appeardate;
}
