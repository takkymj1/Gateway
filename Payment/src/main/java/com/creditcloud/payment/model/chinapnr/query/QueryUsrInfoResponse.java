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
public class QueryUsrInfoResponse extends UserResponse{
    

    
    @Size(max = 25,min=6)
    private String UsrId;
    
    @NotNull
    @Size(max = 30)
    private String CertId;
    
    @Size(max = 1,min=1)
    private String UsrStat;
    
    @Size(max = 512)
    private String RespExt;
    
    public  String chkString(){
        StringBuilder sb=new StringBuilder();
        sb.append(super.baseChkString()).
                append(StringUtils.trimToEmpty(this.getUsrId())).
                append(StringUtils.trimToEmpty(this.getCertId())).
                append(StringUtils.trimToEmpty(this.getUsrStat())).
                append(StringUtils.trimToEmpty(this.getRespExt()));
        return sb.toString();
    }
}
