/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config;

import com.creditcloud.config.enums.FeeType;
import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rooseek
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Fee extends BaseObject {

    private static final long serialVersionUID = 20131201L;

    /**
     * 费用类型
     */
    @XmlElement(required = true)
    private FeeType type;

    /**
     * 固定费用
     */
    @XmlElement(required = true)
    private BigDecimal fixed;

    /**
     * 浮动费率
     */
    private BigDecimal rate;

    public Fee() {
    }

    public Fee(FeeType type, BigDecimal fixed, BigDecimal rate) {
        this.type = type;
        this.fixed = fixed;
        this.rate = rate;
    }

    public FeeType getType() {
        return type;
    }

    public BigDecimal getFixed() {
        return fixed;
    }

    public BigDecimal getRate() {
        return rate;
    }
}
