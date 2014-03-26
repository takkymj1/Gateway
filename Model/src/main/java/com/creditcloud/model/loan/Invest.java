/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.user.User;
import com.creditcloud.model.constant.LoanConstant;
import com.creditcloud.model.constant.WealthProductConstant;
import com.creditcloud.model.constraints.IncrementalInteger;
import com.creditcloud.model.enums.loan.BidMethod;
import com.creditcloud.model.enums.loan.InvestStatus;
import com.creditcloud.model.enums.loan.RepaymentMethod;
import com.creditcloud.model.validation.group.WealthProductCheck;
import java.util.Date;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.groups.Default;
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

    @NotNull
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
    @IncrementalInteger.List({
        //validation for loan
        @IncrementalInteger(min = LoanConstant.MIN_INVEST_AMOUNT,
                            increment = LoanConstant.INVEST_AMOUNT_INCREMENT,
                            max = LoanConstant.MAX_INVEST_AMOUNT,
                            groups = Default.class),
        //validation for wealth product
        @IncrementalInteger(min = WealthProductConstant.MIN_INVEST_AMOUNT,
                            increment = WealthProductConstant.INVEST_AMOUNT_INCREMENT,
                            max = WealthProductConstant.MAX_INVEST_AMOUNT,
                            groups = WealthProductCheck.class)
    })
    private int amount;

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
    @Past
    private Date submitTime;

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
        this.amount = amount;
        this.rate = rate;
        this.duration = duration;
        this.repayMethod = repayMethod;
        this.status = status;
        this.submitTime = submitTime;
    }
}
