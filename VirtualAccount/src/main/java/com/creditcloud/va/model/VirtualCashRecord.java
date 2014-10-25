/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.va.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.constraints.UUID;
import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * 现金账条目
 * 
 * @author sobranie
 */
@Data
public class VirtualCashRecord extends BaseObject{
   
    @UUID
    @NotNull
    String id;

    /**
     * 外部交易流水号，用于追踪实际收付款
     */
    String transactionId;
    
    /**
     * 金额
     */
    @NotNull
    BigDecimal amount;
    
    /**
     * 结算时间
     */
    Date timeHappened;
    
    /**
     * 记录产生时间
     */
    Date timeRecord;
    
    /**
     * 网银卡号
     */
    String transactionNo;
    
    /**
     * 状态
     */
    VirtualCashRecordStatus virtualCashRecordStatus;
    
    public VirtualCashRecord(){}
    
    public VirtualCashRecord(String id,
            String transactionId,
            BigDecimal amount,
            Date timeHappened,
            String transactionNo,
            VirtualCashRecordStatus virtualCashRecordStatus,
            Date timeRecord){
        this.id = id;
        this.transactionId = transactionId;
        this.amount = amount;
        this.timeHappened = timeHappened;
        this.transactionNo = transactionNo;
        this.virtualCashRecordStatus = virtualCashRecordStatus;
        this.timeRecord = timeRecord;
    }
}
