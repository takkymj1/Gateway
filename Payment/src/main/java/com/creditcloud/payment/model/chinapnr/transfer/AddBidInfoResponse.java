/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
 * @author kakaci
 */
@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class AddBidInfoResponse extends BaseResponse {

    @FormParam("ProId")
    @NotNull
    @Size(max = 16)
    private String ProId;

    @FormParam("BorrCustId")
    @NotNull
    @Size(max = 16)
    private String BorrCustId;

    @FormParam("BorrTotAmt")
    @NotNull
    @Size(max = 14)
    private String BorrTotAmt;

    @FormParam("GuarCompId")
    @Size(max = 16)
    private String GuarCompId;

    @FormParam("GuarAmt")
    @Size(max = 14)
    private String GuarAmt;

    @FormParam("ProArea")
    @NotNull
    @Size(max = 4)
    private String ProArea;

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
        sb.append(StringUtils.trimToEmpty(this.getProId()))
                .append(StringUtils.trimToEmpty(this.getBorrCustId()))
                .append(StringUtils.trimToEmpty(this.getBorrTotAmt()))
                .append(StringUtils.trimToEmpty(this.getGuarCompId()))
                .append(StringUtils.trimToEmpty(this.getGuarAmt()))
                .append(StringUtils.trimToEmpty(this.getProArea()))
                .append(StringUtils.trimToEmpty(this.getBgRetUrl()))
                .append(StringUtils.trimToEmpty(this.getMerPriv()))
                .append(StringUtils.trimToEmpty(this.getRespExt()));
        return sb.toString();
    }
}
