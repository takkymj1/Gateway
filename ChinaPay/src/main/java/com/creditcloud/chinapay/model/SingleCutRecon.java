/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.chinapay.model;

import com.creditcloud.chinapay.enums.OpenBankId;
import com.creditcloud.chinapay.enums.SingleCutStatCode;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 单笔代扣对账记录.
 * 
 * 代扣对账文件中的一行
 * 
 * @author sobranie
 */
@Data
public class SingleCutRecon implements Serializable {
    
    /**
     * 银行
     */
    private OpenBankId openBankId;
    
    /**
     * 交易日期.
     * 
     * yyyyMMdd格式
     */
    private String transDate;
    
    /**
     * 交易订单号
     */
    private String orderNo;
    
    /**
     * 交易状态
     */
    private SingleCutStatCode transStat;
    
    /**
     * 银行返回码
     */
    private String bkRespCode;
    
    /**
     * 卡类型
     */
    private String cardType;
    
    /**
     * 卡号
     */
    private String cardNo;
    
    /**
     * 代扣金额.
     * 
     * 2位小数的元
     */
    private BigDecimal transAmt;
    
    /**
     * 用途
     */
    private String purpose;
    
    /**
     * 私有域
     */
    private String priv1;
}
