/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;

import javax.validation.constraints.NotNull;
import com.creditcloud.yeep.enums.QueryModel;
import com.creditcloud.yeep.model.BaseRequest;
/**
 * 单笔业务查询
 * 
 * @author tinglany
 */

//@Data
//@NoArgsConstructor
public class QueryRequest extends BaseRequest {
    
    //各个业务的请求流水号
    @NotNull
    private String requestNo;
    
    //查询模式
    @NotNull
    private QueryModel queryModel;
    
    public QueryRequest(String platformNo,
                        String requestNo,
                        QueryModel queryModel) {
        super(platformNo,null,null,null);
        this.requestNo = requestNo;
        this.queryModel = queryModel;
    }
    
}