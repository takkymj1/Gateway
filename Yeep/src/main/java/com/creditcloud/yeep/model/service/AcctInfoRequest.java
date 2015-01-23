/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;

import com.creditcloud.yeep.model.UserRequest;
import javax.xml.bind.annotation.XmlRootElement;

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
                           String platformUserNo) {
        super(platformUserNo,platformNo,null,null,null,null);   
    }

}
