/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.payment.model.chinapnr.enums.AuditFlag;
import java.math.BigDecimal;
import javax.validation.constraints.NotNull;

/**
 * 取现复核返回结果
 *
 * @author rooseek
 */
public class CashAuditResult extends BaseObject {

    private static final long serialVersionUID = 20131112L;

    @NotNull
    private String OrdId;

    @NotNull
    private BigDecimal TransAmt;

    private String OpenAccId;

    private String OpenBankId;

    @NotNull
    private AuditFlag auditFlag;

    public CashAuditResult() {
    }

    public CashAuditResult(String OrdId,
                           BigDecimal TransAmt,
                           String OpenAccId,
                           String OpenBankId,
                           AuditFlag auditFlag) {
        this.OrdId = OrdId;
        this.TransAmt = TransAmt;
        this.OpenAccId = OpenAccId;
        this.OpenBankId = OpenBankId;
        this.auditFlag = auditFlag;
    }

    public String getOrdId() {
        return OrdId;
    }

    public BigDecimal getTransAmt() {
        return TransAmt;
    }

    public String getOpenAccId() {
        return OpenAccId;
    }

    public String getOpenBankId() {
        return OpenBankId;
    }

    public AuditFlag getAuditFlag() {
        return auditFlag;
    }

    public void setOrdId(String OrdId) {
        this.OrdId = OrdId;
    }

    public void setTransAmt(BigDecimal TransAmt) {
        this.TransAmt = TransAmt;
    }

    public void setOpenAccId(String OpenAccId) {
        this.OpenAccId = OpenAccId;
    }

    public void setOpenBankId(String OpenBankId) {
        this.OpenBankId = OpenBankId;
    }

    public void setAuditFlag(AuditFlag auditFlag) {
        this.auditFlag = auditFlag;
    }
}
