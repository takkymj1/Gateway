/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.fund.model;

import com.creditcloud.fund.model.enums.FundRecordOperation;
import com.creditcloud.fund.model.enums.FundRecordStatus;
import com.creditcloud.fund.model.enums.FundRecordType;
import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.Realm;
import com.creditcloud.model.misc.RealmEntity;
import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 商户资金记录
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
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
     * 关联的用户账户类别:个人或者企业,如果为null，则默认为个人
     */
    private Realm category;

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
    
    private String recordPriv;

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

    public Realm getCategory() {
        //老数据没有category，默认是USER
        return category == null ? Realm.USER : category;
    }
}
