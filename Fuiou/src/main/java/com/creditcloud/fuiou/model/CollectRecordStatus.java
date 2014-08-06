/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.fuiou.model;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author kdliu
 */
public enum CollectRecordStatus implements BaseEnum{
    INITIALIZED("初始化"),
    PROCESSING("处理中"),
    SUCCESS("成功"),
    FAIL("失败"),
    ERROR("错误"),
    REMOVED("作废");

    private final String key;

    private CollectRecordStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
