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
 * 风险评测响应结果
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@NoArgsConstructor
public class UserRiskAssessmentResponse extends BaseResponse {

    /**
     * 风险评测失效日期
     */
    private String riskdate;
    
    /**
     * 客户风险承受能力
     */
    private String custrisk;
    
    public RiskLevel getRiskLevel() {
        return Enums.getEnumByOrdinal(RiskLevel.class, Integer.valueOf(custrisk) - 1);
    }
}
