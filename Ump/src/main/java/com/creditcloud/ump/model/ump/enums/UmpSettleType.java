/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model.ump.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * UMP下载对账文件的类型
 * 
 * @author kdliu
 */
public enum UmpSettleType implements BaseEnum {
    RECHARGE("充值对账文件", "01"),
    WITHDRAW("提现对账文件", "02"),
    TENDER_ALL("标的对账文件(全量)", "03"),
    TENDER_TRANSFER("标的转账对账文件", "04"),
    TRANSFER("转账对账文件", "05"),
    USER("托管用户开户对账文件(增量)", "06");
    
    private String key;
    private String code;
    
    UmpSettleType(String key, String code) {
        this.key = key;
        this.code = code;
    }
    
    public String getCode() {
        return code;
    }

    @Override
    public String getKey() {
        return key;
    }
}
