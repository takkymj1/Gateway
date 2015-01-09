/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.query;

import com.creditcloud.payment.model.PnRConstant;
import com.creditcloud.payment.model.chinapnr.base.BaseRequest;
import com.creditcloud.payment.model.chinapnr.enums.CmdIdType;
import com.creditcloud.payment.model.chinapnr.enums.QueryTransType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class QueryTransDetailRequest extends BaseRequest {

    @NotNull
    @Size(max = 20)
    private String OrdId;

    @NotNull
    private String QueryTransType;

    @Size(max = 512)
    private String ReqExt;

    public QueryTransDetailRequest(String MerCustId, QueryTransType QueryTransType, String OrdId, String ReqExt) {
        super(PnRConstant.Version, CmdIdType.QueryTransDetail, MerCustId);
        this.OrdId = OrdId;
        this.QueryTransType = QueryTransType.name();
        this.ReqExt = ReqExt;
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StringUtils.trimToEmpty(getVersion()));
        sb.append(StringUtils.trimToEmpty(getCmdId().name()));
        sb.append(StringUtils.trimToEmpty(getMerCustId()));
        sb.append(StringUtils.trimToEmpty(getOrdId()));
        sb.append(StringUtils.trimToEmpty(getQueryTransType()));
        sb.append(StringUtils.trimToEmpty(getReqExt()));
        return sb.toString();
    }
}
