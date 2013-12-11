/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model;

import java.math.BigDecimal;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rooseek
 */
@XmlRootElement
public class MerCashResult extends PaymentResult {

    @NotNull
    private BigDecimal TransAmt;

    @NotNull
    private BigDecimal FeeAmt;

    @NotNull
    private String FeeCustId;

    @NotNull
    private String FeeAcctId;

    public MerCashResult() {
    }

    public MerCashResult(String RespCode, 
                         String RespDesc,
                         BigDecimal TransAmt,
                         BigDecimal FeeAmt, 
                         String FeeCustId, 
                         String FeeAcctId) {
        super(RespCode, RespDesc);
        this.TransAmt = TransAmt;
        this.FeeAmt = FeeAmt;
        this.FeeCustId = FeeCustId;
        this.FeeAcctId = FeeAcctId;
    }

    public BigDecimal getTransAmt() {
        return TransAmt;
    }

    public BigDecimal getFeeAmt() {
        return FeeAmt;
    }

    public String getFeeCustId() {
        return FeeCustId;
    }

    public String getFeeAcctId() {
        return FeeAcctId;
    }

    public void setTransAmt(BigDecimal TransAmt) {
        this.TransAmt = TransAmt;
    }

    public void setFeeAmt(BigDecimal FeeAmt) {
        this.FeeAmt = FeeAmt;
    }

    public void setFeeCustId(String FeeCustId) {
        this.FeeCustId = FeeCustId;
    }

    public void setFeeAcctId(String FeeAcctId) {
        this.FeeAcctId = FeeAcctId;
    }
}
