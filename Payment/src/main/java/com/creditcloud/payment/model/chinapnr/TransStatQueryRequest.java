/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr;

import com.creditcloud.payment.model.PnRConstant;
import com.creditcloud.payment.model.chinapnr.base.BaseRequest;
import com.creditcloud.payment.model.chinapnr.constraint.PnRDate;
import com.creditcloud.payment.model.chinapnr.enums.CmdIdType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.apache.commons.lang3.StringUtils;

/**
 * 交易状态查询
 *
 * @author rooseek
 */
public class TransStatQueryRequest extends BaseRequest {

    @NotNull
    @Size(max = 20)
    private String OrdId;

    @NotNull
    @PnRDate
    private String OrdDate;

    @NotNull
    private String QueryTransType;

    public TransStatQueryRequest() {
    }

    public TransStatQueryRequest(String MerCustId, String OrdId, String OrdDate, String QueryTransType) {
        super(PnRConstant.Version, CmdIdType.QueryTransStat, MerCustId);
        this.OrdId = OrdId;
        this.OrdDate = OrdDate;
        this.QueryTransType = QueryTransType;
    }

    public String getOrdId() {
        return OrdId;
    }

    public String getOrdDate() {
        return OrdDate;
    }

    public String getQueryTransType() {
        return QueryTransType;
    }

    public void setOrdId(String OrdId) {
        this.OrdId = OrdId;
    }

    public void setOrdDate(String OrdDate) {
        this.OrdDate = OrdDate;
    }

    public void setQueryTransType(String QueryTransType) {
        this.QueryTransType = QueryTransType;
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder(baseChkString());
        sb.append(StringUtils.trimToEmpty(getOrdId()))
                .append(StringUtils.trimToEmpty(getOrdDate()))
                .append(StringUtils.trimToEmpty(getQueryTransType()));
        return sb.toString();
    }
}
