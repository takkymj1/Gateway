/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model;

import java.math.BigDecimal;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 表示一个可以在地图上显示的地理位置
 *
 * @author sobranie
 */
@XmlRootElement
public class Location extends BaseObject {

    private static final long serialVersionUID = 20130918L;

    @NotNull
    private String province;

    @NotNull
    private String city;

    /**
     * 街道地址
     */
    @NotNull
    private String streetAddress;

    /**
     * 门牌地址
     */
    private String roomAddress;

    /**
     * 经度
     */
    private BigDecimal longitude;

    /**
     * 维度
     */
    private BigDecimal latitude;

    public Location() {
    }

    public Location(String province,
                    String city,
                    String streetAddress,
                    String roomAddress,
                    BigDecimal longitude,
                    BigDecimal latitude) {
        this.province = province;
        this.city = city;
        this.streetAddress = streetAddress;
        this.roomAddress = roomAddress;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public String getStreetAddress() {
        return streetAddress;
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

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void setRoomAddress(String roomAddress) {
        this.roomAddress = roomAddress;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }
}
