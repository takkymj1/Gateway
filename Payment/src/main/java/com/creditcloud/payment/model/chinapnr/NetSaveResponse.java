/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
 * @author sobranie
 */
public class NetSaveResponse extends BaseResponse {

    @FormParam("UsrCustId")
    @NotNull
    @Size(max = 16)
    private String UsrCustId;

    @FormParam("OrdId")
    @NotNull
    @Size(max = 20)
    private String OrdId;

    @FormParam("OrdDate")
    @NotNull
    @Size(min = 8, max = 8)
    private String OrdDate;

    @FormParam("TransAmt")
    @NotNull
    private String TransAmt;

    @FormParam("TrxId")
    @Size(min = 6, max = 25)
    private String TrxId;

    @FormParam("RetUrl")
    private String RetUrl;

    @FormParam("BgRetUrl")
    @NotNull
    private String BgRetUrl;
    
    /**
     * 真实收取的手续费
     */
    @FormParam("FeeAmt")
    @NotNull
    private String FeeAmt;
    
    /**
     * 收取手续费的账号
     */
    @FormParam("FeeCustId")
    @NotNull
    @Size(max = 16)
    private String FeeCustId;
    
    @FormParam("FeeAcctId")
    @NotNull
    @Size(max = 9)
    private String FeeAcctId;

    public NetSaveResponse() {
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder(baseChkString());
        sb.append(StringUtils.trimToEmpty(getUsrCustId()))
                .append(StringUtils.trimToEmpty(getOrdId()))
                .append(StringUtils.trimToEmpty(getOrdDate()))
                .append(StringUtils.trimToEmpty(getTransAmt()))
                .append(StringUtils.trimToEmpty(getTrxId()))
                .append(StringUtils.trimToEmpty(getRetUrl()))
                .append(StringUtils.trimToEmpty(getBgRetUrl()))
                .append(StringUtils.trimToEmpty(getMerPriv()));
        return sb.toString();
    }

    public String getUsrCustId() {
        return UsrCustId;
    }

    public void setUsrCustId(String UsrCustId) {
        this.UsrCustId = UsrCustId;
    }

    public String getOrdId() {
        return OrdId;
    }

    public void setOrdId(String OrdId) {
        this.OrdId = OrdId;
    }

    public String getOrdDate() {
        return OrdDate;
    }

    public void setOrdDate(String OrdDate) {
        this.OrdDate = OrdDate;
    }

    public String getTransAmt() {
        return TransAmt;
    }

    public void setTransAmt(String TransAmt) {
        this.TransAmt = TransAmt;
    }

    public String getTrxId() {
        return TrxId;
    }

    public void setTrxId(String TrxId) {
        this.TrxId = TrxId;
    }

    public String getRetUrl() {
        return RetUrl;
    }

    public void setRetUrl(String RetUrl) {
        this.RetUrl = RetUrl;
    }

    public String getBgRetUrl() {
        return BgRetUrl;
    }

    public void setBgRetUrl(String BgRetUrl) {
        this.BgRetUrl = BgRetUrl;
    }

    public String getFeeAmt() {
        return FeeAmt;
    }

    public void setFeeAmt(String FeeAmt) {
        this.FeeAmt = FeeAmt;
    }

    public String getFeeCustId() {
        return FeeCustId;
    }

    public void setFeeCustId(String FeeCustId) {
        this.FeeCustId = FeeCustId;
    }

    public String getFeeAcctId() {
        return FeeAcctId;
    }

    public void setFeeAcctId(String FeeAcctId) {
        this.FeeAcctId = FeeAcctId;
    }

}
