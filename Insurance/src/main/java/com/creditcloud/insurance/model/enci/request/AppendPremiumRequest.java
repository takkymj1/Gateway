/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.insurance.model.enci.request;

import com.creditcloud.insurance.model.enci.BaseDTO;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author chai
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppendPremiumRequest extends BaseDTO{
    
    /**
     * 合作商订单号
     */
    @NotNull
    private String partnerOrderId;
    
    /**
     * 保单号
     */
    @NotNull
    private String policyNo;
    
    /**
     * 支付交易编号
     */
    private String payTransNo;
    
    /**
     * 第三方支付对账用单号
     */
    private String checkPayNo;
    
    /**
     * 支付时间
     * yyyy-MM-dd HH:mm:ss
     */
    @NotNull
    private String payTime;
    
    /**
     * 支付金额
     * 以元为单位，两位小数
     */
    private String payAmount;
    
    /**
     * 账务日期
     * yyyy-MM-dd
     */
    private String accountDate;
    
    /**
     * 付款人账号
     */
    private String payerAccount;
    
    /**
     * 付款人ID
     */
    private String payerId;
    
    /**
     * 支付平台 CD21
     */
    private String payPlatform;
    
    /**
     * 银行编号 CD3
     */
    private String bankCode;
    
    /**
     * 开户行名称
     */
    private String bankName;
    
    /**
     * 银行卡号
     */
    private String bankCardNo;
    
    /**
     * 持卡人姓名
     */
    private String holderName;
}
