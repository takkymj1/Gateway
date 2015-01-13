/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model;

import java.math.BigDecimal;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 在汇付添加标的记录的返回结果
 *
 * @author chaishufan
 */
@XmlRootElement
public class PaymentTenderResult extends PaymentResult {

    private static final long serialVersionUID = 20131113L;

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
    private BigDecimal BorrTotAmt;

    /**
     * 担保公司 ID
     */
    @Size(max = 16)
    private String GuarCompId;
    
    /**
     * 担保金额
     */
    private BigDecimal GuarAmt;

    /**
     * 项目所在地(汇付P2P接口文档，附录8 地区代码号)
     */
    @NotNull
    @Size(min = 4, max = 4)
    private String ProArea;

    /**
     * 返参扩展域
     */
    @Size(max = 512)
    private String RespExt;

    public PaymentTenderResult() {
    }

    public PaymentTenderResult(String RespCode,
                               String RespDesc,
                               String ProId,
                               String BorrCustId,
                               BigDecimal BorrTotAmt,
                               String GuarCompId,
                               BigDecimal GuarAmt,
                               String ProArea,
                               String RespExt) {
        super(RespCode, RespDesc);
        this.ProId = ProId;
        this.BorrCustId = BorrCustId;
        this.BorrTotAmt = BorrTotAmt;
        this.GuarCompId = GuarCompId;
        this.GuarAmt = GuarAmt;
        this.ProArea = ProArea;
        this.RespExt = RespExt;
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

    public BigDecimal getBorrTotAmt() {
        return BorrTotAmt;
    }

    public void setBorrTotAmt(BigDecimal BorrTotAmt) {
        this.BorrTotAmt = BorrTotAmt;
    }

    public String getGuarCompId() {
        return GuarCompId;
    }

    public void setGuarCompId(String GuarCompId) {
        this.GuarCompId = GuarCompId;
    }

    public BigDecimal getGuarAmt() {
        return GuarAmt;
    }

    public void setGuarAmt(BigDecimal GuarAmt) {
        this.GuarAmt = GuarAmt;
    }

    public String getProArea() {
        return ProArea;
    }

    public void setProArea(String ProArea) {
        this.ProArea = ProArea;
    }

    public String getRespExt() {
        return RespExt;
    }

    public void setRespExt(String RespExt) {
        this.RespExt = RespExt;
    }

}
