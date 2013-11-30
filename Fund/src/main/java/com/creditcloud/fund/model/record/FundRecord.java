/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.fund.model.record;

import com.creditcloud.model.user.fund.BankAccount;
import com.creditcloud.model.BaseObject;
import com.creditcloud.fund.model.enums.FundRecordOperation;
import com.creditcloud.fund.model.enums.FundRecordStatus;
import com.creditcloud.fund.model.enums.FundRecordType;
import com.creditcloud.model.misc.RealmEntity;
import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 资金历史记录
 *
 * @author rooseek
 */
@XmlRootElement
public class FundRecord extends BaseObject {

    private static final long serialVersionUID = 20131116L;

    @NotNull
    private String id;

    @NotNull
    private String userId;

    private BankAccount account;

    /*
     * 资金记录对应的实体，例如投标就对应InvestId
     */
    private RealmEntity entity;

    /**
     * 资金记录类型
     */
    @NotNull
    protected FundRecordType type;

    /**
     * 资金状态
     */
    @NotNull
    protected FundRecordStatus status;

    /**
     * 资金操作
     */
    @NotNull
    protected FundRecordOperation operation;

    /**
     * 金额
     */
    @Min(0)
    protected BigDecimal amount;

    /*
     * 交易订单号, 对应汇付接口中的OrdId
     */
    private String orderId;

    /**
     * 交易流水号, 对应汇付接口中的TrxId
     */
    private String transactionId;

    /**
     * 可能为失败的提示信息
     */
    protected String description;

    protected Date timeRecorded;

    public FundRecord() {
    }

    public FundRecord(String id,
                      String userId,
                      BankAccount account,
                      RealmEntity entity,
                      FundRecordType type,
                      FundRecordStatus status,
                      FundRecordOperation operation,
                      BigDecimal amount,
                      String orderId,
                      String transactionId,
                      String description) {
        this.id = id;
        this.userId = userId;
        this.account = account;
        this.entity = entity;
        this.type = type;
        this.status = status;
        this.operation = operation;
        this.amount = amount;
        this.orderId = orderId;
        this.transactionId = transactionId;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RealmEntity getEntity() {
        return entity;
    }

    public FundRecordType getType() {
        return type;
    }

    public FundRecordStatus getStatus() {
        return status;
    }

    public FundRecordOperation getOperation() {
        return operation;
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

    public void setEntity(RealmEntity entity) {
        this.entity = entity;
    }

    public void setType(FundRecordType type) {
        this.type = type;
    }

    public void setStatus(FundRecordStatus status) {
        this.status = status;
    }

    public void setOperation(FundRecordOperation operation) {
        this.operation = operation;
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

    public Date getTimeRecorded() {
        return timeRecorded;
    }

    public void setTimeRecorded(Date timeRecorded) {
        this.timeRecorded = timeRecorded;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    //TODO for backward compatibility with jsp
    public String getTransactionNumber() {
        return transactionId;
    }

    //TODO for backward compatibility with jsp
    public String getOrderNumber() {
        return orderId;
    }

    //TODO for backward compatibility with jsp
    public Date getRecordTime() {
        return timeRecorded;
    }

    /*
     * TODO for backward compatibility with jsp<p>
     * @see http://creditcloud.com:8082/browse/UND-18
     */
    public String getMethod() {
        return "汇付天下";
    }
}
