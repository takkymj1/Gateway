/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.fund;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author caojiadong
 */
public enum CardRecordStatus implements BaseEnum {
    
    PROPOSED("申请投标"),
                        
    AUDITING("审核中"),
            
    SUCCESSFUL("成功"),
            
    FAILED("失败"),
            
    REJECTED("拒绝");
    
    private final String key;

    private CardRecordStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
