/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.va.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.constraints.UUID;
import com.creditcloud.model.misc.RealmEntity;
import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * 虚拟交易记录.
 * 
 * 
 * 
 * @author sobranie
 */
@Data
public class VirtualBookingRecord extends BaseObject{
    
    @UUID
    @NotNull
    String id;
    
    /**
     * 账目所属账户
     */
    @UUID
    @NotNull
    String accountId;    
    
    /**
     * 帐套名称
     */
    String accountName;
    
    /**
     * 账目所属第三方信息 
    */
    @NotNull
    RealmEntity owner;
    
    String ownerName;
    
    /**
     * 账目关联标的ID
     */
    @UUID
    @NotNull
    private String loanId;
    
    /**
     * 金额.
     * 
     * 正数表示收入、负数表示支出
     */
    BigDecimal amount;
    
    /**
     * 已经结清的金额
     */
    BigDecimal amountCleared;
    
    /**
     * 结算时间
     */
    Date timeHappened;
    
    /**
     * 业务发生的时间
     */
    @NotNull
    Date timeRecord;
    
    /**
     * 账目类型
     */
    @NotNull
    VirtualBookingRecordType virtualBookingRecordType;
    
    /**
     * 账目状态
     */
    @NotNull
    VirtualBookingRecordStatus virtualBookingRecordStatus;
    
    public VirtualBookingRecord(){}
    
    public VirtualBookingRecord(String id,String accountId,
                                    String accountName,
                                    BigDecimal amount,
                                    BigDecimal amountCleared,
                                    Date timeHappened,
                                    Date timeRecord,
                                    VirtualBookingRecordType virtualBookingRecordType,
                                    VirtualBookingRecordStatus virtualBookingRecordStatus,RealmEntity owner,String loanId,String ownerName){
        this.id = id;
        this.accountId = accountId;
        this.accountName = accountName;
        this.amount = amount;
        this.amountCleared = amountCleared;
        this.timeHappened = timeHappened;
        this.timeRecord = timeRecord;
        this.virtualBookingRecordType = virtualBookingRecordType;
        this.virtualBookingRecordStatus = virtualBookingRecordStatus;
        this.owner = owner;
        this.loanId = loanId;
        this.ownerName = ownerName;
    }
}
