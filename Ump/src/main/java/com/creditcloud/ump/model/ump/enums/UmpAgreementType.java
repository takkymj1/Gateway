/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model.ump.enums;

import com.creditcloud.model.enums.BaseEnum;
import com.creditcloud.model.util.Enums;

/**
 * UMP的用户协议类型
 * 
 * @author kdliu
 */
public enum UmpAgreementType implements BaseEnum {
    ZCZP0800("无密快捷协议"),
    ZTBB0G00("无密投资协议"),
    ZHKB0H01("无密还款协议"),
    ZKJP0700("借记卡快捷协议");
    
    private final String key;
    
    UmpAgreementType(String key) {
        this.key = key;
    }
    
    public String getKey() {
        return key;
    }
    
    public static UmpAgreementType getEnum(String key) {
        return Enums.getEnumByKey(UmpAgreementType.class, key);
    }
}
