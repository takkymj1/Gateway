/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.ump.model.ump.enums.UmpTenderAction;
import com.creditcloud.ump.model.ump.enums.UmpTenderTransferType;
import java.math.BigDecimal;
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
public class UmpTenderSettleRecord extends BaseObject{
    
    private String orderId;
    
    private String merDate;
    
    private String tenderId;
    
    private String tenderAccountId;
    
    private String inAccountId;
    
    private String outAccountId;
    
    private UmpTenderAction action;
    
    private UmpTenderTransferType transferType;
    
    private BigDecimal amount;
    
    private String settleDate;
    
    private String settleTime;
    
    private String transactionId;
}