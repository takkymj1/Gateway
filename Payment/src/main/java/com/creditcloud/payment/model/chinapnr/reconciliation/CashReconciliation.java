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
 * 取现对账记录
 *
 * @author rooseek
 */
@XmlRootElement
public class CashReconciliation extends BaseObject {

    private static final long serialVersionUID = 20131112L;

    @NotNull
    @Size(max = 20)
    private String OrdId;

    @NotNull
    @Size(max = 16)
    private String MerCustId;

    @NotNull
    @Size(max = 16)
    private String UsrCustId;

    @NotNull
    private String CardId;

    @NotNull
    private BigDecimal TransAmt;

    @NotNull
    @Size(min = 1, max = 1)
    private TransStat TransStat;

    @NotNull
    private String PnrDate;

    @NotNull
    private String PnrSeqId;

    public CashReconciliation() {
    }

    public CashReconciliation(String OrdId,
                              String MerCustId,
                              String UsrCustId,
                              String CardId,
                              BigDecimal TransAmt,
                              TransStat TransStat,
                              String PnrDate,
                              String PnrSeqId) {
        this.OrdId = OrdId;
        this.MerCustId = MerCustId;
        this.UsrCustId = UsrCustId;
        this.CardId = CardId;
        this.TransAmt = TransAmt;
        this.TransStat = TransStat;
        this.PnrDate = PnrDate;
        this.PnrSeqId = PnrSeqId;
    }

    public String getOrdId() {
        return OrdId;
    }

    public String getMerCustId() {
        return MerCustId;
    }

    public String getUsrCustId() {
        return UsrCustId;
    }

    public String getCardId() {
        return CardId;
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

    public void setMerCustId(String MerCustId) {
        this.MerCustId = MerCustId;
    }

    public void setUsrCustId(String UsrCustId) {
        this.UsrCustId = UsrCustId;
    }

    public void setCardId(String CardId) {
        this.CardId = CardId;
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
