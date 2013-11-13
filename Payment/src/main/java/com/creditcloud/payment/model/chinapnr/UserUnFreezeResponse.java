/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr;

import com.creditcloud.payment.model.chinapnr.base.BaseResponse;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author sobranie
 */
public class UserUnFreezeResponse extends BaseResponse {

    @NotNull
    @Size(max = 20)
    private String OrdId;

    @NotNull
    @Size(min = 8, max = 8)
    private String OrdDate;

    @NotNull
    @Size(min = 18, max = 18)
    private String TrxId;

    private String RetUrl;

    @NotNull
    private String BgRetUrl;

    public UserUnFreezeResponse() {
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder(baseChkString());
        sb.append(StringUtils.trimToEmpty(getOrdId()))
                .append(StringUtils.trimToEmpty(getOrdDate()))
                .append(StringUtils.trimToEmpty(getTrxId()))
                .append(StringUtils.trimToEmpty(getRetUrl()))
                .append(StringUtils.trimToEmpty(getBgRetUrl()))
                .append(StringUtils.trimToEmpty(getMerPriv()));
        return sb.toString();
    }

    /**
     * @return the OrdId
     */
    public String getOrdId() {
        return OrdId;
    }

    /**
     * @param OrdId the OrdId to set
     */
    public void setOrdId(String OrdId) {
        this.OrdId = OrdId;
    }

    /**
     * @return the OrdDate
     */
    public String getOrdDate() {
        return OrdDate;
    }

    /**
     * @param OrdDate the OrdDate to set
     */
    public void setOrdDate(String OrdDate) {
        this.OrdDate = OrdDate;
    }

    /**
     * @return the TrxId
     */
    public String getTrxId() {
        return TrxId;
    }

    /**
     * @param TrxId the TrxId to set
     */
    public void setTrxId(String TrxId) {
        this.TrxId = TrxId;
    }

    /**
     * @return the RetUrl
     */
    public String getRetUrl() {
        return RetUrl;
    }

    /**
     * @param RetUrl the RetUrl to set
     */
    public void setRetUrl(String RetUrl) {
        this.RetUrl = RetUrl;
    }

    /**
     * @return the BgRetUrl
     */
    public String getBgRetUrl() {
        return BgRetUrl;
    }

    /**
     * @param BgRetUrl the BgRetUrl to set
     */
    public void setBgRetUrl(String BgRetUrl) {
        this.BgRetUrl = BgRetUrl;
    }
}
