/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.loan.CreditAssignStatus;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 投资人发布的债权转让
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@XmlRootElement
public class CreditAssign extends BaseObject {

    private static final long serialVersionUID = 20140811L;

    private String id;

    private String title;

    /**
     * 对应借款id
     */
    private String loanId;

    /**
     * 原始借款投标id
     */
    private String investId;

    /**
     * 转让人
     */
    private String userId;

    /**
     * 债权转让转出的本金
     */
    private BigDecimal creditAmount;

    /**
     * 投标数
     */
    private int bidNumber;

    /**
     * 实际投标金额
     */
    private BigDecimal bidAmount;

    private CreditAssignStatus status;

    /**
     * 债权转让折价率
     */
    private BigDecimal creditDealRate;

    /**
     * 债权转让标价
     */
    private BigDecimal creditDealAmount;

    private Date timeOpen;

    /**
     * 承接期，单位小时
     */
    private int timeOut;

    private Date timeFinished;

    /**
     * 该债权对应的未还还款
     */
    @Deprecated
    private List<Repayment> repayment;

    public CreditAssign(String id,
                        String title,
                        String loanId,
                        String investId,
                        String userId,
                        BigDecimal creditAmount,
                        int bidNumber,
                        BigDecimal bidAmount,
                        CreditAssignStatus status,
                        BigDecimal creditDealRate,
                        BigDecimal creditDealAmount,
                        Date timeOpen,
                        int timeOut,
                        Date timeFinished) {
        this.id = id;
        this.title = title;
        this.loanId = loanId;
        this.investId = investId;
        this.userId = userId;
        this.creditAmount = creditAmount;
        this.bidNumber = bidNumber;
        this.bidAmount = bidAmount;
        this.status = status;
        this.creditDealRate = creditDealRate;
        this.creditDealAmount = creditDealAmount;
        this.timeOpen = timeOpen;
        this.timeOut = timeOut;
        this.timeFinished = timeFinished;
    }

    /**
     * 可投余额
     *
     * @return
     */
    public BigDecimal getBalance() {
        return creditAmount.subtract(bidAmount);
    }
}
