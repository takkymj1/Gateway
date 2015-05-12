/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.interestbearing.model;

import java.math.BigDecimal;
import lombok.Data;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *
 * @author guohuazhang
 */
@Data
public class InterestDistributionPolicy {

    /**
     * 平台收费百分点 (0-100)
     */
    private int platformChargeRatio = 0;

    /**
     * 毛收益低于这个数值不收取手续费
     */
    private BigDecimal nonChargeableGrossAmountCeiling;

    /**
     * 尝试扣除平台手续费之后的静收益如果低于这个值，则不收取手续费
     */
    private BigDecimal chargeableNetAmountFloor;

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this,
                                                  ToStringStyle.SHORT_PREFIX_STYLE, false, false);
    }
}
