/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.fund.model;

import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户资金
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
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
    private BigDecimal dueInAmount;

    /**
     * 待还总额
     */
    @NotNull
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

    /**
     * 商户给用户的转账收入或者用户给商户的转账支出<p>
     * 可能小于零
     */
    @NotNull
    private BigDecimal transferAmount;



    /**
     * 免费提现总额
     */
    @Min(0)
    @NotNull
    private BigDecimal freeWithdrawAmount;

    public UserFund(String userId,
                    BigDecimal availableAmount,
                    BigDecimal frozenAmount,
                    BigDecimal dueInAmount,
                    BigDecimal dueOutAmount,
                    BigDecimal depositAmount,
                    BigDecimal withdrawAmount,
                    BigDecimal transferAmount,
                    BigDecimal freeWithdrawAmount) {
        this.userId = userId;
        this.availableAmount = availableAmount;
        this.frozenAmount = frozenAmount;
        this.dueInAmount = dueInAmount;
        this.dueOutAmount = dueOutAmount;
        this.depositAmount = depositAmount;
        this.withdrawAmount = withdrawAmount;
        this.transferAmount = transferAmount;
        this.freeWithdrawAmount = freeWithdrawAmount;
    }

    //TODO for backward compatibility in jsp
    @Deprecated
    public BigDecimal getRechargeAmount() {
        return depositAmount;
    }
}
