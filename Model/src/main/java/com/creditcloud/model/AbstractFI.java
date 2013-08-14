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
    private int amount;

    /**
     * 期限
     */
    @NotNull
    private Duration duration;

    /**
     * 年化利率（万分之几）
     */
    @NotNull
    @Min(800)
    @Max(2400)
    private int rate;

    /**
     * 偿还方法
     */
    @NotNull
    private RepaymentMethod method;
}
