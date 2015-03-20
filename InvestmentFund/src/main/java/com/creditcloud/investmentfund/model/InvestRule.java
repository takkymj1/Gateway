/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.model;

import com.creditcloud.investmentfund.constant.FundConstant;
import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import lombok.Data;

/**
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
public class InvestRule extends BaseObject  implements FundConstant {
    private static final long serialVersionUID = 20150317L;

    /**
     * 最小投资额
     */
    @Min(MIN_INVEST_AMOUNT)
    private int minAmount;

    /**
     * 最大投资额
     */
    @Max(MAX_INVEST_AMOUNT)
    private int maxAmount;

    /**
     * 投资金额增量
     */
    @Min(INVEST_AMOUNT_INCREMENT)
    private int stepAmount;

    /**
     * 总的投标金额
     */
    @Max(MAX_INVEST_AMOUNT)
    private int maxTotalAmount;

    /**
     * 投标次数限制
     */
    @Max(MAX_INVEST_TIMES)
    private int maxTimes;

    /**
     * 首次认购最低金额
     */
    private BigDecimal firstMinSubscribingAmount;
    
    /**
     * 首次申购最低金额
     */
    private BigDecimal firstminPurchasingAmount;
    
    /**
     * 定投最低金额
     */
    private BigDecimal minAutoInvestAmount;
    
    /**
     * 最低赎回份额
     */
    private BigDecimal minRedemingShare;
    
    /**
     * 最低基金转换份额
     */
    private BigDecimal minTransferShare;
    
    public InvestRule(int minAmount, int maxAmount, int stepAmount, int maxTotalAmount, int maxTimes) {
        this.minAmount = minAmount;
        this.maxAmount = maxAmount;
        this.stepAmount = stepAmount;
        this.maxTotalAmount = maxTotalAmount;
        this.maxTimes = maxTimes;
    }

    public InvestRule(int minAmount, int maxAmount, int stepAmount, int maxTotalAmount, int maxTimes, BigDecimal firstMinSubscribingAmount, BigDecimal firstminPurchasingAmount, BigDecimal minAutoInvestAmount, BigDecimal minRedemingShare, BigDecimal minTransferShare) {
        this.minAmount = minAmount;
        this.maxAmount = maxAmount;
        this.stepAmount = stepAmount;
        this.maxTotalAmount = maxTotalAmount;
        this.maxTimes = maxTimes;
        this.firstMinSubscribingAmount = firstMinSubscribingAmount;
        this.firstminPurchasingAmount = firstminPurchasingAmount;
        this.minAutoInvestAmount = minAutoInvestAmount;
        this.minRedemingShare = minRedemingShare;
        this.minTransferShare = minTransferShare;
    }
    
    public static boolean valid(InvestRule rule, int amount) {
        if (rule == null) {
            return false;
        }
        return !(amount < rule.getMinAmount()
                || amount > rule.getMaxAmount()
                || (amount - rule.getMinAmount()) % rule.getStepAmount() != 0);
    }
}
