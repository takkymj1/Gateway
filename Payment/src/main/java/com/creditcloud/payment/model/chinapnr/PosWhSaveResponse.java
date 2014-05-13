/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr;

import com.creditcloud.payment.model.chinapnr.base.UserResponse;
import com.creditcloud.payment.model.chinapnr.constraint.PnRDate;
import com.creditcloud.payment.model.chinapnr.constraint.PnRReturnURL;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.ToString;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author rooseek
 */
@ToString(callSuper = true)
public class PosWhSaveResponse extends UserResponse {

    @NotNull
    @Size(max = 40)
    private String OpenAcctId;

    @NotNull
    @Size(max = 14)
    private String TransAmt;

    @NotNull
    @Size(max = 20)
    private String OrdId;

    @NotNull
    @PnRDate
    @Size(min = 8, max = 8)
    private String OrdDate;

    @PnRDate
    @Size(min = 8, max = 8)
    private String CheckDate;

    @Size(min = 18, max = 18)
    private String TrxId;

    @PnRReturnURL
    @Size(max = 128)
    private String RetUrl;

    @NotNull
    @PnRReturnURL
    @Size(max = 128)
    private String BgRetUrl;

    public String getOpenAcctId() {
        return OpenAcctId;
    }

    public String getTransAmt() {
        return TransAmt;
    }

    public String getOrdId() {
        return OrdId;
    }

    public String getOrdDate() {
        return OrdDate;
    }

    public String getCheckDate() {
        return CheckDate;
    }

    public String getTrxId() {
        return TrxId;
    }

    public String getRetUrl() {
        return RetUrl;
    }

    public String getBgRetUrl() {
        return BgRetUrl;
    }

    public void setOpenAcctId(String OpenAcctId) {
        this.OpenAcctId = OpenAcctId;
    }

    public void setTransAmt(String TransAmt) {
        this.TransAmt = TransAmt;
    }

    public void setOrdId(String OrdId) {
        this.OrdId = OrdId;
    }

    public void setOrdDate(String OrdDate) {
        this.OrdDate = OrdDate;
    }

    public void setCheckDate(String CheckDate) {
        this.CheckDate = CheckDate;
    }

    public void setTrxId(String TrxId) {
        this.TrxId = TrxId;
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
        sb.append(StringUtils.trimToEmpty(getOpenAcctId()))
                .append(StringUtils.trimToEmpty(getTransAmt()))
                .append(StringUtils.trimToEmpty(getOrdId()))
                .append(StringUtils.trimToEmpty(getOrdDate()))
                .append(StringUtils.trimToEmpty(getCheckDate()))
                .append(StringUtils.trimToEmpty(getTrxId()))
                .append(StringUtils.trimToEmpty(getRetUrl()))
                .append(StringUtils.trimToEmpty(getBgRetUrl()))
                .append(StringUtils.trimToEmpty(getMerPriv()));

        return sb.toString();
    }
}
