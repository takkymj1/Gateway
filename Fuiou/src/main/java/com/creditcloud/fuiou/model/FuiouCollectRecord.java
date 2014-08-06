/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.fuiou.model;

import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author kdliu
 */
@Data
@NoArgsConstructor
@XmlRootElement
public class FuiouCollectRecord extends BaseObject {

    private static final long serialVersionUID = 20140803L;

    private String orderId;

    private String repaymentId;

    private String userId;
    
    private String orderNo;

    private BigDecimal amount;

    private CollectRecordStatus collectRecordStatus;

    private String orderDate;

    private String bankName;

    private String accountNo;

    private String accountName;

    private String returnCode;

    private String returnMemo;

    private String remoteStatus;

    private String remoteResult;

    private String remoteReason;

    private Date timeCreated;

    private Date timeUpdated;

    public FuiouCollectRecord(String orderId,
                              String repaymentId,
                              String userId,
                              String orderNo,
                              BigDecimal amount,
                              CollectRecordStatus collectRecordStatus,
                              String orderDate,
                              String bankName,
                              String accountNo,
                              String accountName,
                              String returnCode,
                              String returnMemo,
                              String remoteStatus,
                              String remoteResult,
                              String remoteReason,
                              Date timeCreated,
                              Date timeUpdated) {
        this.orderId = orderId;
        this.repaymentId = repaymentId;
        this.userId = userId;
        this.orderNo = orderNo;
        this.amount = amount;
        this.collectRecordStatus = collectRecordStatus;
        this.orderDate = orderDate;
        this.bankName = bankName;
        this.accountNo = accountNo;
        this.accountName = accountName;
        this.returnCode = returnCode;
        this.returnMemo = returnMemo;
        this.remoteStatus = remoteStatus;
        this.remoteResult = remoteResult;
        this.remoteReason = remoteReason;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }
}
