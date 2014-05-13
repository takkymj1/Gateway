/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.transfer;

import com.creditcloud.payment.model.chinapnr.base.BaseResponse;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;
import lombok.ToString;
import org.apache.commons.lang3.StringUtils;

/**
 * 自动扣款转账(商户用)
 *
 * @author rooseek
 */
@ToString(callSuper = true)
public class TransferResponse extends BaseResponse {

    @FormParam("OrdId")
    @NotNull
    @Size(max = 20)
    private String OrdId;

    @FormParam("OutCustId")
    @NotNull
    @Size(max = 16)
    private String OutCustId;

    @FormParam("OutAcctId")
    @NotNull
    @Size(max = 9)
    private String OutAcctId;

    @FormParam("TransAmt")
    @NotNull
    @Size(max = 14)
    private String TransAmt;

    @FormParam("InCustId")
    @NotNull
    @Size(max = 16)
    private String InCustId;

    @FormParam("InAcctId")
    @Size(max = 9)
    private String InAcctId;

    @FormParam("RetUrl")
    @Size(max = 128)
    private String RetUrl;

    @FormParam("BgRetUrl")
    @NotNull
    @Size(max = 128)
    private String BgRetUrl;

    public TransferResponse() {
    }

    public String getOrdId() {
        return OrdId;
    }

    public String getOutCustId() {
        return OutCustId;
    }

    public String getOutAcctId() {
        return OutAcctId;
    }

    public String getTransAmt() {
        return TransAmt;
    }

    public String getInCustId() {
        return InCustId;
    }

    public String getInAcctId() {
        return InAcctId;
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

    public void setOutCustId(String OutCustId) {
        this.OutCustId = OutCustId;
    }

    public void setOutAcctId(String OutAcctId) {
        this.OutAcctId = OutAcctId;
    }

    public void setTransAmt(String TransAmt) {
        this.TransAmt = TransAmt;
    }

    public void setInCustId(String InCustId) {
        this.InCustId = InCustId;
    }

    public void setInAcctId(String InAcctId) {
        this.InAcctId = InAcctId;
    }

    public void setRetUrl(String RetUrl) {
        this.RetUrl = RetUrl;
    }

    public void setBgRetUrl(String BgRetUrl) {
        this.BgRetUrl = BgRetUrl;
    }

    @Override
    public String getMerCustId() {
        return OutCustId;
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder()
                .append(StringUtils.trimToEmpty(getCmdId().name()))
                .append(StringUtils.trimToEmpty(getRespCode()))
                .append(StringUtils.trimToEmpty(getOrdId()))
                .append(StringUtils.trimToEmpty(getOutCustId()))
                .append(StringUtils.trimToEmpty(getOutAcctId()))
                .append(StringUtils.trimToEmpty(getTransAmt()))
                .append(StringUtils.trimToEmpty(getInCustId()))
                .append(StringUtils.trimToEmpty(getInAcctId()))
                .append(StringUtils.trimToEmpty(getRetUrl()))
                .append(StringUtils.trimToEmpty(getBgRetUrl()))
                .append(StringUtils.trimToEmpty(getMerPriv()));

        return sb.toString();
    }
}
