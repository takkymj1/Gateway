/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;

import com.creditcloud.yeep.model.UserRequest;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 取消自动还款授权
 *
 * @author tinglany
 */
@XmlRootElement(name = "request")
public class CancelAutoRepayRequest extends UserRequest {

    //投标流水号
    @NotNull
    private String orderNo;

    public CancelAutoRepayRequest() {
    }

    public CancelAutoRepayRequest(String platformNo,
                                      String platformUserNo,
                                      String requestNo,
                                      String orderNo) {
        super(platformUserNo, platformNo, null, requestNo, null, null);
        this.orderNo = orderNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }
  
}
