/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model;

import com.creditcloud.ump.model.ump.enums.ParticAccountType;
import com.creditcloud.ump.model.ump.enums.UmpParticType;
import com.creditcloud.ump.model.ump.enums.UmpTenderAction;
import com.creditcloud.ump.model.ump.enums.UmpTenderTransferType;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author kdliu
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UmpTenderTransferRecord {
    
    private String orderId;
    
    private String userId;
    
    private String loanId;
    
    private String merDate;
    
    private String umpTenderId;
    
    private String umpTenderAccountId;
    
    private UmpTenderTransferType transferType;
    
    private UmpTenderAction tenderAction;
    
    private UmpParticType particType;
    
    private ParticAccountType particAccountType;
    
    private String umpAccountName;
    
    private String umpAccountId;
    
    private BigDecimal amount;
}
