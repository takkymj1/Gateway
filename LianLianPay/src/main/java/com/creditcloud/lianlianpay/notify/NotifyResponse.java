/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lianlianpay.notify;

import com.creditcloud.model.BaseObject;
import lombok.Data;

/**
 *
 * @author tinglany
 */
@Data
public class NotifyResponse extends BaseObject {
    
    private String ret_code;
    
    private String ret_msg;

    public NotifyResponse() {
    }

    public NotifyResponse(String ret_code, String ret_msg) {
        this.ret_code = ret_code;
        this.ret_msg = ret_msg;
    }
    
}
