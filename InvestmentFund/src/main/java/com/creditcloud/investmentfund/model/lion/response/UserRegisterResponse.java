/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.model.lion.response;

import com.creditcloud.investmentfund.api.lion.moneyfund.utils.StringUtils;
import com.creditcloud.investmentfund.enums.RiskLevel;
import com.creditcloud.model.util.Enums;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 基金账户创建返回结果
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper=true)
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
    
    
    public static RiskLevel getRiskLevel(UserRegisterResponse response) {
        if (StringUtils.isEmpty(response.getCustrisk())) return null;
        return Enums.getEnumByOrdinal(RiskLevel.class, Integer.valueOf(response.getCustrisk()) - 1);
    }
}
