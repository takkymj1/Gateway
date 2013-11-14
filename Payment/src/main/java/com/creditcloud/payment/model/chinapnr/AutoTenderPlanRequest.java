/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr;

import com.creditcloud.model.constraints.PNRReturnURL;
import com.creditcloud.payment.model.chinapnr.base.UserRequest;
import com.creditcloud.payment.model.chinapnr.enums.CmdIdType;
import javax.validation.constraints.Size;
import org.apache.commons.lang3.StringUtils;

/**
 * 自动投标计划
 *
 * @author rooseek
 */
public class AutoTenderPlanRequest extends UserRequest {

    @PNRReturnURL
    @Size(max = 128)
    private String RetUrl;

    @Size(max = 14)
    private String TransAmt;

    public AutoTenderPlanRequest() {
    }

    public AutoTenderPlanRequest(String MerCustId,
                                 String UsrCustId,
                                 String RetUrl,
                                 String TransAmt) {
        super(CmdIdType.AutoTenderPlan, MerCustId, UsrCustId);
        this.RetUrl = RetUrl;
        this.TransAmt = TransAmt;
    }

    public void setRetUrl(String RetUrl) {
        this.RetUrl = RetUrl;
    }

    public void setTransAmt(String TransAmt) {
        this.TransAmt = TransAmt;
    }

    public String getRetUrl() {
        return RetUrl;
    }

    public String getTransAmt() {
        return TransAmt;
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder(baseChkString()).
                append(PnRConstant.TenderPlanType).
                append(StringUtils.trimToEmpty(getTransAmt())).
                append(StringUtils.trimToEmpty(getRetUrl())).
                append(StringUtils.trimToEmpty(getMerPriv()));
        return sb.toString();
    }
}
