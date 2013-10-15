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
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 资金历史记录
 *
 * @author rooseek
 */
@XmlRootElement
public class FundRecord extends BaseObject {

    private static final long serialVersionUID = 20130918L;

    @NotNull
    private String id;

    @NotNull
    private UserFund fund;

    @NotNull
    private FundRecordType type;

    /**
     * 金额
     */
    @NotNull
    private BigDecimal amount;

    /**
     * true for income, false for expense
     */
    @NotNull
    private boolean income;

    @NotNull
    private Date recordTime;

    @NotNull
    private String description;

    /*
     * 交易订单号
     */
    @NotNull
    private String orderNumber;

    /**
     * 交易流水号
     */
    @NotNull
    private String transactionNumber;
    
    public FundRecord() {
    }

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

    public void setId(String id) {
        this.id = id;
    }

    public void setFund(UserFund fund) {
        this.fund = fund;
    }

    public void setType(FundRecordType type) {
        this.type = type;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setIncome(boolean income) {
        this.income = income;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setTransactionNumber(String transactionNumber) {
        this.transactionNumber = transactionNumber;
    }
}
