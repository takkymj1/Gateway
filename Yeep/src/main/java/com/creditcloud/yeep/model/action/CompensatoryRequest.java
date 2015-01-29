/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import com.creditcloud.yeep.model.UserRequest;
import javax.validation.constraints.NotNull;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kakaci
 */
@XmlRootElement (name ="request")
public class CompensatoryRequest extends UserRequest {


    /**
     * 标的号
     */
    @NotNull
    private String orderNo;

    /**
     *
     */
    @NotNull
    private List<transfer> transfers;

    public CompensatoryRequest() {
    }


    public CompensatoryRequest(String requestNo,
                               String platformNo,
                               String platformUserNo,
                               String orderNo,
                               List<transfer> transfers ,
                               String notifyUrl,
                               String callbackUrl) {
        super(platformUserNo, platformNo,null,requestNo, callbackUrl, notifyUrl);
        this.orderNo = orderNo;
        this.transfers = transfers;
    }

    public String getOrderNo() {
        return orderNo;
    }

    @XmlElementWrapper(name="transfers")
    @XmlElement(name="transfer")   
    public List<transfer> getTransfers() {
        return transfers;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public void setTransfers(List<transfer> transfers) {
        this.transfers = transfers;
    }
      
}
