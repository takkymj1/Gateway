/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;
import com.creditcloud.yeep.enums.BizType;
import com.creditcloud.yeep.model.BaseNotification;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author tinglany
 */

@XmlRootElement(name = "notify")
public class AutoRepaymentNotify extends BaseNotification {
    
    //请求流水号
    @NotNull
    private String requestNo;
    
    //标的号
    @NotNull
    private String orderNo;

    public AutoRepaymentNotify() {
    }
    
    public AutoRepaymentNotify(String platformNo,
                                     String bizType,
                                     String code,
                                     String message,
                                     String requestNo,
                                     String orderNo,
                                     String sign) {
        super(platformNo,bizType,code,message,sign);    
    } 

    public String getRequestNo() {
        return requestNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

}
