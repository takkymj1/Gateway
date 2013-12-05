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
 * 充值对账
 *
 * @author rooseek
 */
@XmlRootElement
public class SaveReconciliation extends BaseObject {

    private static final long serialVersionUID = 20131112L;

    @NotNull
    @Size(max = 16)
    private String MerCustId;

    @NotNull
    @Size(max = 16)
    private String UsrCustId;

    @NotNull
    @Size(max = 20)
    private String OrdId;

    @NotNull
    private String OrdDate;

    @NotNull
    private BigDecimal TransAmt;

    @NotNull
    @Size(min = 1, max = 1)
    private TransStat TransStat;

    @NotNull
    @Size(max = 6)
    private String GateBusiId;

    @NotNull
    @Size(max = 8)
    private String OpenBankId;

    @Size(max = 40)
    private String OpenAcctId;
    
    /**
     * 真实收取的手续费
     */
    @NotNull
    private String FeeAmt;
    
    /**
     * 收取手续费的账号
     */
    @NotNull
    @Size(max = 16)
    private String FeeCustId;
    
    @NotNull
    @Size(max = 9)
    private String FeeAcctId;

    public SaveReconciliation() {
    }

    public SaveReconciliation(String MerCustId,
                              String UsrCustId,
                              String OrdId,
                              String OrdDate,
                              BigDecimal TransAmt,
                              TransStat TransStat,
                              String GateBusiId,
                              String OpenBankId,
                              String OpenAcctId) {
        this.MerCustId = MerCustId;
        this.UsrCustId = UsrCustId;
        this.OrdId = OrdId;
        this.OrdDate = OrdDate;
        this.TransAmt = TransAmt;
        this.TransStat = TransStat;
        this.GateBusiId = GateBusiId;
        this.OpenBankId = OpenBankId;
        this.OpenAcctId = OpenAcctId;
    }

    public void setMerCustId(String MerCustId) {
        this.MerCustId = MerCustId;
    }

    public void setUsrCustId(String UsrCustId) {
        this.UsrCustId = UsrCustId;
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

    public void setTransStat(TransStat TransStat) {
        this.TransStat = TransStat;
    }

    public void setGateBusiId(String GateBusiId) {
        this.GateBusiId = GateBusiId;
    }

    public void setOpenBankId(String OpenBankId) {
        this.OpenBankId = OpenBankId;
    }

    public String getMerCustId() {
        return MerCustId;
    }

    public String getUsrCustId() {
        return UsrCustId;
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

    public TransStat getTransStat() {
        return TransStat;
    }

    public String getGateBusiId() {
        return GateBusiId;
    }

    public String getOpenBankId() {
        return OpenBankId;
    }

    public String getOpenAcctId() {
        return OpenAcctId;
    }

    public void setOpenAcctId(String OpenAcctId) {
        this.OpenAcctId = OpenAcctId;
    }

    public String getFeeAmt() {
        return FeeAmt;
    }

    public void setFeeAmt(String FeeAmt) {
        this.FeeAmt = FeeAmt;
    }

    public String getFeeCustId() {
        return FeeCustId;
    }

    public void setFeeCustId(String FeeCustId) {
        this.FeeCustId = FeeCustId;
    }

    public String getFeeAcctId() {
        return FeeAcctId;
    }

    public void setFeeAcctId(String FeeAcctId) {
        this.FeeAcctId = FeeAcctId;
    }

}
