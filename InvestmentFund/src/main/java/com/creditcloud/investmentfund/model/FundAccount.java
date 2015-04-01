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
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 基金账户
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FundAccount extends FundObject implements FundConstant {

    /**
     * 用户ID
     * 
     * @return
     */
    @NotNull
    private String userId;
    
    /**
     * 客户号
     * 
     * @return
     */
    @NotNull
    private String custno;
    
    /**
     * 交易账号
     * 
     * @return
     */
    @NotNull
    private String transactionaccountid;
    
    /**
     * 资金账号
     * 
     * @return
     */
    @NotNull
    private String moneyaccount;
    
    /**
     * 客户风险承受能力
     * 
     * @return
     */
    @NotNull
    private RiskLevel riskLevel;
    
    /**
     * 接入商类型
     * 
     * @return
     */
    @NotNull
    private FundBrand brand;

    /**
     * 基金账号类型
     * 
     * @return
     */
    @NotNull
    private FundType type;
    
    /**
     * 订单号
     * 
     * @return
     */
    private String orderId;
}
