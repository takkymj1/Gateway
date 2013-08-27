/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model;

import com.creditcloud.model.constant.LoanConstant;
import com.creditcloud.model.enums.loan.RepaymentMethod;
import com.creditcloud.model.enums.user.CreditRank;
import com.creditcloud.model.misc.Range;
import java.util.Date;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * 自动投标
 *
 * @author rooseek
 */
public class UserAutoBid extends BaseObject {

    @Id
    private String userId;

    @NotNull
    private UserFund fund;

    /**
     * 是否激活
     */
    @NotNull
    private boolean active;

    /**
     * 单次投标金额,最低50
     */
    @Min(LoanConstant.MIN_AUTO_BID_SINGLE_AMOUNT)
    @NotNull
    private int singleAmount;

    /**
     * 账户保留余额
     */
    @Min(0)
    @NotNull
    private int reservedAmount;

    /**
     * 贷款还款方式
     */
    @NotNull
    private RepaymentMethod repayMethod;

    /**
     * 贷款期限范围,单位月
     */
    @NotNull
    @Valid
    private Range<Integer> durationRange;

    /**
     * 贷款利率范围,[1000-2000]等同于利率[10%-20%]
     */
    @NotNull
    @Valid
    private Range<Integer> rateRange;

    /**
     * 贷款信用等级范围
     */
    @NotNull
    @Valid
    private Range<CreditRank> creditRankRange;

    /**
     * true必须有抵押,false可以没有抵押
     */
    @NotNull
    private boolean mortgaged;

    /**
     * 投标工具最近一次开启时间
     */
    private Date activedTime;
    
    
    private Date lastBidTime;

    public UserAutoBid() {
    }

    public UserAutoBid(String userId,
                       UserFund fund,
                       boolean active,
                       int singleAmount,
                       int reservedAmount,
                       RepaymentMethod repayMethod,
                       Range<Integer> durationRange,
                       Range<Integer> rateRange,
                       Range<CreditRank> creditRankRange,
                       boolean mortgaged,
                       Date activedTime,
                       Date lastBidTime) {
        this.userId = userId;
        this.fund = fund;
        this.active = active;
        this.singleAmount = singleAmount;
        this.reservedAmount = reservedAmount;
        this.repayMethod = repayMethod;
        this.durationRange = durationRange;
        this.rateRange = rateRange;
        this.creditRankRange = creditRankRange;
        this.mortgaged = mortgaged;
        this.activedTime = activedTime;
    }

    public String getUserId() {
        return userId;
    }

    public boolean isActive() {
        return active;
    }

    public int getSingleAmount() {
        return singleAmount;
    }

    public void setReservedAmount(int reservedAmount) {
        this.reservedAmount = reservedAmount;
    }

    public int getReservedAmount() {
        return reservedAmount;
    }

    public RepaymentMethod getRepayMethod() {
        return repayMethod;
    }

    public Range<Integer> getDurationRange() {
        return durationRange;
    }

    public Range<Integer> getRateRange() {
        return rateRange;
    }

    public Range<CreditRank> getCreditRankRange() {
        return creditRankRange;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setFund(UserFund fund) {
        this.fund = fund;
    }

    public UserFund getFund() {
        return fund;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setSingleAmount(int singleAmount) {
        this.singleAmount = singleAmount;
    }

    public void setRepayMethod(RepaymentMethod repayMethod) {
        this.repayMethod = repayMethod;
    }

    public void setDurationRange(Range<Integer> durationRange) {
        this.durationRange = durationRange;
    }

    public void setRateRange(Range<Integer> rateRange) {
        this.rateRange = rateRange;
    }

    public void setCreditRankRange(Range<CreditRank> creditRankRange) {
        this.creditRankRange = creditRankRange;
    }

    public Date getActivedTime() {
        return activedTime;
    }

    public void setActivedTime(Date activedTime) {
        this.activedTime = activedTime;
    }

    public boolean isMortgaged() {
        return mortgaged;
    }

    public void setMortgaged(boolean mortgaged) {
        this.mortgaged = mortgaged;
    }

    public Date getLastBidTime() {
        return lastBidTime;
    }

    public void setLastBidTime(Date lastBidTime) {
        this.lastBidTime = lastBidTime;
    }
}
