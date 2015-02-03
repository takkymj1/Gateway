/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import com.creditcloud.yeep.enums.BizType;
import com.creditcloud.yeep.enums.MemberType;
import com.creditcloud.yeep.enums.ServiceType;
import com.creditcloud.yeep.enums.UserType;
import com.creditcloud.yeep.model.UserRequest;
import java.util.Date;
import javax.validation.constraints.NotNull;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import org.apache.commons.lang3.StringUtils;

/**
 * 通用转账授权
 * 
 * @author tinglany
 */
@XmlRootElement (name = "request")
public class authorCpTransferRequest extends UserRequest {

    /**
     * 固定值TRANSFER
     */
    @NotNull
    private  BizType bizType;
    
    @NotNull
    private UserType userType;

    /**
     * 超过此时间既不容许提交订单
     */
    @NotNull
    private String expired;
       
    @NotNull
    private List<CpTransDetail> details;

    public authorCpTransferRequest() {
    }

    public authorCpTransferRequest(String requestNo,
                                String platformNo,
                                String platformUserNo,
                                BizType bizType,
                                UserType userType,
                                String expired,
                                List<CpTransDetail> details,
                                String notifyUrl,
                                String callbackUrl) {
        super(platformUserNo, platformNo,null,requestNo, callbackUrl, notifyUrl);
        this.userType = userType;
        this.bizType = bizType;
        this.expired = expired;
        this.details = details;
    }

    public BizType getBizType() {
        return bizType;
    }

    public String getExpired() {
        return expired;
    }

    public UserType getUserType() {
        return userType;
    }

    @XmlElementWrapper(name="details")
    @XmlElement(name="detail")       
    public List<CpTransDetail> getDetails() {
        return details;
    }

    public void setBizType(BizType bizType) {
        this.bizType = bizType;
    }

    public void setExpired(String expired) {
        this.expired = expired;
    }

    public void setDetails(List<CpTransDetail> details) {
        this.details = details;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }
    
}
