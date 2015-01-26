/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr;

import com.creditcloud.payment.model.chinapnr.base.BaseResponse;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author sobranie
 */
@Data
@ToString(callSuper = true)
public class NetSaveResponse extends BaseResponse {

    @FormParam("UsrCustId")
    @NotNull
    @Size(max = 16)
    private String UsrCustId;

    @FormParam("OrdId")
    @NotNull
    @Size(max = 20)
    private String OrdId;

    @FormParam("OrdDate")
    @NotNull
    @Size(min = 8, max = 8)
    private String OrdDate;

    @FormParam("TransAmt")
    @NotNull
    private String TransAmt;

    @FormParam("TrxId")
    @Size(min = 6, max = 25)
    private String TrxId;

    @FormParam("RetUrl")
    private String RetUrl;

    @FormParam("BgRetUrl")
    @NotNull
    private String BgRetUrl;

    @FormParam("GateBusiId")
    @Size(max = 6)
    private String GateBusiId;
    
    @FormParam("GateBankId")
    @Size(max = 8)
    private String GateBankId;

    /**
     * 真实收取的手续费
     */
    @FormParam("FeeAmt")
    @NotNull
    private String FeeAmt;

    /**
     * 收取手续费的账号
     */
    @FormParam("FeeCustId")
    @NotNull
    @Size(max = 16)
    private String FeeCustId;

    @FormParam("FeeAcctId")
    @NotNull
    @Size(max = 9)
    private String FeeAcctId;

    public NetSaveResponse() {
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder(baseChkString());
        sb.append(StringUtils.trimToEmpty(getUsrCustId()))
                .append(StringUtils.trimToEmpty(getOrdId()))
                .append(StringUtils.trimToEmpty(getOrdDate()))
                .append(StringUtils.trimToEmpty(getTransAmt()))
                .append(StringUtils.trimToEmpty(getTrxId()))
                .append(StringUtils.trimToEmpty(getRetUrl()))
                .append(StringUtils.trimToEmpty(getBgRetUrl()))
                .append(StringUtils.trimToEmpty(getMerPriv()));
        return sb.toString();
    }
}
