/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.constant.WealthProductConstant;
import com.creditcloud.model.enums.loan.RepaymentMethod;
import com.creditcloud.model.enums.loan.WealthProductStatus;
import com.creditcloud.model.misc.Range;
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
    private String title;

    @NotNull
    private String description;

    /**
     * 募集期,募集期结束第二天开始计算该产品期限
     */
    @NotNull
    private Range<Date> raisePeriod;

    /**
     * 总额度
     */
    @Min(WealthProductConstant.MIN_WEALTH_PRODUCT_AMOUNT)
    @Max(WealthProductConstant.MAX_WEALTH_PRODUCT_AMOUNT)
    @NotNull
    private int totalAmount;

    /**
     * 单人投资最高上限
     */
    @NotNull
    private int maxInvestAmount;

    /**
     * 投资人数
     */
    @NotNull
    private int investerNumber;
    
    @NotNull
    private WealthProductStatus status;

    public WealthProduct(String id,
                         String title,
                         String description,
                         Range<Date> raisePeriod,
                         WealthProductStatus status,
                         int totalAmount,
                         int maxInvestAmount,
                         int investerNumber,
                         Duration duration,
                         int rate,
                         RepaymentMethod method) {
        super(id, duration, rate, method);
        this.title = title;
        this.description = description;
        this.raisePeriod = raisePeriod;
        this.totalAmount = totalAmount;
        this.maxInvestAmount = maxInvestAmount;
        this.investerNumber = investerNumber;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Range<Date> getRaisePeriod() {
        return raisePeriod;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public int getMaxInvestAmount() {
        return maxInvestAmount;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRaisePeriod(Range<Date> raisePeriod) {
        this.raisePeriod = raisePeriod;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setMaxInvestAmount(int maxInvestAmount) {
        this.maxInvestAmount = maxInvestAmount;
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
}
