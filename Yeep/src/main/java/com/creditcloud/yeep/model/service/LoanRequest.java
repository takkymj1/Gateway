/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;

import com.creditcloud.yeep.model.BaseRequest;
import javax.validation.constraints.NotNull;
import com.creditcloud.yeep.model.Transfer;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
/**
 * 放款
 * 
 * @author tinglany
 */

@XmlRootElement ( name = "request")
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
    private List<Transfer> transfers;
    

    public LoanRequest() {
    }
    
    public LoanRequest(String platformNo,
                       String orderNo,
                       String requestNo,
                       String fee,
                       List<Transfer> transfers,
                       String notifyUrl) {
        super(platformNo,null,null,notifyUrl);
        this.orderNo = orderNo;
        this.requestNo = requestNo;
        this.fee = fee;
        this.transfers = transfers;
    } 

    @XmlElementWrapper(name="transfers")
    @XmlElement(name="transfer")
    public List<Transfer> getTransfers() {
        return transfers;
    }    
    
    public String getOrderNo() {
        return orderNo;
    }

    public String getRequestNo() {
        return requestNo;
    }

    public String getFee() {
        return fee;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public void setTransfer(List<Transfer> transfer) {
        this.transfers = transfers;
    }
  
}
