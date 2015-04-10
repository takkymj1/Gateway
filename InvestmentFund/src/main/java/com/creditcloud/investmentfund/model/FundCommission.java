/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.model;

import com.creditcloud.investmentfund.enums.FundBrand;
import com.creditcloud.investmentfund.enums.FundType;
import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 基金佣金
 * 
 * @author xiedingyuan
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FundCommission extends FundObject {

    private String id;
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
     * 基金当日尾随佣金
     */
    private BigDecimal amount;
    
    /**
     * 基金佣金日期
     */
    private Date commissionDate;
   
    
    /**
     * 记录时间
     * 
     * @return
     */
    private Date timeCreated;
    
    /**
     * 记录修改时间
     */
    private Date timeLastUpdated;
}
