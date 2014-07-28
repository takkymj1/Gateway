/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config;

import com.creditcloud.config.enums.FeePeriod;
import com.creditcloud.config.enums.FeePhase;
import com.creditcloud.config.enums.FeeScope;
import com.creditcloud.config.enums.FeeType;
import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Fee extends BaseObject {

    private static final long serialVersionUID = 20131201L;
    
    /**
     * 费用名称
     */
    @XmlElement(required = false)
    private String name;

    /**
     * 费用类型
     */
    @XmlElement(required = true)
    private FeeType type;

    /**
     * 固定费用
     */
    @Min(0)
    @XmlElement(required = true)
    private BigDecimal fixed;

    /**
     * 浮动费率
     */
    @Min(0)
    @Max(1)
    @XmlElement(required = true)
    private BigDecimal rate;

    /**
     * 收费周期
     */
    private FeePeriod period = FeePeriod.SINGLE;

    /**
     * 收费范围
     */
    private FeeScope scope = FeeScope.PRINCIPAL;

    /**
     * 何时收费
     */
    private FeePhase phase = FeePhase.LOAN;

    /**
     * 此费用的详细描述
     */
    private String description;

    public Fee(FeeType type, BigDecimal fixed, BigDecimal rate, FeePeriod period, FeeScope scope) {
        this.type = type;
        this.fixed = fixed;
        this.rate = rate;
        this.period = period;
        this.scope = scope;
    }

    /**
     * 考虑费用收取类型后的实际费率
     *
     * @return
     */
    public BigDecimal getActualRate() {
        switch (type) {
            case NONE:
            case FIXED:
                return BigDecimal.ZERO;
            default:
                return rate;
        }
    }

    /**
     * 考虑费用收取类型后的实际固定费用
     *
     * @return
     */
    public BigDecimal getActualFixed() {
        switch (type) {
            case NONE:
            case FLOATING:
                return BigDecimal.ZERO;
            default:
                return fixed;
        }
    }
}
