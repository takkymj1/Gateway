/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.payment.model.chinapnr.constraint.PNRDate;
import java.math.BigDecimal;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 结合了具体的金额和交易号、流水号
 *
 * @author sobranie
 */
@XmlRootElement
public class TransactionAmount extends BaseObject {

    private static final long serialVersionUID = 20131113L;

    @Size(max = 20)
    private String OrdId;

    @Size(min = 18, max = 18)
    private String TrxId;

    @PNRDate
    private String OrdDate;

    private BigDecimal amount;

    public TransactionAmount() {
    }

    public TransactionAmount(String OrdId, String TrxId, String OrdDate, BigDecimal amount) {
        this.OrdId = OrdId;
        this.TrxId = TrxId;
        this.OrdDate = OrdDate;
        this.amount = amount;
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

    public String getOrdDate() {
        return OrdDate;
    }

    public void setOrdDate(String OrdDate) {
        this.OrdDate = OrdDate;
    }
}
