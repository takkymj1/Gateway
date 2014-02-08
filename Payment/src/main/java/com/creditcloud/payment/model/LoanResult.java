/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
public class LoanResult extends PaymentResult {

    private String UnFreezeOrdId;
    
    private String FreezeTrxId;

    public LoanResult(String UnFreezeOrdId, 
                      String FreezeTrxId,
                      String RespCode, 
                      String RespDesc) {
        super(RespCode, RespDesc);
        this.UnFreezeOrdId = UnFreezeOrdId;
        this.FreezeTrxId = FreezeTrxId;
    }

}
