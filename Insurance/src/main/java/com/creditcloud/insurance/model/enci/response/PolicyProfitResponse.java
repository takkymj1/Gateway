/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.insurance.model.enci.response;

import com.creditcloud.insurance.model.enci.BaseDTO;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 *
 * @author chai
 */
@Data
public class PolicyProfitResponse extends BaseDTO{
    
    /**
     * 保单号
     */
    @NotNull
    private String policyNo;
    
    /**
     * 险种代码 CD5
     */
    @NotNull
    private String productCode;
    
    /**
     * 计价日期
     * 
     * yyyy-MM-dd
     */
    @NotNull
    private String valuationDate;
    
    /**
     * 保单价值
     * 以元为单位，六位小数
     */
    @NotNull
    private String policyValue;
    
    /**
     * 累计收益
     * 以元为单位，六位小数
     */
    @NotNull
    private String totalProfit;
    
    /**
     * 昨日收益
     * 以元为单位，六位小数
     */
    private String yesterdayProfit;
    
    /**
     * 保单状态 CD21
     */
    private String policyStatus;
}
