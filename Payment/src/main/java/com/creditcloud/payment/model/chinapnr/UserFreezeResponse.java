/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr;

import com.creditcloud.payment.model.chinapnr.base.UserResponse;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;

/**
 * 冻结用户资金的返回对象
 *
 * @author sobranie
 */
public class UserFreezeResponse extends UserResponse {

    @FormParam("SubAcctType")
    @Size(max = 9)
    private String SubAcctType;

    @FormParam("SubAcctId")
    @Size(max = 9)
    private String SubAcctId;

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

    @FormParam("RetUrl")
    private String RetUrl;

    @FormParam("BgRetUrl")
    @NotNull
    private String BgRetUrl;

    @FormParam("TrxId")
    private String TrxId;

    public UserFreezeResponse() {
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder(baseChkString());
        sb.append(getSubAcctType())
                .append(getSubAcctId())
                .append(getOrdId())
                .append(getOrdDate())
                .append(getTransAmt())
                .append(getRetUrl())
                .append(getBgRetUrl())
                .append(getTrxId())
                .append(getMerPriv());
        return sb.toString();
    }

    public String getSubAcctType() {
        return SubAcctType;
    }

    public void setSubAcctType(String SubAcctType) {
        this.SubAcctType = SubAcctType;
    }

    public String getSubAcctId() {
        return SubAcctId;
    }

    public void setSubAcctId(String SubAcctId) {
        this.SubAcctId = SubAcctId;
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

    public String getTrxId() {
        return TrxId;
    }

    public void setTrxId(String TrxId) {
        this.TrxId = TrxId;
    }

}
