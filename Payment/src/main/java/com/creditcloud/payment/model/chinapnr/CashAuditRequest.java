/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr;

import com.creditcloud.model.constraints.PNRReturnURL;
import com.creditcloud.payment.model.chinapnr.PnRConstant;
import com.creditcloud.payment.model.chinapnr.base.BaseRequest;
import com.creditcloud.payment.model.chinapnr.enums.CmdIdType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author rooseek
 */
public class CashAuditRequest extends BaseRequest {

    @NotNull
    @Size(max = 20)
    private String OrdId;

    @NotNull
    @Size(max = 16)
    private String UsrCustId;

    @NotNull
    @Size(max = 14)
    private String TransAmt;

    @NotNull
    @Size(min = 1, max = 1)
    private String AuditFlag;

    @PNRReturnURL
    @Size(max = 128)
    private String RetUrl;

    @NotNull
    @PNRReturnURL
    @Size(max = 128)
    private String BgRetUrl;

    public CashAuditRequest() {
    }

    public CashAuditRequest(String MerCustId,
                            String OrdId,
                            String UsrCustId,
                            String TransAmt,
                            String AuditFlag,
                            String BgRetUrl) {
        super(PnRConstant.Version, CmdIdType.CashAudit, MerCustId);
        this.OrdId = OrdId;
        this.UsrCustId = UsrCustId;
        this.TransAmt = TransAmt;
        this.AuditFlag = AuditFlag;
        this.BgRetUrl = BgRetUrl;
    }

    public String getOrdId() {
        return OrdId;
    }

    public String getUsrCustId() {
        return UsrCustId;
    }

    public String getTransAmt() {
        return TransAmt;
    }

    public String getAuditFlag() {
        return AuditFlag;
    }

    public String getRetUrl() {
        return RetUrl;
    }

    public String getBgRetUrl() {
        return BgRetUrl;
    }

    public void setOrdId(String OrdId) {
        this.OrdId = OrdId;
    }

    public void setUsrCustId(String UsrCustId) {
        this.UsrCustId = UsrCustId;
    }

    public void setTransAmt(String TransAmt) {
        this.TransAmt = TransAmt;
    }

    public void setAuditFlag(String AuditFlag) {
        this.AuditFlag = AuditFlag;
    }

    public void setRetUrl(String RetUrl) {
        this.RetUrl = RetUrl;
    }

    public void setBgRetUrl(String BgRetUrl) {
        this.BgRetUrl = BgRetUrl;
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder(baseChkString());
        sb.append(StringUtils.trimToEmpty(getOrdId()))
                .append(StringUtils.trimToEmpty(getUsrCustId()))
                .append(StringUtils.trimToEmpty(getTransAmt()))
                .append(StringUtils.trimToEmpty(getAuditFlag()))
                .append(StringUtils.trimToEmpty(getRetUrl()))
                .append(StringUtils.trimToEmpty(getBgRetUrl()))
                .append(StringUtils.trimToEmpty(getMerPriv()));

        return sb.toString();
    }
}
