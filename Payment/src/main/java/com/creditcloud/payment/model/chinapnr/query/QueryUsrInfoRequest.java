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
 * @author rooseek
 */
@Data
@NoArgsConstructor
public class QueryUsrInfoRequest extends BaseRequest {

    @NotNull
    @Size(max = 30)
    private String CertId;

    @Size(max = 512)
    private String ReqExt;

    public QueryUsrInfoRequest(String MerCustId, String CertId, String ReqExt) {
        super(PnRConstant.Version, CmdIdType.QueryUsrInfo, MerCustId);
        this.CertId = CertId;
        this.ReqExt = ReqExt;
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StringUtils.trimToEmpty(getVersion()));
        sb.append(StringUtils.trimToEmpty(getCmdId().name()));
        sb.append(StringUtils.trimToEmpty(getMerCustId()));
        sb.append(StringUtils.trimToEmpty(getCertId()));
        sb.append(StringUtils.trimToEmpty(getReqExt()));
        return sb.toString();
    }
}
