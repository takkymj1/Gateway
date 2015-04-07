/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.model;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 基金投资统计
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@AllArgsConstructor
public class FundInvestStatistics {

    /**
     * 投资总额
     */
    private BigDecimal totalAmount;
    
    /**
     * 累计收益
     */
    private BigDecimal totalIncome;
 
    /**
     * 昨日收益
     */
    private BigDecimal yesterdayIncome;
}
