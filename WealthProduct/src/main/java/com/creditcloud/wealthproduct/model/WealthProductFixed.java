/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.wealthproduct.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.constraints.IncrementalInteger;
import com.creditcloud.model.enums.loan.MortgageType;
import com.creditcloud.model.enums.loan.RepaymentMethod;
import com.creditcloud.wealthproduct.WealthProductConstant;
import com.creditcloud.wealthproduct.enums.ProductFixedType;
import com.creditcloud.wealthproduct.enums.RateLevelType;
import com.creditcloud.wealthproduct.enums.ReturnMethod;
import java.util.Collection;
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
     * 固收类产品类型
     * 
     * @return
     */
    @NotNull
    private ProductFixedType type;
    
    /**
     * 贷款类产品抵押物类型
     * 
     * @return
     */
    private Collection<MortgageType> mortgagedType;
    
    /**
     * 抵押率
     * 
     * @return
     */
    private Integer mortgageRate;
    
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
    
    public WealthProductFixed(
            String productId, 
            WealthProduct product,
            RepaymentMethod repayMethod,
            ReturnMethod returnMethod,
            RateLevelType rateLevelType,
            int minRate,
            int maxRate) {
        this.productId = productId;
        this.product = product;
        this.repayMethod = repayMethod;
        this.returnMethod = returnMethod;
        this.rateLevelType = rateLevelType;
        this.minRate = minRate;
        this.maxRate = maxRate;
        
        this.type = ProductFixedType.OTHER;
    }
    
}
