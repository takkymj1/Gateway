/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.query;

import com.creditcloud.payment.model.chinapnr.base.BaseResponse;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author sobranie
 */
@Getter
@NoArgsConstructor
public class FssAccountQueryResponse extends BaseResponse {

    @FormParam("UsrCustId")
    @NotNull
    @Size(max = 16)
    private String UsrCustId;

    @FormParam("TotalAsset")
    private String TotalAsset;

    @FormParam("TotalProfit")
    private String TotalProfit;
    
    @FormParam("RespExt")
    private String RespExt;

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.baseChkString())
                .append(StringUtils.trimToEmpty(getUsrCustId()))
                .append(StringUtils.trimToEmpty(getTotalAsset()))
                .append(StringUtils.trimToEmpty(getTotalProfit()))
                .append(StringUtils.trimToEmpty(getRespExt()));
        return sb.toString();
    }

}
