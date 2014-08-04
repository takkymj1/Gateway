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
    INITIALIZED("初始"),
    PROCESSING("处理中"),
    SUCCESSFUL("成功"),
    FAILED("失败");

    private final String key;

    private CollectRecordStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
