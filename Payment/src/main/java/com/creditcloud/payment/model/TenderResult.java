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
public class TenderResult extends PaymentResult {

    private String FreezeOrdId;

    private String FreezeTrxId;

    public TenderResult(String RespCode,
                        String RespDesc,
                        String FreezeOrdId,
                        String FreezeTrxId) {
        super(RespCode, RespDesc);
        this.FreezeOrdId = FreezeOrdId;
        this.FreezeTrxId = FreezeTrxId;
    }
}
