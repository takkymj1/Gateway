/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.wealthproduct.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.loan.Duration;
import com.creditcloud.wealthproduct.WealthProductConstant;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 产品利率
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class WealthProductRate extends BaseObject implements WealthProductConstant {

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
    private WealthProduct product;
    
    /**
     * 档位
     * 
     * @return
     */
    @NotNull
    @Size(max = MAX_TITLE_LENGTH)
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
     * 档位描述
     * 
     * @return
     */
    @NotNull
    @Size(max = MAX_DESCRIPTION_LENGTH)
    private String description;
}
