/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 对贷款的投资统计,不区分自动和手动投标<p>
 * 注意只统计贷款对应信息，不包括理财
 *
 * @author rooseek
 *
 * @see LoanStatistics
 * @see Invest
 */
@XmlRootElement
public class LoanInvestStatistics extends BaseObject {

    private static final long serialVersionUID = 20131017L;

    /**
     * 投资人uuid
     */
    private String userId;

    /**
     * 总的投标数
     */
    private int biddedInvests;

    /**
     * 成功且已结算的投标数
     */
    private int settledInvests;

    /**
     * 已还清的
     */
    private int clearedInvests;

    /**
     * 逾期投资数
     */
    private int overdueInvests;

    /**
     * 违约投资数
     */
    private int breachInvests;

    /**
     * 总的结算过的投资额，满标没有结算地不在统计之列
     */
    private long totalAmount;

    /**
     * 待还款总金额
     */
    private RepayAmount dueAmount;

    /**
     * 逾期和违约的贷款总额
     */
    private RepayAmount overdueAmount;

    public LoanInvestStatistics() {
    }

    public LoanInvestStatistics(String userId,
                                int biddedInvests,
                                int settledInvests,
                                int clearedInvests,
                                int overdueInvests,
                                int breachInvests,
                                long totalAmount,
                                RepayAmount dueAmount,
                                RepayAmount overdueAmount) {
        this.userId = userId;
        this.biddedInvests = biddedInvests;
        this.settledInvests = settledInvests;
        this.clearedInvests = clearedInvests;
        this.overdueInvests = overdueInvests;
        this.breachInvests = breachInvests;
        this.totalAmount = totalAmount;
        this.dueAmount = dueAmount;
        this.overdueAmount = overdueAmount;
    }

    public String getUserId() {
        return userId;
    }

    public int getBiddedInvests() {
        return biddedInvests;
    }

    public int getSettledInvests() {
        return settledInvests;
    }

    public int getClearedInvests() {
        return clearedInvests;
    }

    public int getOverdueInvests() {
        return overdueInvests;
    }

    public long getTotalAmount() {
        return totalAmount;
    }

    public RepayAmount getDueAmount() {
        return dueAmount;
    }

    public RepayAmount getOverdueAmount() {
        return overdueAmount;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setBiddedInvests(int biddedInvests) {
        this.biddedInvests = biddedInvests;
    }

    public void setSettledInvests(int settledInvests) {
        this.settledInvests = settledInvests;
    }

    public void setClearedInvests(int clearedInvests) {
        this.clearedInvests = clearedInvests;
    }

    public void setOverdueInvests(int overdueInvests) {
        this.overdueInvests = overdueInvests;
    }

    public void setTotalAmount(long totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setDueAmount(RepayAmount dueAmount) {
        this.dueAmount = dueAmount;
    }

    public void setOverdueAmount(RepayAmount overdueAmount) {
        this.overdueAmount = overdueAmount;
    }

    public void setBreachInvests(int breachInvests) {
        this.breachInvests = breachInvests;
    }

    public int getBreachInvests() {
        return breachInvests;
    }
}
