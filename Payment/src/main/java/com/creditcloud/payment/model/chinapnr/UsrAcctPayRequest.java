/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr;

import com.creditcloud.payment.model.chinapnr.base.UserRequest;
import com.creditcloud.payment.model.chinapnr.constraint.PnRReturnURL;
import com.creditcloud.payment.model.chinapnr.enums.CmdIdType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.apache.commons.lang3.StringUtils;

/**
 * 用户账户支付
 *
 * @author rooseek
 */
public class UsrAcctPayRequest extends UserRequest {

    @NotNull
    @Size(max = 20)
    private String OrdId;

    @NotNull
    @Size(max = 14)
    private String TransAmt;

    @NotNull
    @Size(max = 9)
    private String InAcctId;

    @NotNull
    @Size(max = 6)
    private String InAcctType;

    @PnRReturnURL
    private String RetUrl;

    @NotNull
    @PnRReturnURL
    private String BgRetUrl;

    public UsrAcctPayRequest() {
    }

    public UsrAcctPayRequest(String MerCustId,
                             String UsrCustId,
                             String OrdId,
                             String TransAmt,
                             String InAcctId,
                             String InAcctType,
                             String RetUrl,
                             String BgRetUrl) {
        super(CmdIdType.UsrAcctPay, MerCustId, UsrCustId);
        this.OrdId = OrdId;
        this.TransAmt = TransAmt;
        this.InAcctId = InAcctId;
        this.InAcctType = InAcctType;
        this.RetUrl = RetUrl;
        this.BgRetUrl = BgRetUrl;
    }

    public String getOrdId() {
        return OrdId;
    }

    public String getTransAmt() {
        return TransAmt;
    }

    public String getInAcctId() {
        return InAcctId;
    }

    public String getInAcctType() {
        return InAcctType;
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

    public void setTransAmt(String TransAmt) {
        this.TransAmt = TransAmt;
    }

    public void setInAcctId(String InAcctId) {
        this.InAcctId = InAcctId;
    }

    public void setInAcctType(String InAcctType) {
        this.InAcctType = InAcctType;
    }

    public void setRetUrl(String RetUrl) {
        this.RetUrl = RetUrl;
    }

    public void setBgRetUrl(String BgRetUrl) {
        this.BgRetUrl = BgRetUrl;
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StringUtils.trimToEmpty(getVersion()))
                .append(StringUtils.trimToEmpty(getCmdId().name()))
                .append(StringUtils.trimToEmpty(getOrdId()))
                .append(StringUtils.trimToEmpty(getUsrCustId()))
                .append(StringUtils.trimToEmpty(getMerCustId()))
                .append(StringUtils.trimToEmpty(getTransAmt()))
                .append(StringUtils.trimToEmpty(getInAcctId()))
                .append(StringUtils.trimToEmpty(getInAcctType()))
                .append(StringUtils.trimToEmpty(getRetUrl()))
                .append(StringUtils.trimToEmpty(getBgRetUrl()))
                .append(StringUtils.trimToEmpty(getMerPriv()));
        return sb.toString();
    }
}
