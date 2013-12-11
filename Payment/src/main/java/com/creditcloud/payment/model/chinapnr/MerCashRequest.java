/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr;

import com.creditcloud.payment.model.PnRConstant;
import com.creditcloud.payment.model.chinapnr.base.BaseRequest;
import com.creditcloud.payment.model.chinapnr.enums.CmdIdType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author rooseek
 */
public class MerCashRequest extends BaseRequest {

    @NotNull
    @Size(max = 20)
    private String OrdId;

    @NotNull
    @Size(max = 16)
    private String UsrCustId;

    @NotNull
    @Size(max = 14)
    private String TransAmt;

    @Size(max = 128)
    private String RetUrl;

    @NotNull
    @Size(max = 128)
    private String BgRetUrl;

    @Size(max = 128)
    private String Remark;

    private String CharSet;

    public MerCashRequest() {
    }

    public MerCashRequest(String MerCustId,
                          String OrdId,
                          String UsrCustId,
                          String TransAmt,
                          String RetUrl,
                          String BgRetUrl,
                          String Remark) {
        super(PnRConstant.Version, CmdIdType.MerCash, MerCustId);
        this.OrdId = OrdId;
        this.UsrCustId = UsrCustId;
        this.TransAmt = TransAmt;
        this.RetUrl = RetUrl;
        this.BgRetUrl = BgRetUrl;
        this.Remark = Remark;
        this.CharSet = PnRConstant.CharSet;
    }

    public String getOrdId() {
        return OrdId;
    }

    public String getUsrCustId() {
        return UsrCustId;
    }

    public String getTransAmt() {
        return TransAmt;
    }

    public String getRetUrl() {
        return RetUrl;
    }

    public String getBgRetUrl() {
        return BgRetUrl;
    }

    public String getRemark() {
        return Remark;
    }

    public String getCharSet() {
        return CharSet;
    }

    public void setOrdId(String OrdId) {
        this.OrdId = OrdId;
    }

    public void setUsrCustId(String UsrCustId) {
        this.UsrCustId = UsrCustId;
    }

    public void setTransAmt(String TransAmt) {
        this.TransAmt = TransAmt;
    }

    public void setRetUrl(String RetUrl) {
        this.RetUrl = RetUrl;
    }

    public void setBgRetUrl(String BgRetUrl) {
        this.BgRetUrl = BgRetUrl;
    }

    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public void setCharSet(String CharSet) {
        this.CharSet = CharSet;
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder(baseChkString());
        sb.append(StringUtils.trimToEmpty(getOrdId()))
                .append(StringUtils.trimToEmpty(getUsrCustId()))
                .append(StringUtils.trimToEmpty(getTransAmt()))
                .append(StringUtils.trimToEmpty(getRetUrl()))
                .append(StringUtils.trimToEmpty(getBgRetUrl()))
                .append(StringUtils.trimToEmpty(getRemark()))
                .append(StringUtils.trimToEmpty(getMerPriv()));
        return sb.toString();
    }
}
