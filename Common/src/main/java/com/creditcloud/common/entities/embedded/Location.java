/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.entities.embedded;

import com.creditcloud.common.entities.BaseEntity;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.Min;

/**
 * 地址位置信息，为分支机构服务地址或者实地信审用地址
 * 
 * @author sobranie
 */
@Embeddable
public class Location extends BaseEntity {

    @Column(nullable = false)
    private String province;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String streetAddress;

    private String roomAddress;

    @Min(0)
    private BigDecimal longitude;

    @Min(0)
    private BigDecimal latitude;

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
    
    public Location() {
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getRoomAddress() {
        return roomAddress;
    }

    public void setRoomAddress(String roomAddress) {
        this.roomAddress = roomAddress;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }
}
