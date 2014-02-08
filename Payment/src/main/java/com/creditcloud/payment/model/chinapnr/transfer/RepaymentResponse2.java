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
import org.apache.commons.lang3.StringUtils;

/**
 * 自动扣款(还款),汇付2.0接口
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
public class RepaymentResponse2 extends BaseResponse {

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

    @FormParam("SubOrdId")
    @NotNull
    @Size(max = 20)
    private String SubOrdId;

    @FormParam("SubOrdDate")
    @NotNull
    @Size(min = 8, max = 8)
    private String SubOrdDate;

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

    @Size(min = 1, max = 1)
    private String FeeObjFlag;

    @FormParam("BgRetUrl")
    @NotNull
    @Size(max = 128)
    private String BgRetUrl;

    @Size(max = 512)
    private String RespExt;

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder(baseChkString());
        sb.append(StringUtils.trimToEmpty(getOrdId()))
                .append(StringUtils.trimToEmpty(getOrdDate()))
                .append(StringUtils.trimToEmpty(getOutCustId()))
                .append(StringUtils.trimToEmpty(getSubOrdId()))
                .append(StringUtils.trimToEmpty(getSubOrdDate()))
                .append(StringUtils.trimToEmpty(getOutAcctId()))
                .append(StringUtils.trimToEmpty(getTransAmt()))
                .append(StringUtils.trimToEmpty(getFee()))
                .append(StringUtils.trimToEmpty(getInCustId()))
                .append(StringUtils.trimToEmpty(getInAcctId()))
                .append(StringUtils.trimToEmpty(getFeeObjFlag()))
                .append(StringUtils.trimToEmpty(getBgRetUrl()))
                .append(StringUtils.trimToEmpty(getMerPriv()))
                .append(StringUtils.trimToEmpty(getRespExt()));

        return sb.toString();
    }
}
