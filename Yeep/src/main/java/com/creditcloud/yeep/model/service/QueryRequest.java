/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;

import com.creditcloud.yeep.enums.QueryModel;
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
    private QueryModel mode;

    public QueryRequest() {
    }
    
    public QueryRequest(String platformNo,
                        String requestNo,
                        QueryModel mode) {
        super(platformNo,null,null,null);
        this.requestNo = requestNo;
        this.mode = mode;
    }

    public String getRequestNo() {
        return requestNo;
    }

    public QueryModel getMode() {
        return mode;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }

    public void setMode(QueryModel mode) {
        this.mode = mode;
    }
    
}
