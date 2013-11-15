/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.transfer;

import com.creditcloud.payment.model.chinapnr.base.BaseResponse;
import com.creditcloud.payment.model.chinapnr.enums.CmdIdType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.apache.commons.lang3.StringUtils;

/**
 * 自动扣款(还款)
 *
 * @author rooseek
 */
public class RepaymentResponse extends BaseResponse {

    @NotNull
    @Size(max = 20)
    private String OrdId;

    @NotNull
    @Size(min = 8, max = 8)
    private String OrdDate;

    @NotNull
    @Size(max = 16)
    private String OutCustId;

    @NotNull
    @Size(max = 20)
    private String SubOrdId;

    @NotNull
    @Size(min = 8, max = 8)
    private String SubOrdDate;

    @Size(max = 9)
    private String OutAcctId;

    @NotNull
    @Size(max = 14)
    private String TransAmt;

    @NotNull
    @Size(max = 12)
    private String Fee;

    @NotNull
    @Size(max = 16)
    private String InCustId;

    @Size(max = 9)
    private String InAcctId;

    @NotNull
    @Size(max = 128)
    private String BgRetUrl;

    public RepaymentResponse() {
    }

    public String getOrdId() {
        return OrdId;
    }

    public String getOrdDate() {
        return OrdDate;
    }

    public String getOutCustId() {
        return OutCustId;
    }

    public String getSubOrdId() {
        return SubOrdId;
    }

    public String getSubOrdDate() {
        return SubOrdDate;
    }

    public String getOutAcctId() {
        return OutAcctId;
    }

    public String getTransAmt() {
        return TransAmt;
    }

    public String getFee() {
        return Fee;
    }

    public String getInCustId() {
        return InCustId;
    }

    public String getInAcctId() {
        return InAcctId;
    }

    public String getBgRetUrl() {
        return BgRetUrl;
    }

    public void setOrdId(String OrdId) {
        this.OrdId = OrdId;
    }

    public void setOrdDate(String OrdDate) {
        this.OrdDate = OrdDate;
    }

    public void setOutCustId(String OutCustId) {
        this.OutCustId = OutCustId;
    }

    public void setSubOrdId(String SubOrdId) {
        this.SubOrdId = SubOrdId;
    }

    public void setSubOrdDate(String SubOrdDate) {
        this.SubOrdDate = SubOrdDate;
    }

    public void setOutAcctId(String OutAcctId) {
        this.OutAcctId = OutAcctId;
    }

    public void setTransAmt(String TransAmt) {
        this.TransAmt = TransAmt;
    }

    public void setFee(String Fee) {
        this.Fee = Fee;
    }

    public void setInCustId(String InCustId) {
        this.InCustId = InCustId;
    }

    public void setInAcctId(String InAcctId) {
        this.InAcctId = InAcctId;
    }

    public void setBgRetUrl(String BgRetUrl) {
        this.BgRetUrl = BgRetUrl;
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder(baseChkString());
        sb.append(StringUtils.trimToEmpty(getOrdId()))
                .append(StringUtils.trimToEmpty(getOrdDate()))
                .append(StringUtils.trimToEmpty(getOutCustId()))
                .append(StringUtils.trimToEmpty(getSubOrdId()))
                .append(StringUtils.trimToEmpty(getSubOrdDate()))
                .append(StringUtils.trimToEmpty(getOutAcctId()))
                .append(StringUtils.trimToEmpty(getTransAmt()))
                .append(StringUtils.trimToEmpty(getFee()))
                .append(StringUtils.trimToEmpty(getInCustId()))
                .append(StringUtils.trimToEmpty(getInAcctId()))
                .append(StringUtils.trimToEmpty(getBgRetUrl()))
                .append(StringUtils.trimToEmpty(getMerPriv()));
        return sb.toString();
    }
}
