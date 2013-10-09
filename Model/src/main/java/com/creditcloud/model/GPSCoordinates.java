/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model;

import java.math.BigDecimal;

/**
 * GPS定位的经纬度
 *
 * @author rooseek
 */
public interface GPSCoordinates {

    /**
     * get longitude
     *
     * @return
     */
    BigDecimal getLongitude();

    /**
     * get latitude
     *
     * @return
     */
    BigDecimal getLatitude();

    /**
     * set longitude
     *
     * @param longitude
     */
    void setLongitude(BigDecimal longitude);

    /**
     * set latitude
     *
     * @param latitude
     */
    void setLatitude(BigDecimal latitude);
}
