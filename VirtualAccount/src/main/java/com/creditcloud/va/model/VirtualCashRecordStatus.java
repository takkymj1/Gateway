/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.va.model;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 现金账目状态
 * 
 * @author hfp
 */
public enum VirtualCashRecordStatus implements BaseEnum{

    SETTLEED("已结算"),
    
    UNSETTLRD("未结算");
        
    private String key;
        
    private VirtualCashRecordStatus(String key){
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
    
}
