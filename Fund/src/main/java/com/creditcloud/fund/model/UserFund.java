/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.fund.model;

import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * 用户资金
 *
 * @author rooseek
 */
public class UserFund extends BaseObject {

    private static final long serialVersionUID = 20130918L;

    @NotNull
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

    /**
     * 充值总额
     */
    @Min(0)
    @NotNull
    private BigDecimal depositAmount;

    /**
     * 提现总额
     */
    @Min(0)
    @NotNull
    private BigDecimal withdrawAmount;

    public UserFund(String userId,
                    BigDecimal availableAmount,
                    BigDecimal frozenAmount,
                    BigDecimal dueInAmount,
                    BigDecimal dueOutAmount,
                    BigDecimal depositAmount,
                    BigDecimal withdrawAmount) {
        this.userId = userId;
        this.availableAmount = availableAmount;
        this.frozenAmount = frozenAmount;
        this.dueInAmount = dueInAmount;
        this.dueOutAmount = dueOutAmount;
        this.depositAmount = depositAmount;
        this.withdrawAmount = withdrawAmount;
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

    public String getUserId() {
        return userId;
    }

    public BigDecimal getDepositAmount() {
        return depositAmount;
    }

    //TODO for backward compatibility in jsp
    public BigDecimal getRechargeAmount() {
        return depositAmount;
    }

    public BigDecimal getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public void setDepositAmount(BigDecimal depositAmount) {
        this.depositAmount = depositAmount;
    }

    public void setWithdrawAmount(BigDecimal withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }
    
    
    /**
     * 冻结一定量的金额.
     *
     * 从可用余额中刨去，并加入到已冻结金额中去
     *
     * @param amount
     * @return
     */
    public UserFund freeze(BigDecimal amount) {
        availableAmount = availableAmount.subtract(amount);
        frozenAmount = frozenAmount.add(amount);
        return this;
    }

    /**
     * 解冻一定量的金额.
     *
     * 从冻结金额中刨去，并加入可用余额
     *
     * @param amount
     * @return
     */
    public UserFund release(BigDecimal amount) {
        availableAmount = availableAmount.add(amount);
        frozenAmount = frozenAmount.subtract(amount);
        return this;
    }

    /**
     * 提现.
     *
     * 从冻结的金额中减去额度，计入总计提现
     *
     * @param amount
     * @param fee    提现手续费
     * @return
     */
    public UserFund withdraw(BigDecimal amount, BigDecimal fee) {
        withdrawAmount = withdrawAmount.add(amount);
        availableAmount = availableAmount.subtract(amount.add(fee));
        return this;
    }

    /**
     * 充值 增加可用金额和充值总金额
     *
     * @param amount
     * @return
     */
    public UserFund deposit(BigDecimal amount) {
        depositAmount = depositAmount.add(amount);
        availableAmount = availableAmount.add(amount);
        return this;
    }

}
