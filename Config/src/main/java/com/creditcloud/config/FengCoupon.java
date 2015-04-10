/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.creditcloud.fund.model.enums.CouponType;
import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author caojiadong
 */
@Data
@NoArgsConstructor
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class FengCoupon extends BaseObject {
    
    private static final long serialVersionUID = 20150325L;
    
    @XmlElement(required = false)
    private String eventId;
    
    @XmlElement(required = false)
    private BigDecimal amount;

    @XmlElement(required = false)
    private BigDecimal amountLimit;

    @XmlElement(required = false)
    private CouponType type;
    
    @XmlElement(required = false)
    private Integer period;
        
    @XmlElement(required = false)
    private String description;
            
    @XmlElement(required = false)
    private Integer useLimit;

    @XmlElement(required = false)
    private String preStart;

    @XmlElement(required = false)
    private String preEnd;
}
