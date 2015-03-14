/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.model.lion.response;

import com.creditcloud.investmentfund.enums.RiskLevel;
import com.creditcloud.model.util.Enums;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 基金账户创建返回结果
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@NoArgsConstructor
public class UserRegisterResponse extends BaseResponse {

    /**
     * 申请单编号
     */
    private String appsheetserialno;
    
    /**
     * 交易账号
     */
    private String transactionaccountid;
    
    /**
     * 资金账号
     */
    private String moneyaccount;
    
    /**
     * 客户号
     */
    private String custno;
    
    /**
     * 客户风险承受能力
     */
    private String custrisk;

    /**
     * 风险评测失效日期
     */
    private String riskdate;
    
    public RiskLevel getRiskLevel() {
        return Enums.getEnumByOrdinal(RiskLevel.class, Integer.valueOf(custrisk) - 1);
    }
}
