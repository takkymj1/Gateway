/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr;

import com.creditcloud.payment.model.PnRConstant;
import com.creditcloud.payment.model.chinapnr.base.BaseRequest;
import com.creditcloud.payment.model.chinapnr.constraint.PnRReturnURL;
import com.creditcloud.payment.model.chinapnr.enums.CmdIdType;
import com.creditcloud.payment.model.chinapnr.constraint.PnRDate;
import com.creditcloud.payment.model.chinapnr.constraint.PnRDateAndTime;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.apache.commons.lang3.StringUtils;

/**
 * 系统发标时，在汇付进行一次标的信息录入
 *
 * @author chaishufan
 */
public class PaymentTenderRequest extends BaseRequest {

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
     * 年利率
     */
    @NotNull
    @Size(max = 14)
    private String YearRate;
    
    /**
     * 还款方式
     */
    @NotNull
    @Size(min = 2, max = 2)
    private String RetType;
    
    /**
     * 投标开始时间
     */
    @NotNull
    @PnRDateAndTime
    private String BidStartDate;
    
    /**
     * 投标截止时间
     */
    @NotNull
    @PnRDateAndTime
    private String BidEndDate;
    
    /**
     * 应还款总金额
     */
    @NotNull
    @Size(max = 14)
    private String RetAmt;
    
    /**
     * 应还款日期
     */
    @NotNull
    @PnRDate
    private String RetDate;

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
     * 入参扩展域
     */
    @Size(max = 512)
    private String ReqExt;
    
    public PaymentTenderRequest() {
    }

    public PaymentTenderRequest(String MerCustId,
                                String ProId, 
                                String BorrCustId, 
                                String BorrTotAmt, 
                                String YearRate, 
                                String RetType, 
                                String BidStartDate, 
                                String BidEndDate, 
                                String RetAmt, 
                                String RetDate, 
                                String GuarCompId, 
                                String GuarAmt, 
                                String ProArea, 
                                String BgRetUrl, 
                                String ReqExt) {
        super(PnRConstant.Version, CmdIdType.AddBidInfo, MerCustId);
        this.ProId = ProId;
        this.BorrCustId = BorrCustId;
        this.BorrTotAmt = BorrTotAmt;
        this.YearRate = YearRate;
        this.RetType = RetType;
        this.BidStartDate = BidStartDate;
        this.BidEndDate = BidEndDate;
        this.RetAmt = RetAmt;
        this.RetDate = RetDate;
        this.GuarCompId = GuarCompId;
        this.GuarAmt = GuarAmt;
        this.ProArea = ProArea;
        this.BgRetUrl = BgRetUrl;
        this.ReqExt = ReqExt;
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder(baseChkString());
        sb.append(StringUtils.trimToEmpty(getProId()))
                .append(StringUtils.trimToEmpty(getBorrCustId()))
                .append(StringUtils.trimToEmpty(getBorrTotAmt()))
                .append(StringUtils.trimToEmpty(getYearRate()))
                .append(StringUtils.trimToEmpty(getRetType()))
                .append(StringUtils.trimToEmpty(getBidStartDate()))
                .append(StringUtils.trimToEmpty(getBidEndDate()))
                .append(StringUtils.trimToEmpty(getRetAmt()))
                .append(StringUtils.trimToEmpty(getRetDate()))
                .append(StringUtils.trimToEmpty(getGuarCompId()))
                .append(StringUtils.trimToEmpty(getGuarAmt()))
                .append(StringUtils.trimToEmpty(getProArea()))
                .append(StringUtils.trimToEmpty(getBgRetUrl()))
                .append(StringUtils.trimToEmpty(getMerPriv()))
                .append(StringUtils.trimToEmpty(getReqExt()));
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

    public String getYearRate() {
        return YearRate;
    }

    public void setYearRate(String YearRate) {
        this.YearRate = YearRate;
    }

    public String getRetType() {
        return RetType;
    }

    public void setRetType(String RetType) {
        this.RetType = RetType;
    }

    public String getBidStartDate() {
        return BidStartDate;
    }

    public void setBidStartDate(String BidStartDate) {
        this.BidStartDate = BidStartDate;
    }

    public String getBidEndDate() {
        return BidEndDate;
    }

    public void setBidEndDate(String BidEndDate) {
        this.BidEndDate = BidEndDate;
    }

    public String getRetAmt() {
        return RetAmt;
    }

    public void setRetAmt(String RetAmt) {
        this.RetAmt = RetAmt;
    }

    public String getRetDate() {
        return RetDate;
    }

    public void setRetDate(String RetDate) {
        this.RetDate = RetDate;
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
    
    public String getReqExt() {
        return ReqExt;
    }

    public void setReqExt(String ReqExt) {
        this.ReqExt = ReqExt;
    }
}
