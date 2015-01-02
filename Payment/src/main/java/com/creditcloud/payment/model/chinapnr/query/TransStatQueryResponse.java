/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.query;

import com.creditcloud.payment.model.chinapnr.base.BaseResponse;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.commons.lang3.StringUtils;

/**
 * 交易状态查询
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class TransStatQueryResponse extends BaseResponse {

    @FormParam("OrdId")
    @NotNull
    @Size(max = 20)
    private String OrdId;

    @FormParam("OrdDate")
    @NotNull
    @Size(min = 8, max = 8)
    private String OrdDate;

    @FormParam("QueryTransType")
    @NotNull
    private String QueryTransType;

    @FormParam("TransStat")
    private String TransStat;

    @FormParam("TransAmt")
    @Size(max = 14)
    private String TransAmt;

    @FormParam("TrxId")
    @Size(max = 18)
    private String TrxId;

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder(baseChkString());
        sb.append(StringUtils.trimToEmpty(getOrdId()))
                .append(StringUtils.trimToEmpty(getOrdDate()))
                .append(StringUtils.trimToEmpty(getQueryTransType()))
                .append(StringUtils.trimToEmpty(getTransStat()));
        /**
         * 冻结解冻操作验签要加额外field
         */
        if (com.creditcloud.payment.model.chinapnr.enums.QueryTransType.FREEZE.name().equalsIgnoreCase(getQueryTransType())) {
            sb.append(StringUtils.trimToEmpty(getTransAmt()))
                    .append(StringUtils.trimToEmpty(getTrxId()));
        }
        return sb.toString();
    }
}
