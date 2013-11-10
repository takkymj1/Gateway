/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr;

import com.creditcloud.payment.model.chinapnr.base.BaseResponse;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;
import org.apache.commons.lang3.StringUtils;

/**
 * 自动投标计划
 *
 * @author rooseek
 */
public class AutoTenderPlanResponse extends BaseResponse {

    @FormParam("UsrCustId")
    @NotNull
    @Size(max = 16)
    private String UsrCustId;

    @FormParam("RetUrl")
    @Size(max = 128)
    private String RetUrl;

    @NotNull
    @FormParam("TenderPlanType")
    private String TenderPlanType;

    @FormParam("TransAmt")
    private String TransAmt;

    public AutoTenderPlanResponse() {
    }

    public String getUsrCustId() {
        return UsrCustId;
    }

    public String getRetUrl() {
        return RetUrl;
    }

    public String getTenderPlanType() {
        return TenderPlanType;
    }

    public String getTransAmt() {
        return TransAmt;
    }

    public void setUsrCustId(String UsrCustId) {
        this.UsrCustId = UsrCustId;
    }

    public void setRetUrl(String RetUrl) {
        this.RetUrl = RetUrl;
    }

    public void setTenderPlanType(String TenderPlanType) {
        this.TenderPlanType = TenderPlanType;
    }

    public void setTransAmt(String TransAmt) {
        this.TransAmt = TransAmt;
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder(baseChkString()).
                append(getUsrCustId()).
                append(getTenderPlanType()).
                append(StringUtils.trimToEmpty(getTransAmt())).
                append(StringUtils.trimToEmpty(getRetUrl())).
                append(StringUtils.trimToEmpty(getMerPriv()));
        return sb.toString();
    }
}
