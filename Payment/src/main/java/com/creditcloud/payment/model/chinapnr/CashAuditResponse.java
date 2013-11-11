/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr;

import com.creditcloud.payment.model.chinapnr.base.BaseResponse;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author rooseek
 */
public class CashAuditResponse extends BaseResponse {

    @FormParam("OrdId")
    @NotNull
    @Size(max = 20)
    private String OrdId;

    @FormParam("UsrCustId")
    @NotNull
    @Size(max = 16)
    private String UsrCustId;

    @FormParam("TransAmt")
    @NotNull
    @Size(max = 14)
    private String TransAmt;

    @FormParam("OpenAcctId")
    @Size(max = 40)
    private String OpenAcctId;

    @FormParam("OpenBankId")
    @Size(max = 8)
    private String OpenBankId;

    @FormParam("AuditFlag")
    @NotNull
    @Size(min = 1, max = 1)
    private String AuditFlag;

    @FormParam("RetUrl")
    @Size(max = 128)
    private String RetUrl;

    @FormParam("BgRetUrl")
    @NotNull
    @Size(max = 128)
    private String BgRetUrl;

    public CashAuditResponse() {
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

    public String getOpenAcctId() {
        return OpenAcctId;
    }

    public String getOpenBankId() {
        return OpenBankId;
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

    public void setOpenAcctId(String OpenAcctId) {
        this.OpenAcctId = OpenAcctId;
    }

    public void setOpenBankId(String OpenBankId) {
        this.OpenBankId = OpenBankId;
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
                .append(StringUtils.trimToEmpty(getOpenAcctId()))
                .append(StringUtils.trimToEmpty(getOpenBankId()))
                .append(StringUtils.trimToEmpty(getAuditFlag()))
                .append(StringUtils.trimToEmpty(getRetUrl()))
                .append(StringUtils.trimToEmpty(getBgRetUrl()))
                .append(StringUtils.trimToEmpty(getMerPriv()));

        return sb.toString();
    }
}
