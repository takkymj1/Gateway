/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.constant.LoanConstant;
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
public class LoanBid extends BaseObject {

    private static final long serialVersionUID = 20141104L;

    @NotNull
    private String loanId;

    /**
     * 贷款募集金额
     */
    @Min(0)
    private int loanAmount;

    /**
     * 可投金额
     */
    @Min(0)
    private int availableAmount;

    /**
     * 已投金额:从三方支付成功返回
     */
    @Min(0)
    private int bidAmount;

    /**
     * 已投标数:从三方支付成功返回
     */
    @Min(0)
    private int bidNumber;

    /**
     * 保留金额:等待三方支付确认返回
     */
    @Min(0)
    private int reserveAmount;

    /**
     * 保留投标数:等待三方支付确认返回
     */
    @Min(0)
    private int reserveNumber;

    /**
     * 投标默认超时时间，单位秒
     */
    private int timeOut;

    public LoanBid(String loanId,
                   int loanAmount,
                   int availableAmount,
                   int bidAmount,
                   int bidNumber,
                   int reserveAmount,
                   int reserveNumber) {
        this.loanId = loanId;
        this.loanAmount = loanAmount;
        this.availableAmount = availableAmount;
        this.bidAmount = bidAmount;
        this.bidNumber = bidNumber;
        this.reserveAmount = reserveAmount;
        this.reserveNumber = reserveNumber;
        this.timeOut = LoanConstant.MAX_BID_TIME_OUT;
    }

    public LoanBid(String loanId, int loanAmount) {
        this(loanId, loanAmount, loanAmount, 0, 0, 0, 0);
    }
}
