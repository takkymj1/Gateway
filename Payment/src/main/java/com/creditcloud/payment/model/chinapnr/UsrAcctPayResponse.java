/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr;

import com.creditcloud.payment.model.chinapnr.base.UserResponse;
import com.creditcloud.payment.model.chinapnr.constraint.PnRReturnURL;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;
import org.apache.commons.lang3.StringUtils;

/**
 * 用户账户支付
 *
 * @author rooseek
 */
public class UsrAcctPayResponse extends UserResponse {

    @FormParam("OrdId")
    @NotNull
    @Size(max = 20)
    private String OrdId;

    @FormParam("TransAmt")
    @NotNull
    @Size(max = 14)
    private String TransAmt;

    @FormParam("InAcctId")
    @NotNull
    @Size(max = 9)
    private String InAcctId;

    @FormParam("InAcctType")
    @NotNull
    @Size(max = 6)
    private String InAcctType;

    @FormParam("RetUrl")
    @PnRReturnURL
    private String RetUrl;

    @FormParam("BgRetUrl")
    @NotNull
    @PnRReturnURL
    private String BgRetUrl;

    public UsrAcctPayResponse() {
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
        sb.append(StringUtils.trimToEmpty(getCmdId().name()))
                .append(StringUtils.trimToEmpty(getRespCode()))
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
