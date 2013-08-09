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

    /**
     * 街道地址
     */
    @NotNull
    private String address;
    
    /**
     * 经度
     */
    private BigDecimal longtitude;
    
    /**
     * 维度
     */
    private BigDecimal latitude;
    
    public Location() {
    }

    public Location(String address,
                    BigDecimal longtitude,
                    BigDecimal latitude) {
        this.address = address;
        this.longtitude = longtitude;
        this.latitude = latitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigDecimal getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(BigDecimal longtitude) {
        this.longtitude = longtitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }
}
