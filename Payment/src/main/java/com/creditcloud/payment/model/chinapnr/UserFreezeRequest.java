/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr;

import com.creditcloud.payment.model.chinapnr.base.UserRequest;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 因用户操作而发起的资金冻结
 *
 * @author sobranie
 */
public class UserFreezeRequest extends UserRequest {

    @Size(max = 9)
    private String SubAcctType;

    @Size(max = 9)
    private String SubAcctId;

    @NotNull
    @Size(max = 20)
    private String OrdId;

    @NotNull
    @Size(min = 8, max = 8)
    private String OrdDate;

    @NotNull
    private String TransAmt;

    private String RetUrl;

    @NotNull
    private String BgRetUrl;

    public UserFreezeRequest() {
    }

    public UserFreezeRequest(String MerCustId,
                             String UsrCustId,
                             String OrdId,
                             String OrdDate,
                             String TransAmt,
                             String BgRetUrl) {
        super(CmdIdType.UsrFreezeBg, MerCustId, UsrCustId);
        this.OrdId = OrdId;
        this.OrdDate = OrdDate;
        this.TransAmt = TransAmt;
        this.BgRetUrl = BgRetUrl;
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
}
