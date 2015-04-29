/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.fund.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * 现金流统计.
 * 
 * 给定一个时间段，统计用户、平台，充值、提现所造成的资金总量变化
 * 
 * 主要用于pool版本的资金对账
 * 
 * @author sobranie
 */
@Data
public class CashFlowStat implements Serializable {
    
    /**
     * 现金统计的时间起点，include
     */
    @NotNull
    private Date timeBegin;
    
    /**
     * 现金统计的时间终点，exclude
     */
    @NotNull
    private Date timeEnd;
    
    /**
     * 用户总充值量
     */
    @Min(0)
    private BigDecimal userDeposit = BigDecimal.ZERO;
    
    /**
     * 用户总提现量
     */
    @Min(0)
    private BigDecimal userWithdraw = BigDecimal.ZERO;

    /**
     * 平台总充值量
     */
    @Min(0)
    private BigDecimal clientDeposit = BigDecimal.ZERO;
    
    /**
     * 平台总提现量
     */
    @Min(0)
    private BigDecimal clientWithdraw = BigDecimal.ZERO;
    
}
