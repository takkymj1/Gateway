/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.loan.RepaymentMethod;
import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * user defined product/template for loan(loanrequest)
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
public class LoanProduct extends BaseObject {

    private static final long serialVersionUID = 20141031L;

    private String id;

    private String name;

    private RepaymentMethod repayMethod;

    private int minAmount;

    private int maxAmount;

    private Duration maxDuration;

    private Duration minDuration;

    private int maxRate;

    private int minRate;

    private InvestRule investRule;

    private String description;

    private Date timeCreated;

    private Date timeLastUpdated;

    /**
     * 产品英文名称，类似于Enums的name
     */
    private String productKey;

    //TODO more filed
    public LoanProduct(String id,
                       String name,
                       RepaymentMethod repayMethod,
                       int minAmount,
                       int maxAmount,
                       Duration minDuration,
                       Duration maxDuration,
                       int minRate,
                       int maxRate,
                       InvestRule investRule,
                       String description) {
        this.id = id;
        this.name = name;
        this.repayMethod = repayMethod;
        this.minAmount = minAmount;
        this.maxAmount = maxAmount;
        this.maxRate = maxRate;
        this.minRate = minRate;
        this.maxDuration = maxDuration;
        this.minDuration = minDuration;
        this.investRule = investRule;
        this.description = description;
    }

    public LoanProduct(String id,
                       String name,
                       String key,
                       RepaymentMethod repayMethod,
                       int minAmount,
                       int maxAmount,
                       Duration minDuration,
                       Duration maxDuration,
                       int minRate,
                       int maxRate,
                       InvestRule investRule,
                       String description) {
        this.id = id;
        this.name = name;
        this.repayMethod = repayMethod;
        this.minAmount = minAmount;
        this.maxAmount = maxAmount;
        this.maxRate = maxRate;
        this.minRate = minRate;
        this.maxDuration = maxDuration;
        this.minDuration = minDuration;
        this.investRule = investRule;
        this.description = description;
        this.productKey = key;
    }
}
