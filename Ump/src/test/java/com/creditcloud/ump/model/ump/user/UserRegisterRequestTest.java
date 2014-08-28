/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.ump.model.ump.user;

import com.creditcloud.ump.model.ump.base.BaseResponse;
import com.creditcloud.ump.model.ump.enums.UmpIdentityType;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author kdliu
 */
public class UserRegisterRequestTest {

    @Test
    public void testChkString() {
        UserRegisterRequest request = new UserRegisterRequest("0898912213", "2001212", "习近平", UmpIdentityType.IDENTITY_CARD.name(), "110102197407013870", "13800138000");

        Assert.assertEquals("checksum string is wrong",
                            "charset=UTF-8&identity_code=110102197407013870&identity_type=IDENTITY_CARD&mer_cust_id=2001212&mer_cust_name=习近平&mer_id=0898912213&mobile_id=13800138000&res_format=HTML&service=mer_register_person&version=1.0",
                            request.chkString());

        String s = "<META NAME=\"MobilePayPlatform\" CONTENT=\"sign_type=RSA&mer_id=0898912213&reg_date=20140101&user_id=userNo123&account_id=1239123123&ret_code=0&ret_msg=success&version=1.0&sign=123\">";

        UserRegisterResponse response = BaseResponse.fromHTML(s, UserRegisterResponse.class);

        Assert.assertEquals("reponse is not correct", "20140101", response.getReg_date());
        Assert.assertEquals("reponse is not correct", "userNo123", response.getUser_id());
        Assert.assertEquals("reponse is not correct", "1239123123", response.getAccount_id());

        Assert.assertEquals("checksum string is wrong",
                            "account_id=1239123123&mer_id=0898912213&reg_date=20140101&ret_code=0&ret_msg=success&user_id=userNo123&version=1.0",
                            response.chkString());

    }

}
