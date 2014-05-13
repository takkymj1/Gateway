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
public class UsrTransferResponse extends BaseResponse {

    @FormParam("OrdId")
    @NotNull
    @Size(max = 20)
    private String OrdId;

    @FormParam("UsrCustId")
    @NotNull
    @Size(max = 16)
    private String UsrCustId;

    @FormParam("InUsrCustId")
    @NotNull
    @Size(max = 16)
    private String InUsrCustId;

    @FormParam("TransAmt")
    @NotNull
    @Size(max = 14)
    private String TransAmt;

    @FormParam("RetUrl")
    @NotNull
    @Size(max = 128)
    private String RetUrl;

    @FormParam("BgRetUrl")
    @NotNull
    @Size(max = 128)
    private String BgRetUrl;

    @FormParam("RespExt")
    @Size(max = 512)
    private String RespExt;

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder()
                .append(StringUtils.trimToEmpty(getCmdId().name()))
                .append(StringUtils.trimToEmpty(getRespCode()))
                .append(StringUtils.trimToEmpty(getOrdId()))
                .append(StringUtils.trimToEmpty(getMerCustId()))
                .append(StringUtils.trimToEmpty(getUsrCustId()))
                .append(StringUtils.trimToEmpty(getTransAmt()))
                .append(StringUtils.trimToEmpty(getInUsrCustId()))
                .append(StringUtils.trimToEmpty(getRetUrl()))
                .append(StringUtils.trimToEmpty(getBgRetUrl()))
                .append(StringUtils.trimToEmpty(getMerPriv()))
                .append(StringUtils.trimToEmpty(getRespExt()));
        return sb.toString();
    }
}
