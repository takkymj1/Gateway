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
 * 用户开户的响应，由页面Post构成
 *
 * @author sobranie
 */
@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class UserRegisterResponse extends BaseResponse {

    @FormParam("UsrId")
    @NotNull
    private String UsrId;

    @FormParam("UsrCustId")
    @NotNull
    @Size(max = 16)
    private String UsrCustId;

    @FormParam("BgRetUrl")
    @NotNull
    private String BgRetUrl;

    @FormParam("TrxId")
    @Size(min = 18, max = 18)
    private String TrxId;

    @FormParam("RetUrl")
    @Size(max = 128)
    private String RetUrl;

    @FormParam("IdType")
    @Size(min = 2, max = 2)
    private String IdType;

    @FormParam("IdNo")
    @Size(max = 30)
    private String IdNo;

    @FormParam("UsrMp")
    @Size(max = 11)
    private String UsrMp;

    @FormParam("UsrEmail")
    @Size(max = 40)
    private String UsrEmail;
    
    @FormParam("UsrName")
    @Size(max = 40)
    private String UsrName;

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.baseChkString())
                .append(StringUtils.trimToEmpty(getUsrId()))
                .append(StringUtils.trimToEmpty(getUsrCustId()))
                .append(StringUtils.trimToEmpty(getBgRetUrl()))
                .append(StringUtils.trimToEmpty(getTrxId()))
                .append(StringUtils.trimToEmpty(getRetUrl()))
                .append(StringUtils.trimToEmpty(getMerPriv()));
        return sb.toString();
    }
}
