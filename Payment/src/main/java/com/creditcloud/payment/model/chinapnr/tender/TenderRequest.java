/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.tender;

import com.creditcloud.model.constraints.PNRReturnURL;
import com.creditcloud.payment.model.chinapnr.PnRConstant;
import com.creditcloud.payment.model.chinapnr.base.BaseRequest;
import com.creditcloud.payment.model.chinapnr.enums.CmdIdType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.apache.commons.lang3.StringUtils;

/**
 * 主动/自动投标request
 *
 * @author rooseek
 */
public class TenderRequest extends BaseRequest {

    @NotNull
    @Size(max = 20)
    private String OrdId;

    @NotNull
    @Size(min = 8, max = 8)
    private String OrdDate;

    @NotNull
    @Size(max = 14)
    private String TransAmt;

    @NotNull
    @Size(max = 16)
    private String UsrCustId;

    @NotNull
    @Size(max = 6)
    private String MaxTenderRate;

    @NotNull
    private String BorrowerDetails;

    @PNRReturnURL
    @Size(max = 128)
    private String RetUrl;

    @NotNull
    @PNRReturnURL
    @Size(max = 128)
    private String BgRetUrl;

    public TenderRequest() {
    }

    public TenderRequest(CmdIdType CmdId,
                         String MerCustId,
                         String OrdId,
                         String OrdDate,
                         String TransAmt,
                         String UsrCustId,
                         String MaxTenderRate,
                         String BorrowerDetails,
                         String RetUrl,
                         String BgRetUrl) {
        super(PnRConstant.Version, CmdId, MerCustId);
        this.OrdId = OrdId;
        this.OrdDate = OrdDate;
        this.TransAmt = TransAmt;
        this.UsrCustId = UsrCustId;
        this.MaxTenderRate = MaxTenderRate;
        this.BorrowerDetails = BorrowerDetails;
        this.RetUrl = RetUrl;
        this.BgRetUrl = BgRetUrl;
    }

    public String getOrdId() {
        return OrdId;
    }

    public String getOrdDate() {
        return OrdDate;
    }

    public String getTransAmt() {
        return TransAmt;
    }

    public String getUsrCustId() {
        return UsrCustId;
    }

    public String getMaxTenderRate() {
        return MaxTenderRate;
    }

    public String getBorrowerDetails() {
        return BorrowerDetails;
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

    public void setOrdDate(String OrdDate) {
        this.OrdDate = OrdDate;
    }

    public void setTransAmt(String TransAmt) {
        this.TransAmt = TransAmt;
    }

    public void setUsrCustId(String UsrCustId) {
        this.UsrCustId = UsrCustId;
    }

    public void setMaxTenderRate(String MaxTenderRate) {
        this.MaxTenderRate = MaxTenderRate;
    }

    public void setBorrowerDetails(String BorrowerDetails) {
        this.BorrowerDetails = BorrowerDetails;
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
                .append(StringUtils.trimToEmpty(getOrdDate()))
                .append(StringUtils.trimToEmpty(getTransAmt()))
                .append(StringUtils.trimToEmpty(getUsrCustId()))
                .append(StringUtils.trimToEmpty(getMaxTenderRate()))
                .append(StringUtils.trimToEmpty(getBorrowerDetails()))
                .append(StringUtils.trimToEmpty(getRetUrl()))
                .append(StringUtils.trimToEmpty(getBgRetUrl()))
                .append(StringUtils.trimToEmpty(getMerPriv()));
        return sb.toString();
    }
}
