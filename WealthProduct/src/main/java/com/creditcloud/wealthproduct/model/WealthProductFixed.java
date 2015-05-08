/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.wealthproduct.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.constraints.IncrementalInteger;
import com.creditcloud.model.enums.loan.RepaymentMethod;
import com.creditcloud.wealthproduct.WealthProductConstant;
import com.creditcloud.wealthproduct.enums.RateLevelType;
import com.creditcloud.wealthproduct.enums.ReturnMethod;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 固定收益类理财产品
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class WealthProductFixed extends BaseObject implements WealthProductConstant {

    /**
     * 产品ID
     * 
     * @return
     */
    private String productId;

    /**
     * 理财产品
     * 
     * @return
     */
    @NotNull
    private WealthProduct product;
 
    /**
     * 还款方式
     * 
     * @return
     */
    @NotNull
    private RepaymentMethod repayMethod;
    
    /**
     * 收益返还方式
     * 
     * @return
     */
    @NotNull
    private ReturnMethod returnMethod;
    
    /**
     * 利率档位类型
     * 
     * @return
     */
    @NotNull
    private RateLevelType rateLevelType;
    
    /**
     * 产品最小利率
     * 
     * @return
     */
    @IncrementalInteger(min = MIN_RATE,
                        increment = RATE_INCREMENT,
                        max = MAX_RATE)
    private Integer minRate;
    
    /**
     * 产品最大利率
     * 
     * @return
     */
    @IncrementalInteger(min = MIN_RATE,
                        increment = RATE_INCREMENT,
                        max = MAX_RATE)
    private Integer maxRate;
}
