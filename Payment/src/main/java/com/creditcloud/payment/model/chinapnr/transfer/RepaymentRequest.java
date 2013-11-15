/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.transfer;

import com.creditcloud.payment.model.chinapnr.PnRConstant;
import com.creditcloud.payment.model.chinapnr.base.BaseRequest;
import com.creditcloud.payment.model.chinapnr.enums.CmdIdType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.apache.commons.lang3.StringUtils;

/**
 * 自动扣款(还款)
 *
 * @author rooseek
 */
public class RepaymentRequest extends BaseRequest {

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

    private String DivDetails;

    @NotNull
    @Size(max = 128)
    private String BgRetUrl;

    public RepaymentRequest() {
    }

    public RepaymentRequest(String MerCustId,
                            String OrdId,
                            String OrdDate,
                            String OutCustId,
                            String SubOrdId,
                            String SubOrdDate,
                            String OutAcctId,
                            String TransAmt,
                            String Fee,
                            String InCustId,
                            String InAcctId,
                            String DivDetails,
                            String BgRetUrl) {
        super(PnRConstant.Version, CmdIdType.Repayment, MerCustId);
        this.OrdId = OrdId;
        this.OrdDate = OrdDate;
        this.OutCustId = OutCustId;
        this.SubOrdId = SubOrdId;
        this.SubOrdDate = SubOrdDate;
        this.OutAcctId = OutAcctId;
        this.TransAmt = TransAmt;
        this.Fee = Fee;
        this.InCustId = InCustId;
        this.InAcctId = InAcctId;
        this.DivDetails = DivDetails;
        this.BgRetUrl = BgRetUrl;
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

    public void setDivDetails(String DivDetails) {
        this.DivDetails = DivDetails;
    }

    public void setBgRetUrl(String BgRetUrl) {
        this.BgRetUrl = BgRetUrl;
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

    public String getDivDetails() {
        return DivDetails;
    }

    public String getBgRetUrl() {
        return BgRetUrl;
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
                .append(StringUtils.trimToEmpty(getDivDetails()))
                .append(StringUtils.trimToEmpty(getBgRetUrl()))
                .append(StringUtils.trimToEmpty(getMerPriv()));
        return sb.toString();
    }
}
