/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.model.lion.moneyfund.response;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 同步开户和绑卡
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@NoArgsConstructor
public class OpenAccountAndBindCardResponseMessage extends ResponseMessageBase {

    /**
     * 交易发生时间
     * 
     * 基金公司订单落地时间 格式为：YYYYMMDDHHmmSS
     */
    private String transactionTime; 
    
    /**
     * 诺安交易账户
     * 
     * “非同卡进出”：对于非同卡进出模式，诺安基金会在该“交易账号”下为客户新增一张银行卡；
     * “同卡进出模式”：对于同卡进出模式，诺安基金会为该客户增开“一个交易账号”。
     */
    private String tradeacco; 
    
    /**
     * 诺安交易申请流水号
     */
    private String naApplicationNo;
    
    /**
     * 交易所属日期
     * 
     * 格式为：YYYYMMDD
     * 非冲正交易不可为空。
     * 工作日
     * 
     */
    private String transactionDate;
    
}
