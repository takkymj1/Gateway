/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.model.lion.moneyfund.response;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@NoArgsConstructor
public class SubscriptionResponseMessage extends ResponseMessageBase {

    /**
     * 预计确认工作日 yyyyMMdd
     */
    private String confirmWorkDay;
    
    /**
     * 基金代码
     */
    private String fundCode;
    
    /**
     * 基金的交易日期 <br>
     * 格式为：YYYYMMDD <br>
     * 非撤销交易不可为空。 <br>
     * 国庆前一天晚上发生的交易，其交易所属日期是国庆后第一个交易日 <br>
     */
    private String transactionDate;
    
    /**
     * 购买金额 两位小数
     */
    private String amount;
    
    /**
     * 基金公司订单落地时间 <br>
     * 格式为：YYYYMMDDHHmmSS <br>
     */
    private String transactionTime;
    
    /**
     * 交易账户
     */
    private String tradeacco;
    
    /**
     * 诺安交易申请流水号 <br>
     * 
     * 同一销售机构不能重复；交易失败时为空 <br>
     */
    private String naApplicationNo;
    
    /**
     * 业务类型编号
     */
    private String transName;

}
