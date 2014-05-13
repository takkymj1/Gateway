/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr;

import com.creditcloud.payment.model.chinapnr.base.BaseResponse;
import javax.validation.constraints.Size;
import lombok.ToString;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author rooseek
 */
@ToString(callSuper = true)
public class BgRegisterResponse extends BaseResponse {

    @Size(min = 6, max = 25)
    private String UsrId;

    @Size(max = 16)
    private String UsrCustId;

    public String getUsrId() {
        return UsrId;
    }

    public BgRegisterResponse() {
    }

    public String getUsrCustId() {
        return UsrCustId;
    }

    public void setUsrId(String UsrId) {
        this.UsrId = UsrId;
    }

    public void setUsrCustId(String UsrCustId) {
        this.UsrCustId = UsrCustId;
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.baseChkString())
                .append(StringUtils.trimToEmpty(getUsrId()))
                .append(StringUtils.trimToEmpty(getUsrCustId()))
                .append(StringUtils.trimToEmpty(getMerPriv()));

        return sb.toString();
    }
}
