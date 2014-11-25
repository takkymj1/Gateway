/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;

import com.creditcloud.yeep.model.BaseRequest;
import javax.validation.constraints.NotNull;
import com.creditcloud.yeep.model.Transfer;
/**
 * 放款
 * 
 * @author tinglany
 */

//@Data
//@NoArgsConstructor
public class LoanRequest extends BaseRequest {
    
    //标的号
    @NotNull
    private String orderNo;
    
    //请求流水号
    @NotNull
    private String requestNo;
    
    //平台方收取分润
    private String fee;
    
    //transfer
    @NotNull
    private Transfer transfer;
    
    //服务器通知 URL
    @NotNull
    private String notifyUrl;
    
    public LoanRequest(String platformNo,
                       String orderNo,
                       String requestNo,
                       String fee,
                       Transfer transfer,
                       String notifyUrl) {
        super(platformNo,null,notifyUrl,null);
        this.orderNo = orderNo;
        this.requestNo = requestNo;
        this.fee = fee;
        this.transfer = transfer;
        this.notifyUrl = notifyUrl;
    }    
}
