/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.model.lion.moneyfund.response;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 货币基金赎回操作
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@NoArgsConstructor
public class RedemptionResponseMessage extends ResponseMessageBase {

    /**
     * 基金可以用总份额
     */
    private String availableVol;
 
    /**
     * 交易所属日期
     * 
     * 国庆前一天晚上发生的交易，其交易所属日期是国庆后 <br>
     * 第一个交易日此交易归属日期为基金公司交易归属日期，<br>
     * 在实时交易时由基金公司系统返回 <br>
     */
    private String transactionDate;
    
    /**
     * 交易发生时间
     * 
     * 此字段为实时交易时，由基金公司系统返回 <br>
     */
    private String transactionTime;
    
    /**
     * 用户当前总份额
     */
    private String totalVol;
    
    /**
     * 用户当前冻结份额
     */
    private String frozenVol;
    
    /**
     * 诺安交易申请流水号 <br>
     * 
     * 同一销售机构不能重复；交易失败时为空 <br>
     */
    private String naApplicationNo;
    
    /**
     * 预计到账时间 <br>
     * 
     * 普通赎回预计到账日期，申请工作日+1工作日 <br>
     */
    private String receiveMoneyTime;
    
    /**
     * 交易确认日期
     * 
     * 格式为：yyyyMMdd
     * 如果交易没有确认，给出预计确认日期
     */
    private String preTransactionCfmDate;
    
}
