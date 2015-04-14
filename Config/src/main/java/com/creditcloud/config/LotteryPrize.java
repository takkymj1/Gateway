/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.config;

import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
public class LotteryPrize extends BaseObject{
    
     private static final long serialVersionUID = 20150408L;
     
     /**
      * 活动编号
      */
     @XmlElement(required = true)
     private String eventNo;
     
     /**
      * 奖励id
      */
     @XmlElement(required = false)
     private String prizeNo;
     
     /**
      * 出现的概率
      */
     @XmlElement(required = false)
     private BigDecimal probability;
     
     /**
      * 数量 -1表示无限制
      */
     @XmlElement(required = false)
     private int quantity;
}
