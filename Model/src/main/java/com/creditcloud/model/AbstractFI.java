/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model;

import com.creditcloud.model.loan.Investable;
import com.creditcloud.model.constant.LoanConstant;
import com.creditcloud.model.enums.loan.LoanStatus;
import com.creditcloud.model.enums.loan.RepaymentMethod;
import com.creditcloud.model.loan.Duration;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * 抽象的固定收益类产品
 *
 * @author sobranie
 */
public abstract class AbstractFI extends BaseObject implements Investable {

    @Id
    private String id;

    /**
     * 期限
     */
    @NotNull
    protected Duration duration;

    /**
     * 年化利率（万分之几）
     */
    @NotNull
    @Min(LoanConstant.MIN_LOAN_RATE)
    @Max(LoanConstant.MAX_LOAN_RATE)
    protected int rate;

    /**
     * 偿还方法
     */
    @NotNull
    protected RepaymentMethod method;

    /**
     * 状态
     */
    @NotNull
    protected LoanStatus status;

    public AbstractFI(String id, 
                      Duration duration, 
                      int rate, 
                      RepaymentMethod method, 
                      LoanStatus status) {
        this.id = id;
        this.duration = duration;
        this.rate = rate;
        this.method = method;
        this.status = status;
    }

    /**
     * @return the duration
     */
    @Override
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
    @Override
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
    @Override
    public RepaymentMethod getMethod() {
        return method;
    }

    /**
     * @param method the method to set
     */
    public void setMethod(RepaymentMethod method) {
        this.method = method;
    }

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public LoanStatus getStatus() {
        return status;
    }

    public void setStatus(LoanStatus status) {
        this.status = status;
    }
}
