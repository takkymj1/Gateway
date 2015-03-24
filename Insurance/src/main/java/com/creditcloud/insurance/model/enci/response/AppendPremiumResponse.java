/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.insurance.model.enci.response;

import com.creditcloud.insurance.model.enci.BaseDTO;
import java.math.BigDecimal;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * 
 * @author chai
 */
@Data
public class AppendPremiumResponse extends BaseDTO{
    
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
     * 投保单号
     */
    @NotNull
    private String proposalNo;
    
    /**
     * 电子保单URL
     */
    @NotNull
    private String policyUrl;
    
    /**
     * 总保费
     */
    @NotNull
    private BigDecimal totalPremium;
    
    /**
     * 追加保费
     */
    @NotNull
    private BigDecimal totalRaise;
    
    /**
     * 账务日期
     */
    @NotNull
    private String accountDate;
    
    /**
     * 保全时间
     */
    @NotNull
    private String issuedTime;
    
    /**
     * 保全是否成功
     */
    @NotNull
    private int isSuccess;
    
    /**
     * 保全结果说明
     */
    private String message;
}
