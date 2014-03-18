/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.fund.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.Realm;
import java.math.BigDecimal;
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

    /**
     * 账户类别:个人或者企业,如果为null，则默认为个人
     */
    private Realm category;

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

    public UserFund(Realm category,
                    String userId,
                    BigDecimal availableAmount,
                    BigDecimal frozenAmount,
                    BigDecimal dueInAmount,
                    BigDecimal dueOutAmount,
                    BigDecimal depositAmount,
                    BigDecimal withdrawAmount,
                    BigDecimal transferAmount) {
        this.category = category;
        this.userId = userId;
        this.availableAmount = availableAmount;
        this.frozenAmount = frozenAmount;
        this.dueInAmount = dueInAmount;
        this.dueOutAmount = dueOutAmount;
        this.depositAmount = depositAmount;
        this.withdrawAmount = withdrawAmount;
        this.transferAmount = transferAmount;
    }

    //TODO for backward compatibility in jsp
    @Deprecated
    public BigDecimal getRechargeAmount() {
        return depositAmount;
    }

    public Realm getCategory() {
        //老数据没有category，默认是USER
        return category == null ? Realm.USER : category;
    }
}
