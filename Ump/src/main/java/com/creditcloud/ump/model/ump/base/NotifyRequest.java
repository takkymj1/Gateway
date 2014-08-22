/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model.ump.base;

import com.creditcloud.ump.model.UmpConstant;
import com.creditcloud.ump.model.ump.enums.CmdIdType;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author kdliu
 */
@Data
@NoArgsConstructor
public abstract class NotifyRequest extends BaseRequest {
    
    private String ret_code;
    
    private String ret_msg;
    
    public NotifyRequest(CmdIdType service, 
                         String mer_id, 
                         String ret_code, 
                         String ret_msg) {
        super(service, mer_id);
        this.ret_code = ret_code;
        this.ret_msg = ret_msg;
    }
    
    public boolean success() {
        if(ret_code!=null) {
            return ret_code.equals(UmpConstant.SUCCESS_CODE);
        }
        
        return false;
    }
    
}
