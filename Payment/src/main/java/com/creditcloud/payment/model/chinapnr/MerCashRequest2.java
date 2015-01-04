/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr;

import com.creditcloud.payment.model.PnRConstant;
import com.creditcloud.payment.model.chinapnr.base.BaseRequest;
import com.creditcloud.payment.model.chinapnr.enums.CmdIdType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.commons.lang3.StringUtils;

/**
 * 对应汇付2.0版本
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class MerCashRequest2 extends BaseRequest {

    @NotNull
    @Size(max = 20)
    private String OrdId;

    @NotNull
    @Size(max = 16)
    private String UsrCustId;

    @NotNull
    @Size(max = 14)
    private String TransAmt;

    @Size(max = 14)
    private String ServFee;

    @Size(max = 14)
    private String ServFeeAcctId;

    @Size(max = 128)
    private String RetUrl;

    @NotNull
    @Size(max = 128)
    private String BgRetUrl;

    @Size(max = 128)
    private String Remark;

    private String CharSet;

    @Size(max = 512)
    private String ReqExt;

    @Size(min = 1, max = 1)
    private String FeeObjFlag;

    @Size(min = 1, max = 1)
    private String FeeAcctId;

    public MerCashRequest2(String MerCustId,
                           String OrdId,
                           String UsrCustId,
                           String TransAmt,
                           String ServFee,
                           String ServFeeAcctId,
                           String RetUrl,
                           String BgRetUrl,
                           String Remark,
                           String FeeObjFlag,
                           String FeeAcctId) {
        super(PnRConstant.Version_2, CmdIdType.Cash, MerCustId);
        this.OrdId = OrdId;
        this.UsrCustId = UsrCustId;
        this.TransAmt = TransAmt;
        this.ServFee = ServFee;
        this.ServFeeAcctId = ServFeeAcctId;
        this.RetUrl = RetUrl;
        this.BgRetUrl = BgRetUrl;
        this.Remark = Remark;
        this.FeeObjFlag = FeeObjFlag;
        this.FeeAcctId = FeeAcctId;
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder(baseChkString());
        sb.append(StringUtils.trimToEmpty(getOrdId()))
                .append(StringUtils.trimToEmpty(getUsrCustId()))
                .append(StringUtils.trimToEmpty(getTransAmt()))
                .append(StringUtils.trimToEmpty(getServFee()))
                .append(StringUtils.trimToEmpty(getServFeeAcctId()))
                .append(StringUtils.trimToEmpty(getRetUrl()))
                .append(StringUtils.trimToEmpty(getBgRetUrl()))
                .append(StringUtils.trimToEmpty(getRemark()))
                .append(StringUtils.trimToEmpty(getMerPriv()))
                .append(StringUtils.trimToEmpty(getReqExt()));
        return sb.toString();
    }

}
