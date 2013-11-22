/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.transfer;

import com.creditcloud.payment.model.PnRConstant;
import com.creditcloud.payment.model.chinapnr.base.BaseRequest;
import com.creditcloud.payment.model.chinapnr.constraint.PnRDate;
import com.creditcloud.payment.model.chinapnr.enums.CmdIdType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.apache.commons.lang3.StringUtils;

/**
 * 自动扣款(放款)
 *
 * @author rooseek
 */
public class LoansRequest extends BaseRequest {

    @NotNull
    @Size(max = 20)
    private String OrdId;

    @NotNull
    @PnRDate
    private String OrdDate;

    @NotNull
    @Size(max = 16)
    private String OutCustId;

    /**
     * 不能为零
     */
    @NotNull
    @Size(max = 14)
    private String TransAmt;

    @NotNull
    @Size(max = 12)
    private String Fee;

    @NotNull
    @Size(max = 20)
    private String SubOrdId;

    @NotNull
    @PnRDate
    private String SubOrdDate;

    @NotNull
    @Size(max = 16)
    private String InCustId;

    private String DivDetails;

    @NotNull
    @Size(min = 1, max = 1)
    private String IsDefault;

    @NotNull
    @Size(max = 128)
    private String BgRetUrl;

    public LoansRequest() {
    }

    public LoansRequest(String MerCustId,
                        String OrdId,
                        String OrdDate,
                        String OutCustId,
                        String TransAmt,
                        String Fee,
                        String SubOrdId,
                        String SubOrdDate,
                        String InCustId,
                        String DivDetails,
                        String IsDefault,
                        String BgRetUrl) {
        super(PnRConstant.Version, CmdIdType.Loans, MerCustId);
        this.OrdId = OrdId;
        this.OrdDate = OrdDate;
        this.OutCustId = OutCustId;
        this.TransAmt = TransAmt;
        this.Fee = Fee;
        this.SubOrdId = SubOrdId;
        this.SubOrdDate = SubOrdDate;
        this.InCustId = InCustId;
        this.DivDetails = DivDetails;
        this.IsDefault = IsDefault;
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

    public String getTransAmt() {
        return TransAmt;
    }

    public String getFee() {
        return Fee;
    }

    public String getSubOrdId() {
        return SubOrdId;
    }

    public String getSubOrdDate() {
        return SubOrdDate;
    }

    public String getInCustId() {
        return InCustId;
    }

    public String getDivDetails() {
        return DivDetails;
    }

    public String getIsDefault() {
        return IsDefault;
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

    public void setTransAmt(String TransAmt) {
        this.TransAmt = TransAmt;
    }

    public void setFee(String Fee) {
        this.Fee = Fee;
    }

    public void setSubOrdId(String SubOrdId) {
        this.SubOrdId = SubOrdId;
    }

    public void setSubOrdDate(String SubOrdDate) {
        this.SubOrdDate = SubOrdDate;
    }

    public void setInCustId(String InCustId) {
        this.InCustId = InCustId;
    }

    public void setDivDetails(String DivDetails) {
        this.DivDetails = DivDetails;
    }

    public void setIsDefault(String IsDefault) {
        this.IsDefault = IsDefault;
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
                .append(StringUtils.trimToEmpty(getTransAmt()))
                .append(StringUtils.trimToEmpty(getFee()))
                .append(StringUtils.trimToEmpty(getSubOrdId()))
                .append(StringUtils.trimToEmpty(getSubOrdDate()))
                .append(StringUtils.trimToEmpty(getInCustId()))
                .append(StringUtils.trimToEmpty(getDivDetails()))
                .append(StringUtils.trimToEmpty(getIsDefault()))
                .append(StringUtils.trimToEmpty(getBgRetUrl()))
                .append(StringUtils.trimToEmpty(getMerPriv()));

        return sb.toString();
    }
}
