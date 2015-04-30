/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.wealthproduct.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.constraints.IncrementalInteger;
import com.creditcloud.model.loan.Duration;
import static com.creditcloud.wealthproduct.WealthProductConstant.AMOUNT_INCREMENT;
import static com.creditcloud.wealthproduct.WealthProductConstant.MAX_DESCRIPTION_LENGTH;
import static com.creditcloud.wealthproduct.WealthProductConstant.MAX_RAISE_AMOUNT;
import static com.creditcloud.wealthproduct.WealthProductConstant.MAX_RATE;
import static com.creditcloud.wealthproduct.WealthProductConstant.MAX_TITLE_LENGTH;
import static com.creditcloud.wealthproduct.WealthProductConstant.MIN_RAISE_AMOUNT;
import static com.creditcloud.wealthproduct.WealthProductConstant.MIN_RATE;
import static com.creditcloud.wealthproduct.WealthProductConstant.RATE_INCREMENT;
import com.creditcloud.wealthproduct.enums.RateLevelType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.groups.Default;

/**
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
public class WealthProductRate extends BaseObject {

    private String productId;
    
    /**
     * 理财产品
     * 
     * @return
     */
    private WealthProduct product;
    
    /**
     * 档位
     * 
     * @return
     */
    @Size(max = MAX_TITLE_LENGTH)
    @NotNull
    private String title;
    
    /**
     * 产品利率
     * 
     * @return
     */
    @NotNull
    private Integer rate;
 
    /**
     * 最小申购金额
     * 
     * @return
     */
    @NotNull
    private Integer minAmount;
    
    /**
     * 最大申购金额
     * 
     * @return
     */
    @NotNull
    private Integer maxAmount;
 
    /**
     * 最小投资期限
     * 
     * @return
     */
    @NotNull
    private Duration minDuration;
    
    /**
     * 最大投资期限
     * 
     * @return
     */
    @NotNull
    private Duration maxDuration;
    
    /**
     * 利率类型
     * 
     * @return
     */
    @NotNull
    private RateLevelType type;
    
    /**
     * 档位描述
     * 
     * @return
     */
    @NotNull
    private String description;
}
