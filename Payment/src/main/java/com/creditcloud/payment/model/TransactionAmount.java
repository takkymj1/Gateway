/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model;

import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;

/**
 * 结合了具体的金额和交易号、流水号
 * 
 * @author sobranie
 */
public class TransactionAmount extends BaseObject {
    
    private String OrdId;

    private String TrxId;

    private BigDecimal amount;

    public TransactionAmount() {
    }

    public String getTrxId() {
        return TrxId;
    }

    public void setTrxId(String TrxId) {
        this.TrxId = TrxId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getOrdId() {
        return OrdId;
    }

    public void setOrdId(String OrdId) {
        this.OrdId = OrdId;
    }
    
}
