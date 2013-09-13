/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.constant.LoanConstant;
import com.creditcloud.model.enums.loan.RepaymentMethod;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * 抽象的固定收益类产品
 *
 * @author sobranie
 */
public abstract class AbstractFI extends BaseObject implements Investable {

    @NotNull
    private final String id;

    /**
     * 期限
     */
    @NotNull
    protected final Duration duration;

    /**
     * 年化利率（万分之几）
     */
    @NotNull
    @Min(LoanConstant.MIN_LOAN_RATE)
    @Max(LoanConstant.MAX_LOAN_RATE)
    protected final int rate;

    /**
     * 偿还方法
     */
    @NotNull
    protected final RepaymentMethod method;

    public AbstractFI(String id,
                      Duration duration,
                      int rate,
                      RepaymentMethod method) {
        this.id = id;
        this.duration = duration;
        this.rate = rate;
        this.method = method;
    }

    /**
     * @return the duration
     */
    @Override
    public Duration getDuration() {
        return duration;
    }

    /**
     * @return the rate
     */
    @Override
    public int getRate() {
        return rate;
    }

    /**
     * @return the method
     */
    @Override
    public RepaymentMethod getMethod() {
        return method;
    }

    @Override
    public String getId() {
        return id;
    }
}
