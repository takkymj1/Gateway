/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.constant.WealthProductConstant;
import com.creditcloud.model.enums.loan.RepaymentMethod;
import com.creditcloud.model.enums.loan.WealthProductStatus;
import java.util.Date;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * 理财产品/计划
 *
 * @author rooseek
 */
public class WealthProduct extends AbstractFI {

    @NotNull
    private final String title;

    @NotNull
    private final String description;

    /**
     * 募集期,募集期结束第二天开始计算该产品期限
     */
    @NotNull
    private final Date raiseStartDate;

    @NotNull
    private final Date raiseEndDate;

    /**
     * 总额度
     */
    @Min(WealthProductConstant.MIN_WEALTH_PRODUCT_AMOUNT)
    @Max(WealthProductConstant.MAX_WEALTH_PRODUCT_AMOUNT)
    @NotNull
    private final int totalAmount;

    /**
     * 单人投资最高上限
     */
    @NotNull
    private final int maxInvestAmount;

    /**
     * 理财产品状态
     */
    @NotNull
    private WealthProductStatus status;

    /**
     * 投资人数
     */
    private int investerNumber;

    /**
     * 募集满额时间，不超过募集期结束时间
     */
    private Date finishTime;

    public WealthProduct(String id,
                         String title,
                         String description,
                         Date raiseStartDate,
                         Date raiseEndDate,
                         WealthProductStatus status,
                         int totalAmount,
                         int maxInvestAmount,
                         int investerNumber,
                         Duration duration,
                         int rate,
                         RepaymentMethod method,
                         Date finishTime) {
        super(id, duration, rate, method);
        this.title = title;
        this.description = description;
        this.raiseStartDate = raiseStartDate;
        this.raiseEndDate = raiseEndDate;
        this.totalAmount = totalAmount;
        this.maxInvestAmount = maxInvestAmount;
        this.investerNumber = investerNumber;
        this.status = status;
        this.finishTime = finishTime;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public int getMaxInvestAmount() {
        return maxInvestAmount;
    }

    public Date getRaiseStartDate() {
        return raiseStartDate;
    }

    public Date getRaiseEndDate() {
        return raiseEndDate;
    }

    public int getInvesterNumber() {
        return investerNumber;
    }

    public void setInvesterNumber(int investerNumber) {
        this.investerNumber = investerNumber;
    }

    public WealthProductStatus getStatus() {
        return status;
    }

    public void setStatus(WealthProductStatus status) {
        this.status = status;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }
}
