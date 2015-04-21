/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lianlianpay.base;

import com.creditcloud.model.BaseObject;
import lombok.Data;

/**
 *
 * @author tinglany
 */
@Data
public class BaseResponse extends BaseObject {
    
    private String ret_code;
    
    private String ret_msg;
    
    private String sign_type;
    
    private String sign;

    public BaseResponse() {
    }

    public BaseResponse(String ret_code, String ret_msg, String sign_type, String sign) {
        this.ret_code = ret_code;
        this.ret_msg = ret_msg;
        this.sign_type = sign_type;
        this.sign = sign;
    }
    
}
