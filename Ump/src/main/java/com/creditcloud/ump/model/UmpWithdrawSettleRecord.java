/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model;

import com.creditcloud.model.BaseObject;
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
public class UmpWithdrawSettleRecord extends BaseObject{
    
    private String orderId;
    
    private String merDate;
    
    private BigDecimal amount;
    
    private BigDecimal fee;
    
    private String state;
    
    private String settleDate;
    
    private String transactionId;
}
