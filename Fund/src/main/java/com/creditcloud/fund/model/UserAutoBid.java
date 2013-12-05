/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.fund.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.loan.RepaymentMethod;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Column;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 自动投标
 *
 * @author rooseek
 */
@XmlRootElement
public class UserAutoBid extends BaseObject {

    private static final long serialVersionUID = 20130918L;

    @NotNull
    private String userId;

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

    /**
     * 最后一次投标时间
     */
    private Date lastBidTime;

    /**
     * 系统管理用，例如对借款人还清贷款前disable自动投标
     */
    @Column(nullable = false)
    private boolean enable;

    public UserAutoBid() {
    }

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

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setSingleAmount(int singleAmount) {
        this.singleAmount = singleAmount;
    }

    public void setReservedAmount(int reservedAmount) {
        this.reservedAmount = reservedAmount;
    }

    public void setRepayMethod(Collection<RepaymentMethod> repayMethod) {
        this.repayMethod = repayMethod;
    }

    public void setRange(AutoBidRange range) {
        this.range = range;
    }

    public void setMortgaged(boolean mortgaged) {
        this.mortgaged = mortgaged;
    }

    public void setActivedTime(Date activedTime) {
        this.activedTime = activedTime;
    }

    public void setLastBidTime(Date lastBidTime) {
        this.lastBidTime = lastBidTime;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public boolean isEnable() {
        return enable;
    }
}
