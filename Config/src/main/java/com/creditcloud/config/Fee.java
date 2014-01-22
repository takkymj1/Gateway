/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config;

import com.creditcloud.config.enums.FeePeriod;
import com.creditcloud.config.enums.FeeScope;
import com.creditcloud.config.enums.FeeType;
import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.NoArgsConstructor;

/**
 *
 * @author rooseek
 */
@NoArgsConstructor
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
    @XmlElement(required = true)
    private BigDecimal rate;

    /**
     * 收费周期
     */
    private FeePeriod period;

    /**
     * 收费范围
     */
    private FeeScope scope;

    public Fee(FeeType type, BigDecimal fixed, BigDecimal rate, FeePeriod period, FeeScope scope) {
        this.type = type;
        this.fixed = fixed;
        this.rate = rate;
        this.period = period;
        this.scope = scope;
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

    public FeePeriod getPeriod() {
        return period;
    }

    public FeeScope getScope() {
        return scope;
    }
}
