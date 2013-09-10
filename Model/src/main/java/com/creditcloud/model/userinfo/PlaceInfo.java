/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.userinfo;

import com.creditcloud.model.BaseObject;

/**
 *
 * @author rooseek
 */
public class PlaceInfo extends BaseObject {
    //籍贯省

    private final String nativeProvince;

    //籍贯市
    private final String nativeCity;

    //户口所在省
    private final String hukouProvince;

    //户口所在市
    private final String hukouCity;

    //现居住地址
    private final String currentAddress;

    //现居住地址电话
    private final String currentPhone;

    /**
     *
     * @param nativeProvince 籍贯省
     * @param nativeCity 籍贯市
     * @param hukouProvince 户口所在省
     * @param hukouCity 户口所在市
     * @param currentAddress 现居住地址
     * @param currentPhone 现居住地址电话,可以为空
     */
    public PlaceInfo(String nativeProvince,
                     String nativeCity,
                     String hukouProvince,
                     String hukouCity,
                     String currentAddress,
                     String currentPhone) {
        this.nativeProvince = nativeProvince;
        this.nativeCity = nativeCity;
        this.hukouProvince = hukouProvince;
        this.hukouCity = hukouCity;
        this.currentAddress = currentAddress;
        this.currentPhone = currentPhone;
    }

    public String getNativeProvince() {
        return nativeProvince;
    }

    public String getNativeCity() {
        return nativeCity;
    }

    public String getHukouProvince() {
        return hukouProvince;
    }

    public String getHukouCity() {
        return hukouCity;
    }


    public String getCurrentAddress() {
        return currentAddress;
    }

    public String getCurrentPhone() {
        return currentPhone;
    }
}
