/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.entities.embedded;

import com.creditcloud.common.entities.BaseEntity;
import com.creditcloud.model.constant.LoanConstant;
import javax.persistence.Embeddable;
import javax.persistence.Transient;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.ws.rs.FormParam;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 投资的额度限制
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@Embeddable
public class InvestRule extends BaseEntity {

    private static final long serialVersionUID = 20140102L;

    /**
     * 最小投资额
     */
    @Min(LoanConstant.MIN_INVEST_AMOUNT)
    private int minAmount;

    /**
     * 最大投资额
     */
    @Max(LoanConstant.MAX_INVEST_AMOUNT)
    private int maxAmount;

    /**
     * 投资金额增量
     */
    @Min(LoanConstant.INVEST_AMOUNT_INCREMENT)
    private int stepAmount;

    /**
     * 总的投标金额
     */
    @Transient
    @Max(LoanConstant.MAX_INVEST_AMOUNT)
    private int maxTotalAmount = LoanConstant.MAX_INVEST_AMOUNT;

    /**
     * 投标次数限制
     */
    @Transient
    @Max(LoanConstant.MAX_INVEST_AMOUNT)
    private int maxTimes = LoanConstant.MAX_INVEST_AMOUNT;

    public InvestRule(int minAmount, int maxAmount, int stepAmount, int maxTotalAmount, int maxTimes) {
        this.minAmount = minAmount;
        this.maxAmount = maxAmount;
        this.stepAmount = stepAmount;
        this.maxTotalAmount = maxTotalAmount;
        this.maxTimes = maxTimes;
    }
}
