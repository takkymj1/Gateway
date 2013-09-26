/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.user.info;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 车辆及其他交通工具信息
 *
 * @author rooseek
 */
public enum VehicleType implements BaseEnum {

    CAR("轿车"),
    SPORT_CAR("跑车"),
    SUV("SUV越野"),
    BUS("客车"),
    TRUCK("货车"),
    OTHER("其他");
    
    private final String key;

    private VehicleType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
