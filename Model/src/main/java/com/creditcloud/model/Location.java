/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model;

import java.math.BigDecimal;
import javax.validation.constraints.NotNull;

/**
 * 表示一个可以在地图上显示的地理位置
 * 
 * @author sobranie
 */
public class Location {
    
    @NotNull
    private final String province;
    
    @NotNull
    private final String city;

    /**
     * 街道地址
     */
    @NotNull
    private final String streetAddress;
    
    /**
     * 门牌地址
     */
    private final String roomAddress;
    
    /**
     * 经度
     */
    private final BigDecimal longtitude;
    
    /**
     * 维度
     */
    private final BigDecimal latitude;

    public Location(String province,
                    String city,
                    String streetAddress,
                    String roomAddress,
                    BigDecimal longtitude,
                    BigDecimal latitude) {
        this.province = province;
        this.city = city;
        this.streetAddress = streetAddress;
        this.roomAddress = roomAddress;
        this.longtitude = longtitude;
        this.latitude = latitude;
    }
    
    public String getStreetAddress() {
        return streetAddress;
    }

    public BigDecimal getLongtitude() {
        return longtitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public String getProvince() {
        return province;
    }

    public String getCity() {
        return city;
    }
    public String getRoomAddress() {
        return roomAddress;
    }
}
