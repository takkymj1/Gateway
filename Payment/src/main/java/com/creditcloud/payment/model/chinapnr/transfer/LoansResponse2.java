/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.transfer;

import com.creditcloud.payment.model.chinapnr.base.BaseResponse;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.commons.lang3.StringUtils;

/**
 * 对应汇付2.0接口
 *
 * @author rooseek
 */
@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class LoansResponse2 extends BaseResponse {

    @FormParam("OrdId")
    @NotNull
    @Size(max = 20)
    private String OrdId;

    @FormParam("OrdDate")
    @NotNull
    @Size(min = 8, max = 8)
    private String OrdDate;

    @FormParam("OutCustId")
    @NotNull
    @Size(max = 16)
    private String OutCustId;

    @FormParam("OutAcctId")
    @Size(max = 9)
    private String OutAcctId;

    @FormParam("TransAmt")
    @NotNull
    @Size(max = 14)
    private String TransAmt;

    @FormParam("Fee")
    @NotNull
    @Size(max = 12)
    private String Fee;

    @FormParam("InCustId")
    @NotNull
    @Size(max = 16)
    private String InCustId;

    @FormParam("InAcctId")
    @Size(max = 9)
    private String InAcctId;

    @FormParam("SubOrdId")
    @NotNull
    @Size(max = 20)
    private String SubOrdId;

    @FormParam("SubOrdDate")
    @NotNull
    @Size(min = 8, max = 8)
    private String SubOrdDate;

    @FormParam("FeeObjFlag")
    @NotNull
    @Size(min = 1, max = 1)
    private String FeeObjFlag;

    @FormParam("IsDefault")
    @NotNull
    @Size(min = 1, max = 1)
    private String IsDefault;

    @FormParam("IsUnFreeze")
    @NotNull
    @Size(min = 1, max = 1)
    private String IsUnFreeze;

    @FormParam("UnFreezeOrdId")
    @NotNull
    @Size(max = 20)
    private String UnFreezeOrdId;

    @FormParam("FreezeTrxId")
    @NotNull
    @Size(min = 18, max = 18)
    private String FreezeTrxId;

    @FormParam("BgRetUrl")
    @NotNull
    @Size(max = 128)
    private String BgRetUrl;

    @FormParam("RespExt")
    @Size(max = 512)
    private String RespExt;

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder(baseChkString());
        sb.append(StringUtils.trimToEmpty(getOrdId()))
                .append(StringUtils.trimToEmpty(getOrdDate()))
                .append(StringUtils.trimToEmpty(getOutCustId()))
                .append(StringUtils.trimToEmpty(getOutAcctId()))
                .append(StringUtils.trimToEmpty(getTransAmt()))
                .append(StringUtils.trimToEmpty(getFee()))
                .append(StringUtils.trimToEmpty(getInCustId()))
                .append(StringUtils.trimToEmpty(getInAcctId()))
                .append(StringUtils.trimToEmpty(getSubOrdId()))
                .append(StringUtils.trimToEmpty(getSubOrdDate()))
                .append(StringUtils.trimToEmpty(getFeeObjFlag()))
                .append(StringUtils.trimToEmpty(getIsDefault()))
                .append(StringUtils.trimToEmpty(getIsUnFreeze()))
                .append(StringUtils.trimToEmpty(getUnFreezeOrdId()))
                .append(StringUtils.trimToEmpty(getFreezeTrxId()))
                .append(StringUtils.trimToEmpty(getBgRetUrl()))
                .append(StringUtils.trimToEmpty(getMerPriv()))
                .append(StringUtils.trimToEmpty(getRespExt()));
        return sb.toString();
    }
}
