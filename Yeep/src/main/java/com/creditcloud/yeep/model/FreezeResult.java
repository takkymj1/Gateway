/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model;

import java.math.BigDecimal;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 冻结返回结果
 *
 * @author tinglany
 */
@XmlRootElement
public class FreezeResult extends YeepResult {

    private static final long serialVersionUID = 20131113L;

    @Size(max = 9)
    private String SubAcctType;

    @Size(max = 9)
    private String SubAcctId;

    @NotNull
    @Size(max = 20)
    private String OrdId;

    @NotNull
    private String OrdDate;

    @NotNull
    private BigDecimal TransAmt;

    @Size(min = 18, max = 18)
    private String TrxId;

    public FreezeResult() {
    }

    public FreezeResult(String RespCode,
                        String RespDesc,
                        String SubAcctType,
                        String SubAcctId,
                        String OrdId,
                        String OrdDate,
                        BigDecimal TransAmt,
                        String TrxId) {
        super(RespCode, RespDesc);
        this.SubAcctType = SubAcctType;
        this.SubAcctId = SubAcctId;
        this.OrdId = OrdId;
        this.OrdDate = OrdDate;
        this.TransAmt = TransAmt;
        this.TrxId = TrxId;
    }

    public String getSubAcctType() {
        return SubAcctType;
    }

    public String getSubAcctId() {
        return SubAcctId;
    }

    public String getOrdId() {
        return OrdId;
    }

    public String getOrdDate() {
        return OrdDate;
    }

    public BigDecimal getTransAmt() {
        return TransAmt;
    }

    public String getTrxId() {
        return TrxId;
    }

    public void setSubAcctType(String SubAcctType) {
        this.SubAcctType = SubAcctType;
    }

    public void setSubAcctId(String SubAcctId) {
        this.SubAcctId = SubAcctId;
    }

    public void setOrdId(String OrdId) {
        this.OrdId = OrdId;
    }

    public void setOrdDate(String OrdDate) {
        this.OrdDate = OrdDate;
    }

    public void setTransAmt(BigDecimal TransAmt) {
        this.TransAmt = TransAmt;
    }

    public void setTrxId(String TrxId) {
        this.TrxId = TrxId;
    }
}

