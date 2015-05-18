/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.model;

import com.creditcloud.investmentfund.enums.DividendMethod;
import com.creditcloud.investmentfund.enums.FundBrand;
import com.creditcloud.investmentfund.enums.FundType;
import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 基金分红记录
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class FundDividendRecord extends BaseObject {
    
    /**
     * ID
     */
    public String id;
    
    /**
     * 用户ID
     */
    private String userId;
    
    /**
     * 基金代码
     */
    private String fundCode;	
    
    /**
     * 基金品牌
     */
    private FundBrand fundBrand;
    
    /**
     * 基金类型
     */
    private FundType fundType;
    
    /**
     * 分红方式
     */
    private DividendMethod method;
    
    /**
     * 分红份额
     */
    private BigDecimal share;
    
    /**
     * 分红金额
     */
    private BigDecimal amount;
    
     /**
     * 分红份额单位净值
     */
    private BigDecimal nav;
    
    /**
     * 分红发放日
     * 
     * @return
     */
    private Date transactionDate;
 
    /**
     * 创建时间
     * 
     * @return
     */
    protected Date timeCreated;

    /**
     * 更新时间
     * 
     * @return
     */
    protected Date timeLastUpdated;
}
