/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.va.model;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 虚拟账户状态
 * 
 * @author hfp
 */
public enum VirtualBookingRecordStatus implements BaseEnum{

    /**
     * 
     */
    REVOCATION("撤销的"),
      
    /**
     * 未结算
     */
    UNSETTLRD("未结算"),
    
    /**
     * 已经结算
     */
    SETTLED("已结算"),
    
    /**
     * 已经标记
     */
    MARKED("已标记");

    private String key;
        
    private VirtualBookingRecordStatus(String key){
        this.key = key;
    }
    
    @Override
    public String getKey() {
        return key;
    }
    
}
