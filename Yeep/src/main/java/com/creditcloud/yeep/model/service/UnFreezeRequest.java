/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;
import javax.validation.constraints.NotNull;
import com.creditcloud.yeep.model.BaseRequest;
import javax.xml.bind.annotation.XmlRootElement;
import org.apache.commons.lang3.StringUtils;
/**
 * 资金解冻
 * 
 * @author tinglany
 */

@XmlRootElement ( name = "request")
public class UnFreezeRequest extends BaseRequest {
    
    //冻结时的请求流水号
    @NotNull
    private String freezeRequestNo;

    public UnFreezeRequest() {
    }
    
    public UnFreezeRequest(String platformNo,
                           String freezeRequestNo,
                           String sign) {
        super(platformNo,null,null,null,sign);
        this.freezeRequestNo = freezeRequestNo;
    }

    public String getFreezeRequestNo() {
        return freezeRequestNo;
    }

    public void setFreezeRequestNo(String freezeRequestNo) {
        this.freezeRequestNo = freezeRequestNo;
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.baseChkString())
                .append(StringUtils.trimToEmpty(freezeRequestNo));
        return sb.toString();
    }
}
