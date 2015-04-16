/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.constant.LoanConstant;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 投资的额度限制
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@XmlRootElement
public class InvestRule extends BaseObject {

    private static final long serialVersionUID = 20140102L;

    /**
     * 最小投资额
     */
    @FormParam("minAmount")
    @Min(LoanConstant.MIN_INVEST_AMOUNT)
    private int minAmount;

    /**
     * 最大投资额
     */
    @FormParam("maxAmount")
    @Max(LoanConstant.MAX_INVEST_AMOUNT)
    private int maxAmount;

    /**
     * 投资金额增量
     */
    @FormParam("stepAmount")
    @Min(LoanConstant.INVEST_AMOUNT_INCREMENT)
    private int stepAmount;

    /**
     * 总的投标金额
     */
    @FormParam("maxTotalAmount")
    @Max(LoanConstant.MAX_INVEST_AMOUNT)
    private int maxTotalAmount = LoanConstant.MAX_INVEST_AMOUNT;

    /**
     * 投标次数限制
     */
    @FormParam("maxTimes")
    @Max(LoanConstant.MAX_INVEST_AMOUNT)
    private int maxTimes = LoanConstant.MAX_INVEST_AMOUNT;
    
    /**
     * quick constructor.
     * 
     * Only mandatory fields
     * 
     * @param minAmount
     * @param maxAmount
     * @param stepAmount 
     */
    public InvestRule(int minAmount, int maxAmount, int stepAmount) {
        this.minAmount = minAmount;
        this.maxAmount = maxAmount;
        this.stepAmount = stepAmount;
    }

    public InvestRule(int minAmount, int maxAmount, int stepAmount, int maxTotalAmount, int maxTimes) {
        this.minAmount = minAmount;
        this.maxAmount = maxAmount;
        this.stepAmount = stepAmount;
        this.maxTotalAmount = maxTotalAmount;
        this.maxTimes = maxTimes;
    }

    public static boolean valid(InvestRule rule, int amount) {
        if (rule == null) {
            return false;
        }

        return amount >= rule.getMinAmount() && amount <= rule.getMaxAmount() && (amount - rule.getMinAmount()) % rule.getStepAmount() == 0;
    }

    /**
     * 根据InvestRule规范化投标金额.
     *
     * 所有不合法的投标金额都会规范化为0.
     *
     * @param amount     意愿投标金额，表示最大的意愿投资额
     * @param investRule
     * @return
     */
    public static int normalize(InvestRule investRule, final int amount) {
        if (investRule != null) {
            if (amount < investRule.getMinAmount()) {
                return 0;
            }
            if (amount > investRule.getMaxAmount()) {
                return investRule.getMaxAmount();
            }
            return amount - (amount - investRule.getMinAmount()) % investRule.getStepAmount();
        }
        return amount > 0 ? amount : 0;
    }
    
    public static boolean isEmpty(InvestRule investRule){
        return investRule.getMaxAmount() == 0
                && investRule.getMaxTimes() == 0
                && investRule.getMaxTotalAmount() == 0
                && investRule.getMinAmount() == 0
                && investRule.getStepAmount() == 0;
    }
}
