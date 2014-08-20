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
import com.creditcloud.model.enums.loan.RepaymentMethod;
import java.math.BigDecimal;
import java.util.Date;
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

    /**
     * TODO temporal compatibility
     *
     * @param id
     * @param user
     * @param loanId
     * @param bidMethod
     * @param amount
     * @param rate
     * @param duration
     * @param repayMethod
     * @param status
     * @param submitTime
     */
    public Invest(String id,
                  User user,
                  String loanId,
                  BidMethod bidMethod,
                  int amount,
                  int rate,
                  Duration duration,
                  RepaymentMethod repayMethod,
                  InvestStatus status,
                  Date submitTime) {
        this.id = id;
        this.user = user;
        this.loanId = loanId;
        this.bidMethod = bidMethod;
        this.amount = BigDecimal.valueOf(amount);
        this.rate = rate;
        this.duration = duration;
        this.repayMethod = repayMethod;
        this.status = status;
        this.submitTime = submitTime;
    }
}
