/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.va.model;

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
public class VirtualCashRecord {
   
    @UUID
    @NotNull
    String id;

    /**
     * 外部交易流水号，用于追踪实际收付款
     */
    @NotNull
    String transactionId;
    
    @NotNull
    BigDecimal amount;
    
    @NotNull
    Date timeHappened;
}
