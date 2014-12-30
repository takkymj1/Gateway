/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.transfer;

import com.creditcloud.payment.model.PnRConstant;
import com.creditcloud.payment.model.chinapnr.base.BaseRequest;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import com.creditcloud.payment.model.chinapnr.enums.CmdIdType;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author kakaci
 */
@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class BidInputRequest extends BaseRequest {

    @NotNull
    @Size(max = 16)
    private String ProId;

    @NotNull
    @Size(max = 16)
    private String BorrCustId;

    @NotNull
    @Size(max = 14)
    private String BorrTotAmt;

    @NotNull
    @Size(max = 14)
    private String YearRate;

    @NotNull
    @Size(max = 2)
    private String RetType;

    @NotNull
    @Size(max = 14)
    private String BidStartDate;

    @NotNull
    @Size(max = 14)
    private String BidEndDate;

    @NotNull
    @Size(max = 14)
    private String RetAmt;

    @NotNull
    @Size(max = 8)
    private String RetDate;

    @Size(max = 16)
    private String GuarCompId;

    @Size(max = 14)
    private String GuarAmt;

    @NotNull
    @Size(max = 4)
    private String ProArea;

    @NotNull
    @Size(max = 128)
    private String BgRetUrl;

    @Size(max = 512)
    private String ReqExt;

    public BidInputRequest(CmdIdType cmdIdType,
                           String MerCustId,
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
                           String MerPriv,
                           String ReqExt) {
        super(PnRConstant.Version, cmdIdType, MerCustId);
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
        this.BgRetUrl=BgRetUrl;
        this.ReqExt = ReqExt;
        this.setMerPriv(MerPriv);
    }

    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StringUtils.trimToEmpty(getVersion()));
        sb.append(StringUtils.trimToEmpty(getCmdId().name()));
        sb.append(StringUtils.trimToEmpty(getMerCustId()));
        sb.append(StringUtils.trimToEmpty(this.getProId()));
        sb.append(StringUtils.trimToEmpty(this.getBorrCustId()));
        sb.append(StringUtils.trimToEmpty(this.getBorrTotAmt()));
        sb.append(StringUtils.trimToEmpty(this.getYearRate()));
        sb.append(StringUtils.trimToEmpty(this.getRetType()));
        sb.append(StringUtils.trimToEmpty(this.getBidStartDate()));
        sb.append(StringUtils.trimToEmpty(this.getBidEndDate()));
        sb.append(StringUtils.trimToEmpty(this.getRetAmt()));
        sb.append(StringUtils.trimToEmpty(this.getRetDate()));
        sb.append(StringUtils.trimToEmpty(this.getGuarCompId()));
        sb.append(StringUtils.trimToEmpty(this.getGuarAmt()));
        sb.append(StringUtils.trimToEmpty(this.getProArea()));
        sb.append(StringUtils.trimToEmpty(this.getBgRetUrl()));
        sb.append(StringUtils.trimToEmpty(this.getMerPriv()));
        sb.append(StringUtils.trimToEmpty(this.getReqExt()));
        return sb.toString();
    }
}
