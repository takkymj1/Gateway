/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.reconciliation;

import com.creditcloud.model.BaseObject;
import com.creditcloud.payment.model.chinapnr.enums.TransStat;
import java.math.BigDecimal;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 投标对账
 *
 * @author rooseek
 */
@XmlRootElement
public class TenderReconciliation extends BaseObject {

    private static final long serialVersionUID = 20131112L;

    @NotNull
    @Size(max = 20)
    private String OrdId;

    @NotNull
    private String OrdDate;

    @NotNull
    @Size(max = 16)
    private String MerCustId;

    @NotNull
    @Size(max = 16)
    private String InvestCustId;

    @NotNull
    @Size(max = 16)
    private String BorrCustId;

    @NotNull
    private BigDecimal TransAmt;

    @NotNull
    private TransStat TransStat;

    @NotNull
    private String PnrDate;

    @NotNull
    private String PnrSeqId;

    public TenderReconciliation() {
    }

    public TenderReconciliation(String OrdId,
                                String OrdDate,
                                String MerCustId,
                                String InvestCustId,
                                String BorrCustId,
                                BigDecimal TransAmt,
                                TransStat TransStat,
                                String PnrDate,
                                String PnrSeqId) {
        this.OrdId = OrdId;
        this.OrdDate = OrdDate;
        this.MerCustId = MerCustId;
        this.InvestCustId = InvestCustId;
        this.BorrCustId = BorrCustId;
        this.TransAmt = TransAmt;
        this.TransStat = TransStat;
        this.PnrDate = PnrDate;
        this.PnrSeqId = PnrSeqId;
    }

    public String getOrdId() {
        return OrdId;
    }

    public String getOrdDate() {
        return OrdDate;
    }

    public String getMerCustId() {
        return MerCustId;
    }

    public String getInvestCustId() {
        return InvestCustId;
    }

    public String getBorrCustId() {
        return BorrCustId;
    }

    public BigDecimal getTransAmt() {
        return TransAmt;
    }

    public TransStat getTransStat() {
        return TransStat;
    }

    public String getPnrDate() {
        return PnrDate;
    }

    public String getPnrSeqId() {
        return PnrSeqId;
    }

    public void setOrdId(String OrdId) {
        this.OrdId = OrdId;
    }

    public void setOrdDate(String OrdDate) {
        this.OrdDate = OrdDate;
    }

    public void setMerCustId(String MerCustId) {
        this.MerCustId = MerCustId;
    }

    public void setInvestCustId(String InvestCustId) {
        this.InvestCustId = InvestCustId;
    }

    public void setBorrCustId(String BorrCustId) {
        this.BorrCustId = BorrCustId;
    }

    public void setTransAmt(BigDecimal TransAmt) {
        this.TransAmt = TransAmt;
    }

    public void setTransStat(TransStat TransStat) {
        this.TransStat = TransStat;
    }

    public void setPnrDate(String PnrDate) {
        this.PnrDate = PnrDate;
    }

    public void setPnrSeqId(String PnrSeqId) {
        this.PnrSeqId = PnrSeqId;
    }
}
