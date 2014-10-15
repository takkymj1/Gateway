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
    
    @UUID
    @NotNull
    String accountId;
    
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
    
    @NotNull
    Date timeHappened;
}
