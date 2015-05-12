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
import java.util.Map;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 投资成功后对应的每期回款
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
public class InvestRepayment extends BaseObject {

    private static final long serialVersionUID = 20130918L;

    @NotNull
    private String id;

    @NotNull
    private Invest invest;

    private String investId;

    //当前回款期数
    @NotNull
    private int currentPeriod;

    //当期回款
    @NotNull
    private Repayment repayment;

    //回款状态
    @NotNull
    private RepaymentStatus status;

    //实际回款
    private BigDecimal repayAmount;

    //实际回款日期
    private Date repayDate;

    /**
     * 还款/垫付来源，实际还款/垫付人，默认为null不填写，与对应LoanRepayment中repaySource一致</p>
     * 只有同一还款来源不同时才需要填写，系统暂不支持此种还款/垫付
     */
    private RealmEntity repaySource;

    /**
     * 相对期数,例如对于债券转让的还款,原始期数为12期，从第5期承接转让，那么currentPeriod为5-12，relativePeiod为1-8
     */
    private int relativePeriod;

    //TODO replace with <FundRecordType, BigDecimal>
    private Map<String, BigDecimal> feeDetail;

    private boolean izPreRepayment;

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

    public String getInvestId() {
        if (investId != null) {
            return investId;
        }

        return invest == null ? null : invest.getId();
    }
}
