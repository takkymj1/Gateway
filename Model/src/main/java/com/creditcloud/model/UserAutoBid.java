/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model;

import com.creditcloud.model.enums.loan.RepaymentMethod;
import com.creditcloud.model.misc.AutoBidRange;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.persistence.Id;
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

    /**
     * 用户总的资金账户
     */
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
    private Collection<RepaymentMethod> repayMethod;


    @NotNull
    private AutoBidRange range;
    
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
                       Collection<RepaymentMethod> repayMethod,
                       AutoBidRange range,
                       boolean mortgaged,
                       Date activedTime,
                       Date lastBidTime) {
        this.userId = userId;
        this.fund = fund;
        this.active = active;
        this.singleAmount = singleAmount;
        this.reservedAmount = reservedAmount;
        this.repayMethod = repayMethod;
        this.mortgaged = mortgaged;
        this.activedTime = activedTime;
        this.range = range;
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

    public Collection<RepaymentMethod> getRepayMethod() {
        return repayMethod;
    }

    public void setRepayMethod(Collection<RepaymentMethod> repayMethod) {
        this.repayMethod = repayMethod;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public UserFund getFund() {
        return fund;
    }

    public void setFund(UserFund fund) {
        this.fund = fund;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setSingleAmount(int singleAmount) {
        this.singleAmount = singleAmount;
    }

    public void setRepayMethod(List<RepaymentMethod> repayMethod) {
        this.repayMethod = repayMethod;
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

    public AutoBidRange getRange() {
        return range;
    }

    public void setRange(AutoBidRange range) {
        this.range = range;
    }
}
