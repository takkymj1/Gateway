/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.model;

import com.creditcloud.investmentfund.enums.FundBrand;
import com.creditcloud.investmentfund.enums.FundType;
import com.creditcloud.investmentfund.enums.TradingRecordPayStatus;
import com.creditcloud.investmentfund.enums.TradingRecordResult;
import com.creditcloud.investmentfund.enums.TradingRecordStatus;
import com.creditcloud.investmentfund.enums.TradingRecordType;
import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 基金交易记录
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@EqualsAndHashCode(callSuper = true)
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
     * 关联订单号（确认申请单编号）
     */
    private String parentOrderId;
    
    /**
     * 交易申请日期或者交易确认日期(YYYYMMDD)
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
     * 申请或确认金额(元)
     */
    private BigDecimal amount;
    
    /**
     * 申请活确认份额
     */
    private BigDecimal share;
    
    /**
     * 手续费
     */
    private BigDecimal procedureFee;
    
    /**
     * 处理状态
     */
    private TradingRecordStatus status;
    
    /**
     * 支付状态
     */
    private TradingRecordPayStatus payStatus;
    
    /**
     * 操作日期
     */
    private Date operationTime;
    
    /**
     * 备注
     */
    private String remark;
    
    /**
     * 交易结果
     */
    private TradingRecordResult result;
    
    /**
     * 基金品牌
     */
    private FundBrand fundBrand;
    
    /**
     * 基金类型
     */
    private FundType fundType;
    
    /**
     * 额外的附属信息
     */
    private String priv;
    
}
