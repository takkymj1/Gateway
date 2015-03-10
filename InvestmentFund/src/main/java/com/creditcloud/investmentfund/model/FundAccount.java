/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.model;

import com.creditcloud.investmentfund.constant.FundConstant;
import com.creditcloud.investmentfund.enums.FundBrand;
import com.creditcloud.investmentfund.enums.RiskLevel;
import com.creditcloud.investmentfund.enums.FundType;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 基金账户
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@NoArgsConstructor
public class FundAccount extends FundObject implements FundConstant {

    /**
     * 用户ID
     */
    @NotNull
    private String userId;
    
    /**
     * 客户号
     */
    @NotNull
    public String custno;
    
    /**
     * 交易账号
     */
    @NotNull
    public String transactionaccountid;
    
    /**
     * 资金账号
     */
    @NotNull
    public String moneyaccount;
    
    /**
     * 客户风险承受能力
     */
    @NotNull
    public RiskLevel riskLevel;
    
    /**
     * 接入商类型
     */
    @NotNull
    public FundBrand brand;

    /**
     * 基金账号类型
     */
    @NotNull
    public FundType type;
}
