/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model.ump.user;

import com.creditcloud.ump.model.ump.base.BaseResponse;
import org.junit.Test;

/**
 *
 * @author kdliu
 */
public class UserRegisterRequestTest { 
    
    @Test
    public void testChkString() {
        UserRegisterRequest request = new UserRegisterRequest("0898912213", "2001212","习近平","IDENTITY_CARD","110102197407013870","13800138000");
        
        System.out.println(request.chkString());
        
        String s = "<META NAME=\"MobilePayPlatform\" CONTENT=\"sign_type=RSA&mer_id=0898912213&reg_date=20140101&user_id=userNo123&account_id=1239123123&ret_code=0&ret_msg=success&version=1.0.&sign=123\"/>";
        
        UserRegisterResponse response = BaseResponse.fromHTML(s, UserRegisterResponse.class);
        
        System.out.println(response.toString());
        
        System.out.println(response.chkString());
    }
    
}
