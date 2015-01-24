/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;
import javax.validation.constraints.NotNull;
import com.creditcloud.yeep.model.UserRequest;
import com.creditcloud.yeep.model.Repayment;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 自动还款
 * 
 * @author tinglany
 */

@XmlRootElement (name ="request")
public class AutoRepaymentRequest extends UserRequest {
    
    
    //标的号
    @NotNull
    private String orderNo;
    
    //repayment
    @NotNull
    private List<Repayment> repayments;

    public AutoRepaymentRequest() {
    }
    
    public AutoRepaymentRequest(String platformNo,
                                String platformUserNo,
                                String requestNo,
                                String orderNo,
                                List<Repayment> repayments,
                                String notifyUrl) {
        super(platformUserNo,platformNo,null,requestNo,notifyUrl,null);
        this.orderNo = orderNo;
        this.repayments = repayments;
    }

    public String getOrderNo() {
        return orderNo;
    }

    @XmlElementWrapper(name="repayments")
    @XmlElement(name="repayment")     
    public List<Repayment> getRepayments() {
        return repayments;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public void setRepayments(List<Repayment> repayments) {
        this.repayments = repayments;
    }
     
}
