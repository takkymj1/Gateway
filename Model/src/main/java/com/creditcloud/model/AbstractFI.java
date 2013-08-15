/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model;

import com.creditcloud.model.enums.loan.RepaymentMethod;
import com.creditcloud.model.loan.Duration;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * 抽象的固定收益类产品
 *
 * @author sobranie
 */
public abstract class AbstractFI extends BaseObject {

    /**
     * 金额
     */
    @NotNull
    @Min(1000)
    @Max(1000000)
    protected int amount;

    /**
     * 期限
     */
    @NotNull
    protected Duration duration;

    /**
     * 年化利率（万分之几）
     */
    @NotNull
    @Min(800)
    @Max(2400)
    protected int rate;

    /**
     * 偿还方法
     */
    @NotNull
    protected RepaymentMethod method;

    /**
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * @return the duration
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    /**
     * @return the rate
     */
    public int getRate() {
        return rate;
    }

    /**
     * @param rate the rate to set
     */
    public void setRate(int rate) {
        this.rate = rate;
    }

    /**
     * @return the method
     */
    public RepaymentMethod getMethod() {
        return method;
    }

    /**
     * @param method the method to set
     */
    public void setMethod(RepaymentMethod method) {
        this.method = method;
    }
}
