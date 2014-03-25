 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr;

import com.creditcloud.payment.model.chinapnr.base.UserResponse;
import com.creditcloud.payment.model.chinapnr.constraint.PnRDate;
import com.creditcloud.payment.model.chinapnr.constraint.PnRReturnURL;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author sobranie
 */
@Data
@NoArgsConstructor
@XmlRootElement
public class FssTransResponse extends UserResponse {

    @FormParam("OrdId")
    @NotNull
    @Size(max = 20)
    String OrdId;

    @FormParam("OrdDate")
    @NotNull
    @PnRDate
    String OrdDate;

    @FormParam("TransType")
    @NotNull
    String TransType;

    @FormParam("TransAmt")
    @NotNull
    String TransAmt;

    @FormParam("RetUrl")
    String RetUrl;

    @FormParam("BgRetUrl")
    @NotNull
    @PnRReturnURL
    @Size(max = 128)
    String BgRetUrl;

    @FormParam("RespExt")
    String RespExt;

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.baseChkString())
                .append(StringUtils.trimToEmpty(getOrdId()))
                .append(StringUtils.trimToEmpty(getOrdDate()))
                .append(StringUtils.trimToEmpty(getUsrCustId()))
                .append(StringUtils.trimToEmpty(getTransType()))
                .append(StringUtils.trimToEmpty(getTransAmt()))
                .append(StringUtils.trimToEmpty(getRetUrl()))
                .append(StringUtils.trimToEmpty(getBgRetUrl()))
                .append(StringUtils.trimToEmpty(getMerPriv()))
                .append(StringUtils.trimToEmpty(getRespExt()));
        return sb.toString();
    }

}
