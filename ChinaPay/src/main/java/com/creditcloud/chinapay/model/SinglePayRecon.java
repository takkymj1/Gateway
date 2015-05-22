/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.chinapay.model;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 单笔代付对账信息
 * 
 * @author sobranie
 */
@Data
public class SinglePayRecon implements Serializable {
    
    /**
     * 商户号
     */
    private String merId;
    
    /**
     * 商户日期，商户进行交易的日期
     */
    private String merDate;
    
    /**
     * 商户orderId
     */
    private String orderId;
    
    /**
     * ChinaPay收到交易的日期
     */
    private String cpDate;
    
    /**
     * ChinaPay的交易id
     */
    private String cpId;
    
    /**
     * 收款账号（后五位）
     */
    private String beneficiaryAccount;
    
    /**
     * 收款人姓名
     */
    private String beneficiaryName;
    
    /**
     * 金额
     */
    public BigDecimal transAmount;
    
    /**
     * 手续费
     */
    public BigDecimal transFee;
    
    /**
     * 交易状态
     */
    public String status;
    
    /**
     * 退单日期
     */
    public String rejectDate;
    
    /**
     * 重汇日期
     */
    public String rewireDate;
    
    /**
     * 重汇退单日期
     */
    public String rewireRejectDate;
}
