/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.reconciliation;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.TransStat;
import java.math.BigDecimal;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 商户扣款对账
 *
 * @author rooseek
 */
@XmlRootElement
public class TransferReconciliation extends BaseObject {

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
    private BigDecimal TransAmt;

    @NotNull
    @Size(min = 1, max = 1)
    private TransStat TransStat;

    @NotNull
    private String PnrDate;

    @NotNull
    private String PnrSeqId;

    public TransferReconciliation() {
    }

    public TransferReconciliation(String OrdId, 
                             String MerCustId, 
                             String UsrCustId,
                             BigDecimal TransAmt,
                             TransStat TransStat, 
                             String PnrDate, 
                             String PnrSeqId) {
        this.OrdId = OrdId;
        this.MerCustId = MerCustId;
        this.UsrCustId = UsrCustId;
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
