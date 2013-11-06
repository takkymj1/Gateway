/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;
import org.apache.commons.lang3.StringUtils;

/**
 * 用户开户的响应，由页面Post构成
 *
 * @author sobranie
 */
public class UserRegisterResponse extends BaseResponse {

    @FormParam("UsrId")
    @NotNull
    private String UsrId;

    @FormParam("UsrCustId")
    @NotNull
    @Size(max = 16)
    private String UsrCustId;

    @FormParam("BgRetUrl")
    @NotNull
    private String BgRetUrl;

    @FormParam("TrxId")
    @Size(min = 18, max = 18)
    private String TrxId;

    @FormParam("RetUrl")
    @Size(max = 128)
    private String RetUrl;
    
    public UserRegisterResponse() {
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.baseChkString())
                .append(StringUtils.trimToEmpty(getUsrId()))
                .append(StringUtils.trimToEmpty(getUsrCustId()))
                .append(StringUtils.trimToEmpty(getBgRetUrl()))
                .append(StringUtils.trimToEmpty(getTrxId()))
                .append(StringUtils.trimToEmpty(getRetUrl()))
                .append(StringUtils.trimToEmpty(getMerPriv()));
        return sb.toString();
    }

    public String getUsrId() {
        return UsrId;
    }

    public void setUsrId(String UsrId) {
        this.UsrId = UsrId;
    }

    public String getUsrCustId() {
        return UsrCustId;
    }

    public void setUsrCustId(String UsrCustId) {
        this.UsrCustId = UsrCustId;
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

    public String getRetUrl() {
        return RetUrl;
    }

    public void setRetUrl(String RetUrl) {
        this.RetUrl = RetUrl;
    }

}
