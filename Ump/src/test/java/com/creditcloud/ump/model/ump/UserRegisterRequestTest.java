/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model.ump;

import com.creditcloud.ump.model.ump.user.UserRegisterResponse;
import com.creditcloud.ump.model.ump.user.UserRegisterRequest;
import com.creditcloud.ump.model.ump.base.BaseResponse;
import org.junit.Test;

/**
 *
 * @author kdliu
 */
public class UserRegisterRequestTest {
    
    @Test
    public void testChkString() {
        UserRegisterRequest request = new UserRegisterRequest("abc", "abc","abc","abc","abc","abc","abc","abc","abc","abc","abc","abc");
        
        System.out.println(request.chkString());
        
        String s = "<META NAME=\"MobilePayPlatform\" CONTENT=\"sign_type=RSA&mer_id=abc&reg_date=20140101&user_id=1239123123&account_id=abc&ret_code=0&ret_msg=abc&version=abc.&sign=123\"/>";
        
        UserRegisterResponse response = BaseResponse.fromHTML(s, UserRegisterResponse.class);
        
        System.out.println(response.toString());
        
                System.out.println(response.chkString());
    }
    
}
