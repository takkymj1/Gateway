/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr;

import com.creditcloud.payment.model.chinapnr.base.UserRequest;
import com.creditcloud.payment.model.chinapnr.enums.CmdIdType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.apache.commons.lang3.StringUtils;

/**
 * 自动投标关闭
 *
 * @author rooseek
 */
public class AutoTenderCloseRequest extends UserRequest {

    @Size(max = 128)
    private String RetUrl;

    public AutoTenderCloseRequest() {
    }

    public AutoTenderCloseRequest(CmdIdType CmdId,
                                  String MerCustId,
                                  String UsrCustId,
                                  String RetUrl) {
        super(CmdId, MerCustId, UsrCustId);
        this.RetUrl = RetUrl;
    }

    public String getRetUrl() {
        return RetUrl;
    }

    public void setRetUrl(String RetUrl) {
        this.RetUrl = RetUrl;
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder(baseChkString())
                .append(StringUtils.trimToEmpty(getRetUrl()))
                .append(StringUtils.trimToEmpty(getMerPriv()));
        return sb.toString();
    }
}
