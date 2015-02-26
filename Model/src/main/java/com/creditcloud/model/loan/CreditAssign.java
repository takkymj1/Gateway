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
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 投资人发布的债权转让
 *
 * @author rooseek
 */
@Data
@EqualsAndHashCode(callSuper=false)
@NoArgsConstructor
@XmlRootElement
public class CreditAssign extends BaseObject {

    private static final long serialVersionUID = 20140811L;

    private String id;

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
     * 转让标题
     */
    private String title;
    
    /**
     * 剩余期限
     */
    private int leftMonths;
    
    /**
     * 实际已投债权金额
     */
    private BigDecimal bidDealAmount;
    
    /**
     * 平台服务费率
     */
    private BigDecimal platformServiceRate;
    
    /**
     * 当期应收利息
     */
    private BigDecimal currentPeriodInterest;

    /**
     * 该债权对应的未还还款
     */
    @Deprecated
    private List<Repayment> repayment;

    public CreditAssign(String id,
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
                        Date timeFinished,
                        String title,
                        int leftMonths,
                        BigDecimal bidDealAmount,
                        BigDecimal platformServiceRate,
                        BigDecimal currentPeriodInterest) {
        this.id = id;
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
        this.title = title;
        this.leftMonths = leftMonths;
        this.bidDealAmount = bidDealAmount;
        this.platformServiceRate = platformServiceRate;
        this.currentPeriodInterest = currentPeriodInterest;
    }

    /**
     * 可投余额
     *
     * @return
     */
    public BigDecimal getBalance() {
        return creditAmount != null ? creditAmount.subtract(bidAmount) : BigDecimal.ZERO;
    }
    
    /**
     * 剩余可投债权金额
     * @return 
     */
    public BigDecimal getLeftCreditDealAmount() {
        if (bidDealAmount == null) {
            bidDealAmount = BigDecimal.ZERO;
        }
        return creditDealAmount != null ? creditDealAmount.subtract(bidDealAmount) : BigDecimal.ZERO;
    }
}
