/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.query;

import com.creditcloud.payment.model.chinapnr.base.BaseResponse;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.apache.commons.lang3.StringUtils;

/**
 * 交易状态查询
 *
 * @author rooseek
 */
public class TransStatQueryResponse extends BaseResponse {
    
    @NotNull
    @Size(max = 20)
    private String OrdId;
    
    @NotNull
    @Size(min = 8, max = 8)
    private String OrdDate;
    
    @NotNull
    private String QueryTransType;
    
    private String TransStat;
    
    public TransStatQueryResponse() {
    }
    
    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder(baseChkString());
        sb.append(StringUtils.trimToEmpty(getOrdId()))
                .append(StringUtils.trimToEmpty(getOrdDate()))
                .append(StringUtils.trimToEmpty(getQueryTransType()))
                .append(StringUtils.trimToEmpty(getTransStat()));
        return sb.toString();
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
    
    public String getTransStat() {
        return TransStat;
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
    
    public void setTransStat(String TransStat) {
        this.TransStat = TransStat;
    }
}
