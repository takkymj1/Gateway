/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model;

import com.creditcloud.model.enums.loan.RepaymentMethod;
import com.creditcloud.model.misc.AutoBidRange;
import java.util.Collection;
import java.util.Date;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * 自动投标
 *
 * @author rooseek
 */
public class UserAutoBid extends BaseObject {

    @NotNull
    private final String userId;

    /**
     * 是否激活
     */
    @NotNull
    private final boolean active;

    /**
     * 单次投标金额,最低50
     */
    @NotNull
    private final int singleAmount;

    /**
     * 账户保留余额
     */
    @Min(0)
    @NotNull
    private final int reservedAmount;

    /**
     * 贷款还款方式
     */
    @NotNull
    private final Collection<RepaymentMethod> repayMethod;

    @NotNull
    private final AutoBidRange range;

    /**
     * true必须有抵押,false可以没有抵押
     */
    @NotNull
    private final boolean mortgaged;

    /**
     * 投标工具最近一次开启时间
     */
    private final Date activedTime;

    private final Date lastBidTime;

    public UserAutoBid(String userId,
                       boolean active,
                       int singleAmount,
                       int reservedAmount,
                       Collection<RepaymentMethod> repayMethod,
                       AutoBidRange range,
                       boolean mortgaged,
                       Date activedTime,
                       Date lastBidTime) {
        this.userId = userId;
        this.active = active;
        this.singleAmount = singleAmount;
        this.reservedAmount = reservedAmount;
        this.repayMethod = repayMethod;
        this.mortgaged = mortgaged;
        this.activedTime = activedTime;
        this.range = range;
        this.lastBidTime = lastBidTime;
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

    public int getReservedAmount() {
        return reservedAmount;
    }

    public Collection<RepaymentMethod> getRepayMethod() {
        return repayMethod;
    }

    public Date getActivedTime() {
        return activedTime;
    }

    public boolean isMortgaged() {
        return mortgaged;
    }

    public Date getLastBidTime() {
        return lastBidTime;
    }

    public AutoBidRange getRange() {
        return range;
    }
}
