/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.fund.model;

import com.creditcloud.fund.model.enums.FundRecordOperation;
import com.creditcloud.fund.model.enums.FundRecordStatus;
import com.creditcloud.fund.model.enums.FundRecordType;
import com.creditcloud.model.BaseObject;
import com.creditcloud.model.misc.RealmEntity;
import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.NotNull;

/**
 * 商户资金记录
 *
 * @author rooseek
 */
public class ClientFundRecord extends BaseObject {

    private String id;

    /**
     * 出账入账账户 对于汇付就是商户子账户，如”SPEDT00001"
     */
    @NotNull
    private String account;

    /**
     * 关联的实体
     */
    private RealmEntity entity;

    /**
     * 关联的用户，如果是商户之间转账则为空
     */
    private String userId;

    /**
     * 类型
     */
    @NotNull
    private FundRecordType type;

    /**
     * 操作
     */
    @NotNull
    private FundRecordOperation operation;

    /**
     * 状态
     */
    @NotNull
    private FundRecordStatus status;

    /**
     * 金额
     */
    @NotNull
    private BigDecimal amount;

    /**
     * 订单号
     */
    @NotNull
    private String orderId;

    /**
     * 交易号
     */
    private String transactionId;

    private String description;

    private Date timeRecorded;

    public ClientFundRecord() {
    }

    public ClientFundRecord(String id,
                            String account,
                            RealmEntity entity,
                            String userId,
                            FundRecordType type,
                            FundRecordOperation operation,
                            FundRecordStatus status,
                            BigDecimal amount,
                            String orderId,
                            String transactionId,
                            String description) {
        this.id = id;
        this.account = account;
        this.entity = entity;
        this.userId = userId;
        this.type = type;
        this.operation = operation;
        this.status = status;
        this.amount = amount;
        this.orderId = orderId;
        this.transactionId = transactionId;
        this.description = description;
    }

    public String getAccount() {
        return account;
    }

    public RealmEntity getEntity() {
        return entity;
    }

    public FundRecordType getType() {
        return type;
    }

    public FundRecordOperation getOperation() {
        return operation;
    }

    public FundRecordStatus getStatus() {
        return status;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getDescription() {
        return description;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setEntity(RealmEntity entity) {
        this.entity = entity;
    }

    public void setType(FundRecordType type) {
        this.type = type;
    }

    public void setOperation(FundRecordOperation operation) {
        this.operation = operation;
    }

    public void setStatus(FundRecordStatus status) {
        this.status = status;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public Date getTimeRecorded() {
        return timeRecorded;
    }

    public void setTimeRecorded(Date timeRecorded) {
        this.timeRecorded = timeRecorded;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
