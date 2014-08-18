/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.ump.model.ump.user;

import com.creditcloud.ump.model.UmpConstant;
import com.creditcloud.ump.model.ump.base.BaseRequest;
import com.creditcloud.ump.model.ump.enums.CmdIdType;

/**
 *
 * @author kdliu
 */
public class UserRegisterRequest extends BaseRequest {

    private String mer_cust_id;

    private String mer_cust_name;

    private String identity_type;

    private String identity_code;

    private String mobile_id;

    private String email;

    public UserRegisterRequest(String sign_type, 
                               String charset, 
                               String res_format, 
                               String sign, 
                               String mer_id, 
                               String version,
                               String mer_cust_id,
                               String mer_cust_name, 
                               String identity_type, 
                               String identity_code, 
                               String mobile_id, 
                               String email) {
        super(CmdIdType.MER_REGISTER_PERSON, sign_type, charset, res_format, sign, mer_id, version);
        this.mer_cust_id = mer_cust_id;
        this.mer_cust_name = mer_cust_name;
        this.identity_type = identity_type;
        this.identity_code = identity_code;
        this.mobile_id = mobile_id;
        this.email = email;
    }
    
    public UserRegisterRequest(String mer_id,
                               String mer_cust_id,
                               String mer_cust_name, 
                               String identity_type, 
                               String identity_code, 
                               String mobile_id) {
        super(CmdIdType.MER_REGISTER_PERSON, UmpConstant.SIGN_TYPE, UmpConstant.ENCODE_TYPE, UmpConstant.RESPONSE_FORMAT, "", mer_id, UmpConstant.CURRENT_VERSION);
        this.mer_cust_id = mer_cust_id;
        this.mer_cust_name = mer_cust_name;
        this.identity_type = identity_type;
        this.identity_code = identity_code;
        this.mobile_id = mobile_id;
    }

    public String getMer_cust_id() {
        return mer_cust_id;
    }

    public void setMer_cust_id(String mer_cust_id) {
        this.mer_cust_id = mer_cust_id;
    }

    public String getMer_cust_name() {
        return mer_cust_name;
    }

    public void setMer_cust_name(String mer_cust_name) {
        this.mer_cust_name = mer_cust_name;
    }

    public String getIdentity_type() {
        return identity_type;
    }

    public void setIdentity_type(String identity_type) {
        this.identity_type = identity_type;
    }

    public String getIdentity_code() {
        return identity_code;
    }

    public void setIdentity_code(String identity_code) {
        this.identity_code = identity_code;
    }

    public String getMobile_id() {
        return mobile_id;
    }

    public void setMobile_id(String mobile_id) {
        this.mobile_id = mobile_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
