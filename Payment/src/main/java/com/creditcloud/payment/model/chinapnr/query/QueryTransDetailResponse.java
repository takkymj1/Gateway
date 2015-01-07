/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.query;


import com.creditcloud.payment.model.chinapnr.base.UserResponse;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author kakaci
 */
@Data
@NoArgsConstructor
public class QueryTransDetailResponse extends UserResponse{
    @NotNull
    @Size(max = 20)
    private String OrdId;
    
    @NotNull
    @Size(max = 8,min=8)
    private String OrdDate;
    
    @NotNull
    private String QueryTransType;
    
    @NotNull
    @Size(max = 14)
    private String TransAmt;
    
    @NotNull
    @Size(max = 1,min=1)
    private String TransStat;
    
    @Size(max = 14)
    private String FeeAmt;
    
    @Size(max = 16)
    private String FeeCustId;
    
    @Size(max = 9)
    private String FeeAcctId;
    
    @Size(max = 6)
    private String GateBusiId;
    
    @Size(max = 512)
    private String RespExt;
    
    @Override
    public  String chkString(){
        StringBuilder sb=new StringBuilder(super.baseChkString());
        sb.append(StringUtils.trimToEmpty(this.getOrdId())).
                append(StringUtils.trimToEmpty(this.getOrdDate())).
                append(StringUtils.trimToEmpty(this.getQueryTransType())).
                append(StringUtils.trimToEmpty(this.getTransAmt())).
                append(StringUtils.trimToEmpty(this.getTransStat())).
                append(StringUtils.trimToEmpty(this.getFeeAmt())).
                append(StringUtils.trimToEmpty(this.getFeeCustId())).
                append(StringUtils.trimToEmpty(this.getFeeAcctId())).
                append(StringUtils.trimToEmpty(this.getGateBusiId())).
                append(StringUtils.trimToEmpty(this.getRespExt()));
        return sb.toString();
    }
    
}
