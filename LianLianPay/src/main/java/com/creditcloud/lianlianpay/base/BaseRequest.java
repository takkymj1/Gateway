/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lianlianpay.base;

import com.creditcloud.model.BaseObject;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 *
 * @author tinglany
 */
@Data
public abstract class BaseRequest extends BaseObject {
    
    //商户编号
    @NotNull
    private String oid_partner;
    
    //
    @NotNull
    private String sign_type;
    
    @NotNull
    private String sign;

    public BaseRequest() {
    }

    public BaseRequest(String oid_partner, String sign_type, String sign) {
        this.oid_partner = oid_partner;
        this.sign_type = sign_type;
        this.sign = sign;
    }   
    
}
