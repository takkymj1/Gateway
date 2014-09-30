/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model.ump.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author kdliu
 */
public enum SettleRecordState implements BaseEnum{
    INITIALIZED("初始化"),
    PROCESSING("处理中"),
    SUCCESSFUL("成功"),
    FAILED("失败");

    private final String key;
    
    SettleRecordState(String key) {
        this.key = key;
    }
    
    @Override
    public String getKey() {
        return key;
    }
}
