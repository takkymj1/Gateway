/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 借款人实际需要的还款金额明细，包括各种借款费用.主要用于页面显示
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
public class RepayDetail extends BaseObject {

    private static final long serialVersionUID = 20131222L;

    /**
     * 本金
     */
    @NotNull
    @Min(0)
    protected BigDecimal principal;

    /**
     * 利息
     */
    @NotNull
    @Min(0)
    protected BigDecimal interest;

    /**
     * 剩余本息
     */
    @NotNull
    @Min(0)
    private BigDecimal outstanding;

    /**
     * 还款期数
     */
    @NotNull
    @Min(0)
    private int period;

    /**
     * 借款人利息管理费
     */
    @NotNull
    @Min(0)
    private BigDecimal loanFee;

    /**
     * 借款管理费,某些客户不收取所以可能为null
     */
    @Min(0)
    private BigDecimal manageFee;

    public RepayDetail(BigDecimal principal,
                       BigDecimal interest,
                       BigDecimal outstanding,
                       int period,
                       BigDecimal loanFee,
                       BigDecimal managerFee) {
        this.principal = principal;
        this.interest = interest;
        this.outstanding = outstanding;
        this.period = period;
        this.loanFee = loanFee;
        this.manageFee = managerFee;
    }

    /**
     * 总额
     *
     * @return
     */
    public BigDecimal getTotal() {
        BigDecimal result = principal.add(interest).add(loanFee);
        if (manageFee != null) {
            result = result.add(manageFee);
        }
        return result;
    }
}
