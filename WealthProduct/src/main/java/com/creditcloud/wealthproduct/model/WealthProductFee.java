/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.wealthproduct.model;

import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.ws.rs.FormParam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 产品费率
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class WealthProductFee extends BaseObject {
    
    /**
     * 产品ID
     * 
     * @return
     */
     @FormParam("productId")
    private String productId;

    /**
     * 认购费率
     * 
     * @return
     */
    @Min(0)
    @Max(1)
     @FormParam("subscribeFee")
    private BigDecimal subscribeFee;
    
    /**
     * 申购费率
     * 
     * @return
     */
    @Min(0)
    @Max(1)
     @FormParam("purchaseFee")
    private BigDecimal purchaseFee;

    /**
     * 管理费率
     * 
     * @return
     */
    @Min(0)
    @Max(1)
     @FormParam("manageFee")
    private BigDecimal manageFee;

    /**
     * 赎回费率
     * 
     * @return
     */
    @Min(0)
    @Max(1)
     @FormParam("redeemFee")
    private BigDecimal redeemFee;

    /**
     * 托管服务费
     * 
     * @return
     */
    @Min(0)
    @Max(1)
     @FormParam("custodyFee")
    private BigDecimal custodyFee;
    
    /**
     * 运营服务费
     * 
     * @return
     */
    @Min(0)
    @Max(1)
     @FormParam("serviceFee")
    private BigDecimal serviceFee;
    
    /**
     * 直销销售佣金
     * 
     * @return
     */
    @Min(0)
    @Max(1)
     @FormParam("directSalesFee")
    private BigDecimal directSalesFee;
    
    /**
     * 直销销售佣金
     * 
     * @return
     */
    @Min(0)
    @Max(1)
     @FormParam("channelSalesFee")
    private BigDecimal channelSalesFee;
    
    /**
     * 活动奖励佣金
     * 
     * @return
     */
    @Min(0)
    @Max(1)
     @FormParam("bonusFee")
    private BigDecimal bonusFee;
}
