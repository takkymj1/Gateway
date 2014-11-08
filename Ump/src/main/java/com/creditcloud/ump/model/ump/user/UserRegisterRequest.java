/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.ump.model.ump.user;

import com.creditcloud.ump.model.ump.base.BaseRequest;
import com.creditcloud.ump.model.ump.enums.CmdIdType;
import lombok.Data;
import lombok.ToString;

/**
 *
 * @author kdliu
 */
@Data
@ToString(callSuper=true)
public class UserRegisterRequest extends BaseRequest {

    private String mer_cust_id;

    private String mer_cust_name;

    private String identity_type;

    private String identity_code;

    private String mobile_id;

    /**
     * nillable
     */
    private String email;
    
    public UserRegisterRequest(String mer_id,
                               String mer_cust_id,
                               String mer_cust_name, 
                               String identity_type, 
                               String identity_code, 
                               String mobile_id) {
        super(CmdIdType.MER_REGISTER_PERSON, mer_id);
        this.mer_cust_id = mer_cust_id;
        this.mer_cust_name = mer_cust_name;
        this.identity_type = identity_type;
        this.identity_code = identity_code;
        this.mobile_id = mobile_id;
    }
}
