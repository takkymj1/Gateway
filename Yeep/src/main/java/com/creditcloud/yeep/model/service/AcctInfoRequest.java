/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;

import com.creditcloud.yeep.model.UserRequest;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.apache.commons.lang3.StringUtils;
/**
 * 账户查询
 * 
 * @author tinglany
 */
@XmlRootElement (name = "request")
public class AcctInfoRequest extends UserRequest {

    public AcctInfoRequest() {
    }

     
    public AcctInfoRequest(String platformNo,
                           String platformUserNo,
                           String sign) {
        super(platformUserNo,platformNo,null,null,null,null,sign);   
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.baseChkString());
        return sb.toString();
    }
}
