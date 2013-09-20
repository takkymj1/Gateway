/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.user.fund;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.user.fund.FundRecordType;
import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.NotNull;

/**
 * 资金历史记录
 *
 * @author rooseek
 */
public class FundRecord extends BaseObject {

    private static final long serialVersionUID = 20130918L;

    @NotNull
    private final String id;

    @NotNull
    protected final UserFund fund;

    @NotNull
    protected final FundRecordType type;

    /**
     * 金额
     */
    @NotNull
    protected final BigDecimal amount;

    /**
     * true for income, false for expense
     */
    @NotNull
    protected final boolean income;

    @NotNull
    protected final Date recordTime;

    @NotNull
    protected final String description;

    /*
     * 交易订单号
     */
    @NotNull
    private final String orderNumber;

    /**
     * 交易流水号
     */
    @NotNull
    private final String transactionNumber;

    public FundRecord(String id,
                      UserFund fund,
                      FundRecordType type,
                      BigDecimal amount,
                      boolean income,
                      Date recordTime,
                      String orderNumber,
                      String transactionNumber,
                      String description) {
        this.id = id;
        this.fund = fund;
        this.type = type;
        this.amount = amount;
        this.income = income;
        this.recordTime = recordTime;
        this.description = description;
        this.orderNumber = orderNumber;
        this.transactionNumber = transactionNumber;
    }

    public UserFund getFund() {
        return fund;
    }

    public FundRecordType getType() {
        return type;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public boolean isIncome() {
        return income;
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public String getDescription() {
        return description;
    }

    public String getId() {
        return id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public String getTransactionNumber() {
        return transactionNumber;
    }
}
