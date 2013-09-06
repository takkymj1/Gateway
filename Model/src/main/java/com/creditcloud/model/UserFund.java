/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model;

import java.math.BigDecimal;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * 用户资金
 *
 * @author rooseek
 */
public class UserFund extends BaseObject {

    @Id
    private String userId;

    /**
     * 可用余额
     */
    @NotNull
    @Min(0)
    private BigDecimal availableAmount;

    /**
     * 冻结金额
     */
    @NotNull
    @Min(0)
    private BigDecimal frozenAmount;

    /**
     * 待收总额
     */
    @NotNull
    @Min(0)
    private BigDecimal dueInAmount;

    /**
     * 待还总额
     */
    @NotNull
    @Min(0)
    private BigDecimal dueOutAmount;

    public UserFund() {
    }

    public UserFund(String userId,
                    BigDecimal availableAmount,
                    BigDecimal frozenAmount,
                    BigDecimal dueInAmount,
                    BigDecimal dueOutAmount) {
        this.userId = userId;
        this.availableAmount = availableAmount;
        this.frozenAmount = frozenAmount;
        this.dueInAmount = dueInAmount;
        this.dueOutAmount = dueOutAmount;
    }

    public BigDecimal getAvailableAmount() {
        return availableAmount;
    }

    public BigDecimal getFrozenAmount() {
        return frozenAmount;
    }

    public BigDecimal getDueInAmount() {
        return dueInAmount;
    }

    public BigDecimal getDueOutAmount() {
        return dueOutAmount;
    }

    public void setAvailableAmount(BigDecimal availableAmount) {
        this.availableAmount = availableAmount;
    }

    public void setFrozenAmount(BigDecimal frozenAmount) {
        this.frozenAmount = frozenAmount;
    }

    public void setDueInAmount(BigDecimal dueInAmount) {
        this.dueInAmount = dueInAmount;
    }

    public void setDueOutAmount(BigDecimal dueOutAmount) {
        this.dueOutAmount = dueOutAmount;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }
}
