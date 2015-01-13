/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr;

import com.creditcloud.payment.model.chinapnr.base.BaseResponse;
import com.creditcloud.payment.model.chinapnr.constraint.PnRReturnURL;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.apache.commons.lang3.StringUtils;

/**
 * 系统发标时，在汇付进行一次标的信息录入时，汇付返回的信息
 *
 * @author chaishufan
 */
public class PaymentTenderResponse extends BaseResponse {

    /**
     * 项目ID
     */
    @NotNull
    @Size(max = 16)
    private String ProId;

    /**
     * 借款人ID
     */
    @NotNull
    @Size(max = 16)
    private String BorrCustId;

    /**
     * 借款总金额
     */
    @NotNull
    @Size(max = 14)
    private String BorrTotAmt;

    /**
     * 担保公司 ID
     */
    @Size(max = 16)
    private String GuarCompId;
    
    /**
     * 担保金额
     */
    @Size(max = 14)
    private String GuarAmt;

    /**
     * 项目所在地(汇付P2P接口文档，附录8 地区代码号)
     */
    @NotNull
    @Size(min = 4, max = 4)
    private String ProArea;

    /**
     * 商户后台应答地址
     */
    @NotNull
    @PnRReturnURL
    private String BgRetUrl;

    /**
     * 返参扩展域
     */
    @Size(max = 512)
    private String RespExt;
    
    public PaymentTenderResponse() {
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder(baseChkString());
        sb.append(StringUtils.trimToEmpty(getProId()))
                .append(StringUtils.trimToEmpty(getBorrCustId()))
                .append(StringUtils.trimToEmpty(getBorrTotAmt()))
                .append(StringUtils.trimToEmpty(getGuarCompId()))
                .append(StringUtils.trimToEmpty(getGuarAmt()))
                .append(StringUtils.trimToEmpty(getProArea()))
                .append(StringUtils.trimToEmpty(getBgRetUrl()))
                .append(StringUtils.trimToEmpty(getMerPriv()))
                .append(StringUtils.trimToEmpty(getRespExt()));
        return sb.toString();
    }

    public String getProId() {
        return ProId;
    }

    public void setProId(String ProId) {
        this.ProId = ProId;
    }

    public String getBorrCustId() {
        return BorrCustId;
    }

    public void setBorrCustId(String BorrCustId) {
        this.BorrCustId = BorrCustId;
    }

    public String getBorrTotAmt() {
        return BorrTotAmt;
    }

    public void setBorrTotAmt(String BorrTotAmt) {
        this.BorrTotAmt = BorrTotAmt;
    }

    public String getGuarCompId() {
        return GuarCompId;
    }

    public void setGuarCompId(String GuarCompId) {
        this.GuarCompId = GuarCompId;
    }

    public String getGuarAmt() {
        return GuarAmt;
    }

    public void setGuarAmt(String GuarAmt) {
        this.GuarAmt = GuarAmt;
    }

    public String getProArea() {
        return ProArea;
    }

    public void setProArea(String ProArea) {
        this.ProArea = ProArea;
    }

    public String getBgRetUrl() {
        return BgRetUrl;
    }

    public void setBgRetUrl(String BgRetUrl) {
        this.BgRetUrl = BgRetUrl;
    }

    public String getRespExt() {
        return RespExt;
    }

    public void setRespExt(String RespExt) {
        this.RespExt = RespExt;
    }
    
}
