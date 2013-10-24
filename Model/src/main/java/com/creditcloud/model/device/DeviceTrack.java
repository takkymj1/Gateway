/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.device;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.GPSCoordinates;
import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.ws.rs.FormParam;

/**
 *
 * @author suetming
 */
public class DeviceTrack extends BaseObject implements GPSCoordinates {
   
    private static final long serialVersionUID = 20130918L;
    
    @NotNull
    @FormParam("id")
    private String id;
    
    @FormParam("trackingTime")
    @NotNull
    private Date trackingTime;
    
    @FormParam("latitude")
    @NotNull
    private BigDecimal latitude;
    
    @FormParam("longitude")
    @NotNull
    private BigDecimal longitude;
    
    @FormParam("location")
    @NotNull
    private String location;
    
    public DeviceTrack() {
    }
    
    public DeviceTrack(String id,
                  String location,
                  BigDecimal latitude,
                  BigDecimal longitude,
                  Date trackingTime) {
        this.id = id;
        this.location = location;
        this.latitude = latitude;
        this.longitude = longitude;
        this.trackingTime = trackingTime;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the trackingTime
     */
    public Date getTrackingTime() {
        return trackingTime;
    }

    /**
     * @param trackingTime the trackingTime to set
     */
    public void setTrackingTime(Date trackingTime) {
        this.trackingTime = trackingTime;
    }

    /**
     * @return the latitude
     */
    @Override
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * @param latitude the latitude to set
     */
    @Override
    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    /**
     * @return the longitude
     */
    @Override
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * @param longitude the longitude to set
     */
    @Override
    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }
    
}
