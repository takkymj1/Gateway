/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.query;

import com.creditcloud.payment.model.chinapnr.base.UserResponse;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
public class QueryTransDetailResponse extends UserResponse {

    @FormParam("OrdId")
    @NotNull
    @Size(max = 20)
    private String OrdId;

    @FormParam("OrdDate")
    @NotNull
    @Size(max = 8, min = 8)
    private String OrdDate;

    @FormParam("QueryTransType")
    @NotNull
    private String QueryTransType;

    @FormParam("TransAmt")
    @NotNull
    @Size(max = 14)
    private String TransAmt;

    @FormParam("TransStat")
    @NotNull
    @Size(max = 1, min = 1)
    private String TransStat;

    @FormParam("FeeAmt")
    @Size(max = 14)
    private String FeeAmt;

    @FormParam("FeeCustId")
    @Size(max = 16)
    private String FeeCustId;

    @FormParam("FeeAcctId")
    @Size(max = 9)
    private String FeeAcctId;

    @FormParam("GateBusiId")
    @Size(max = 6)
    private String GateBusiId;

    @FormParam("RespExt")
    @Size(max = 512)
    private String RespExt;

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder(super.baseChkString());
        sb.append(StringUtils.trimToEmpty(getOrdId())).
                append(StringUtils.trimToEmpty(getOrdDate())).
                append(StringUtils.trimToEmpty(getQueryTransType())).
                append(StringUtils.trimToEmpty(getTransAmt())).
                append(StringUtils.trimToEmpty(getTransStat())).
                append(StringUtils.trimToEmpty(getFeeAmt())).
                append(StringUtils.trimToEmpty(getFeeCustId())).
                append(StringUtils.trimToEmpty(getFeeAcctId())).
                append(StringUtils.trimToEmpty(getGateBusiId())).
                append(StringUtils.trimToEmpty(getRespExt()));
        return sb.toString();
    }

}
