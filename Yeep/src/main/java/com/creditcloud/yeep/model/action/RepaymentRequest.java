/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import com.creditcloud.yeep.model.UserRequest;
import javax.validation.constraints.NotNull;
import com.creditcloud.yeep.model.Repayment;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author tinglany
 */
@XmlRootElement ( name = "request")
public class RepaymentRequest extends UserRequest {

    /**
     * 标的号
     */
    @NotNull
    private String OrderNo;

    @NotNull
    private List<Repayment> repayments;
    
    public RepaymentRequest() {
    };
    
    public RepaymentRequest(String platformNo,
                            String platformUserNo,
                            String requestNo,
                            String OrderNo,
                            List<Repayment> repayments,
                            String callbackUrl,
                            String notifyUrl) {
        super(platformUserNo, platformNo, null, requestNo, callbackUrl, notifyUrl);
        this.OrderNo = OrderNo;
        this.repayments = repayments;
    }

    public String getOrderNo() {
        return OrderNo;
    }

    @XmlElementWrapper(name="repayments")
    @XmlElement(name="repayment")    
    public List<Repayment> getRepayments() {
        return repayments;
    }

    public void setOrderNo(String OrderNo) {
        this.OrderNo = OrderNo;
    }

    public void setRepayments(List<Repayment> repayments) {
        this.repayments = repayments;
    }
    
}
