/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.constant.LoanConstant;
import javax.persistence.Embeddable;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import lombok.Data;

/**
 * 投资的额度限制
 *
 * @author rooseek
 */
@Data
@Embeddable
public class InvestRule extends BaseObject {

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

    public InvestRule() {
    }

    public InvestRule(int minAmount, int maxAmount, int stepAmount) {
        this.minAmount = minAmount;
        this.maxAmount = maxAmount;
        this.stepAmount = stepAmount;
    }
}
