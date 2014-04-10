/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.query;

import com.creditcloud.payment.model.PnRConstant;
import com.creditcloud.payment.model.chinapnr.base.BaseRequest;
import com.creditcloud.payment.model.chinapnr.enums.CmdIdType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author sobranie
 */
@Data
@NoArgsConstructor
public class FssAccountQueryRequest extends BaseRequest {

    @NotNull
    @Size(max = 16)
    private String UsrCustId;
    
    private String ReqExt;

    public FssAccountQueryRequest(String MerCustId, String UsrCustId) {
        super(PnRConstant.Version, CmdIdType.QueryFssAccts, MerCustId);
        this.UsrCustId = UsrCustId;
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder(baseChkString());
        sb.append(StringUtils.trimToEmpty(getUsrCustId()))
                .append(StringUtils.trimToEmpty(getReqExt()));
        return sb.toString();
    }

}
