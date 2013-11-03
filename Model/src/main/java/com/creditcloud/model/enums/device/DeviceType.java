/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.device;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 移动设备类型
 *
 * @author sobranie
 */
public enum DeviceType implements BaseEnum {

    ANDROID_PAD_GENERIC("Android通用功能平板");

    private final String key;

    private DeviceType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}