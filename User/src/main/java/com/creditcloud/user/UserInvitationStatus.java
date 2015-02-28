/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.user;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author chai
 */
public enum UserInvitationStatus implements BaseEnum{
    ACTIVATED("已激活"),
    
    UNACTIVATED("未激活"),
    
    DELETED("已作废");
    
    private final String key;
    
    private UserInvitationStatus(String key){
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
