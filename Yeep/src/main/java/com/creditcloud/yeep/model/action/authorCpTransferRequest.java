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
    private  String bizType;
    
    @NotNull
    private String userType;

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
                                String bizType,
                                String userType,
                                String expired,
                                List<CpTransDetail> details,
                                String notifyUrl,
                                String callbackUrl,
                                String sign) {
        super(platformUserNo, platformNo,null,requestNo, callbackUrl, notifyUrl,sign);
        this.userType = userType;
        this.bizType = bizType;
        this.expired = expired;
        this.details = details;
    }

    public String getBizType() {
        return bizType;
    }

    public String getExpired() {
        return expired;
    }

    public String getUserType() {
        return userType;
    }

    @XmlElementWrapper(name="details")
    @XmlElement(name="detail")       
    public List<CpTransDetail> getDetails() {
        return details;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public void setExpired(String expired) {
        this.expired = expired;
    }

    public void setDetails(List<CpTransDetail> details) {
        this.details = details;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    
    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.baseChkString())
                .append(StringUtils.trimToEmpty(bizType))
                .append(StringUtils.trimToEmpty(userType))
                .append(StringUtils.trimToEmpty(expired))
                .append(StringUtils.trimToEmpty(details.get(0).toString()));
        return sb.toString();
    }    
}
