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
 * 基金分红
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FundIncomeRecord extends FundObject {

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
     * 拥有该基金份额(元) 两位小数 （非货币型基金有效）
     */
    private BigDecimal share;
    
    /**
     * 客户当日收益 (货币)
     */
    private BigDecimal income;
    
    /**
     * 客户累计收益 （货币）
     */
    private BigDecimal totalIncome;
    
    /**
     * 净值日期
     * 
     * 货币基金： 收益分配日 yyyyMMdd 表明是哪一天的收益数据 例如:周一下发周五,周六,周日三笔记录，对应的收益分配日分别为周五，周六，周日。	否
     * @return
     */
    private Date navDate;
}
