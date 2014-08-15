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
 *
 * @author rooseek
 */
@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class CreditAssignResponse extends BaseResponse {

    @FormParam("SellCustId")
    @NotNull
    @Size(max = 16)
    private String SellCustId;

    @FormParam("CreditAmt")
    @NotNull
    @Size(max = 14)
    private String CreditAmt;

    @FormParam("CreditDealAmt")
    @NotNull
    @Size(max = 14)
    private String CreditDealAmt;

    @FormParam("Fee")
    @NotNull
    @Size(max = 12)
    private String Fee;

    @FormParam("BuyCustId")
    @NotNull
    @Size(max = 16)
    private String BuyCustId;

    @FormParam("OrdId")
    @NotNull
    @Size(max = 20)
    private String OrdId;

    @FormParam("OrdDate")
    @NotNull
    @Size(max = 8)
    private String OrdDate;

    @FormParam("RetUrl")
    @Size(max = 128)
    private String RetUrl;

    @FormParam("BgRetUrl")
    @Size(max = 128)
    private String BgRetUrl;

    @FormParam("RespExt")
    @Size(max = 512)
    private String RespExt;

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder(baseChkString());
        sb.append(StringUtils.trimToEmpty(getSellCustId()))
                .append(StringUtils.trimToEmpty(getCreditAmt()))
                .append(StringUtils.trimToEmpty(getCreditDealAmt()))
                .append(StringUtils.trimToEmpty(getFee()))
                .append(StringUtils.trimToEmpty(getBuyCustId()))
                .append(StringUtils.trimToEmpty(getOrdId()))
                .append(StringUtils.trimToEmpty(getOrdDate()))
                .append(StringUtils.trimToEmpty(getRetUrl()))
                .append(StringUtils.trimToEmpty(getBgRetUrl()))
                .append(StringUtils.trimToEmpty(getMerPriv()))
                .append(StringUtils.trimToEmpty(getRespExt()));

        return sb.toString();
    }
}
