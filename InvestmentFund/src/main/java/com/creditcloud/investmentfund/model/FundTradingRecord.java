/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.model;

import com.creditcloud.investmentfund.enums.FundBrand;
import com.creditcloud.investmentfund.enums.TradingRecordPayStatus;
import com.creditcloud.investmentfund.enums.TradingRecordStatus;
import com.creditcloud.investmentfund.enums.TradingRecordType;
import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 基金交易记录
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FundTradingRecord extends FundObject {

    /**
     * UUID
     */
    private String id;
    
    /**
     * 用户ID
     */
    private String userId;
    
    /**
     * 申请单编号
     */
    private String orderId;
    
    /**
     * 交易申请日期(YYYYMMDD)
     */
    private Date transactionDate;
    
    /**
     * 业务名称
     */
    private TradingRecordType type;
    
    /**
     * 基金代码
     */
    private String fundCode;
    
    /**
     * 基金名称
     */
    private String fundName;
    
    /**
     * 申请金额(元)
     */
    private BigDecimal amount;
    
    /**
     * 申请份额
     */
    private BigDecimal share;
    
    /**
     * 处理状态
     */
    private TradingRecordStatus status;
    
    /**
     * 支付状态
     */
    private TradingRecordPayStatus payStatus;
    
    /**
     * 银行卡号
     */
    private String bankAccount;
    
    /**
     * 操作日期
     */
    private Date operationTime;
    
    /**
     * 基金品牌
     */
    private FundBrand fundBrand;
}
