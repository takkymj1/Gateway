/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;

import com.creditcloud.yeep.model.UserRequest;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 取消自动投标授权
 * 
 * @author tinglany
 */

@XmlRootElement(name = "request")
public class CancelAutoTransferRequest extends UserRequest {

    public CancelAutoTransferRequest() {
    }
      
    public CancelAutoTransferRequest(String platformNo,
                                              String platformUserNo,
                                              String requestNo) {
        super(platformUserNo,platformNo,null,requestNo,null,null);
    }
   
}
