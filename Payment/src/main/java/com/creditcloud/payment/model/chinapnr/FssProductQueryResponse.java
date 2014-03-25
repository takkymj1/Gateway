/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr;

import com.creditcloud.payment.model.chinapnr.base.BaseResponse;
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
public class FssProductQueryResponse extends BaseResponse {

    @FormParam("AnnuRate")
    String AnnuRate;

    @FormParam("PrdRate")
    String PrdRate;

    @FormParam("RespExt")
    String RespExt;

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder(baseChkString());
        sb.append(StringUtils.trimToEmpty(getAnnuRate()))
                .append(StringUtils.trimToEmpty(getPrdRate()))
                .append(StringUtils.trimToEmpty(getRespExt()));
        return sb.toString();
    }

}
