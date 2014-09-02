/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.loan.RepaymentStatus;
import com.creditcloud.model.misc.RealmEntity;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

/**
 * 投资成功后对应的每期回款
 *
 * @author rooseek
 */
public class InvestRepayment extends BaseObject {

    private static final long serialVersionUID = 20130918L;

    @NotNull
    @Getter
    private final String id;

    @NotNull
    @Getter
    private final Invest invest;

    //当前回款期数
    @NotNull
    @Getter
    private final int currentPeriod;

    //当期回款
    @NotNull
    @Getter
    private final Repayment repayment;

    //回款状态
    @NotNull
    @Getter
    private final RepaymentStatus status;

    //实际回款
    @Getter
    private final BigDecimal repayAmount;

    //实际回款日期
    @Getter
    private final Date repayDate;

    /**
     * 还款来源，实际还款人，如果为null则为loan中借款人，还可以为平台或者担保公司等
     */
    @Getter
    private final RealmEntity repaySource;

    /**
     * 相对期数,例如对于债券转让的还款,原始期数为12期，从第5期承接转让，那么currentPeriod为5-12，relativePeiod为1-8
     */
    @Setter
    @Getter
    private int relativePeriod;
    
    @Getter
    @Setter
    //TODO replace with <FundRecordType, BigDecimal>
    private HashMap<String, BigDecimal> feeDetail;

    public InvestRepayment(String id,
                           Invest invest,
                           int currentPeriod,
                           Repayment repayment,
                           RepaymentStatus status,
                           BigDecimal repayAmount,
                           Date repayDate,
                           RealmEntity repaySource) {
        this.id = id;
        this.invest = invest;
        this.currentPeriod = currentPeriod;
        this.repayment = repayment;
        this.status = status;
        this.repayAmount = repayAmount;
        this.repayDate = repayDate;
        this.repaySource = repaySource;
    }
}
