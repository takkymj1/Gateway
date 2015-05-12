/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.user.User;
import com.creditcloud.model.constant.LoanConstant;
import com.creditcloud.model.enums.loan.BidMethod;
import com.creditcloud.model.enums.loan.InvestStatus;
import com.creditcloud.model.enums.loan.LoanPurpose;
import com.creditcloud.model.enums.loan.RepaymentMethod;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
public class Invest extends BaseObject {

    private static final long serialVersionUID = 20130918L;

    private String id;

    /**
     * 个人用户
     */
    private User user;

    private String userId;

    @NotNull
    private String loanId;

    @NotNull
    private BidMethod bidMethod;

    @NotNull
    private BigDecimal amount;

    @NotNull
    @Min(LoanConstant.MIN_LOAN_RATE)
    @Max(LoanConstant.MAX_LOAN_RATE)
    private int rate;

    @NotNull
    private Duration duration;

    @NotNull
    private RepaymentMethod repayMethod;

    @NotNull
    private InvestStatus status;

    @NotNull
    private Date submitTime;

    /**
     * 对应债权转让id，如果非空表示此Invest是对某债权转让的投标,为空表示正常投标
     */
    private String creditAssignId;

    /**
     * 原始投标金额
     */
    private BigDecimal originalAmount;

    private LoanPurpose purpose;

    public Invest(String id,
                  User user,
                  String loanId,
                  BidMethod bidMethod,
                  BigDecimal amount,
                  int rate,
                  Duration duration,
                  RepaymentMethod repayMethod,
                  InvestStatus status,
                  Date submitTime) {
        this.id = id;
        this.user = user;
        this.loanId = loanId;
        this.bidMethod = bidMethod;
        this.amount = amount;
        this.rate = rate;
        this.duration = duration;
        this.repayMethod = repayMethod;
        this.status = status;
        this.submitTime = submitTime;
    }

    //for api
    public Invest(String id,
                  String userId,
                  String loanId,
                  BidMethod bidMethod,
                  BigDecimal amount,
                  int rate,
                  Duration duration,
                  RepaymentMethod repayMethod,
                  InvestStatus status,
                  Date submitTime,
                  LoanPurpose purpose) {
        this.id = id;
        this.userId = userId;
        this.loanId = loanId;
        this.bidMethod = bidMethod;
        this.amount = amount;
        this.rate = rate;
        this.duration = duration;
        this.repayMethod = repayMethod;
        this.status = status;
        this.submitTime = submitTime;
        this.purpose = purpose;
    }

    public String getUserId() {
        if (userId != null) {
            return userId;
        }

        return user == null ? null : user.getId();
    }

    /**
     * 原始本金是否被转让过
     *
     * @return
     */
    public boolean hasBeenCreditAssigned() {
        return originalAmount != null;
    }

    public boolean isLoanInvest() {
        return creditAssignId == null;
    }

    public boolean isAssignInvest() {
        return !isLoanInvest();
    }

    /**
     * 原始投标金额:此投标对应的原始投标金额，对象可能是Loan或者CreditAssign，不管是否有本金转让出去
     *
     * @return
     */
    public BigDecimal getInvestAmount() {
        return originalAmount == null ? amount : originalAmount;
    }

}
