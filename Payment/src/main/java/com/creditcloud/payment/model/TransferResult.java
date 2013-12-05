/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model;

import java.math.BigDecimal;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sobranie
 */
@XmlRootElement
public class TransferResult extends PaymentResult {

    @NotNull
    @Size(max = 20)
    private String OrdId;

    @NotNull
    @Size(max = 9)
    private String OutAcctId;

    @NotNull
    @Size(max = 14)
    private BigDecimal TransAmt;

    public TransferResult() {
    }

    public TransferResult(String OrdId,
                          String OutAcctId,
                          BigDecimal TransAmt,
                          String RespCode,
                          String RespDesc) {
        super(RespCode, RespDesc);
        this.OrdId = OrdId;
        this.OutAcctId = OutAcctId;
        this.TransAmt = TransAmt;
    }

    public String getOrdId() {
        return OrdId;
    }

    public void setOrdId(String OrdId) {
        this.OrdId = OrdId;
    }

    public String getOutAcctId() {
        return OutAcctId;
    }

    public void setOutAcctId(String OutAcctId) {
        this.OutAcctId = OutAcctId;
    }

    public BigDecimal getTransAmt() {
        return TransAmt;
    }

    public void setTransAmt(BigDecimal TransAmt) {
        this.TransAmt = TransAmt;
    }
}
