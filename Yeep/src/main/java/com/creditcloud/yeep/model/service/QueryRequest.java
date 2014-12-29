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
 * 单笔业务查询
 * 
 * @author tinglany
 */

@XmlRootElement (name = "request")
public class QueryRequest extends BaseRequest {
    
    //各个业务的请求流水号
    @NotNull
    private String requestNo;
    
    //查询模式
    @NotNull
    private String mode;

    public QueryRequest() {
    }
    
    public QueryRequest(String platformNo,
                        String requestNo,
                        String mode,
                        String sign) {
        super(platformNo,null,null,null,sign);
        this.requestNo = requestNo;
        this.mode = mode;
    }

    public String getRequestNo() {
        return requestNo;
    }

    public String getMode() {
        return mode;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.baseChkString())
                .append(StringUtils.trimToEmpty(requestNo))
                .append(StringUtils.trimToEmpty(mode));
        return sb.toString();
    }
    
}
