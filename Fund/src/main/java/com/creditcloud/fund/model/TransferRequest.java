/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.fund.model;

import com.creditcloud.fund.model.enums.FundRecordStatus;
import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 商户向用户转账的申请记录
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
public class TransferRequest extends BaseObject {

    private static final long serialVersionUID = 20141110L;

    private String id;

    /**
     * 转账对象userId
     */
    @NotNull
    private String userId;

    /**
     * 转账金额
     */
    @NotNull
    @Min(0)
    private BigDecimal amount;

    /**
     * 商户转账子账户
     */
    @NotNull
    private String account;

    /**
     * 转账申请状态
     */
    @NotNull
    private FundRecordStatus status;

    /**
     * 对应的orderId
     */
    private String orderId;

    /**
     * 转账申请员工
     */
    private String requestEmployee;

    /**
     * 转账审核员工
     */
    private String auditEmployee;

    /**
     * 转账说明
     */
    private String description;
    
    private Date timeRecorded;

    public TransferRequest(String id,
                           String userId,
                           BigDecimal amount,
                           String account,
                           FundRecordStatus status,
                           String orderId,
                           String requestEmployee,
                           String auditEmployee,
                           String description) {
        this.id = id;
        this.userId = userId;
        this.amount = amount;
        this.account = account;
        this.status = status;
        this.orderId = orderId;
        this.requestEmployee = requestEmployee;
        this.auditEmployee = auditEmployee;
        this.description = description;
    }
}
